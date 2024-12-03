/===============================================  toggle icon navbar  ========================================================/
let menuIcon = document.querySelector('#menu-icon');
let navbar = document.querySelector('#navbar');  // Perbaiki selector dari '-navbar' menjadi '#navbar'

menuIcon.onclick = () => {
    menuIcon.classList.toggle('fa-xmark');  // Perbaiki 'toogle' menjadi 'toggle'
    navbar.classList.toggle('active');  // Perbaiki 'toogle' menjadi 'toggle'
}

/=============================================== scroll section active link ========================================================/
let sections = document.querySelectorAll('section');  // Perbaiki 'querySelectorSelectionAll' menjadi 'querySelectorAll'
let navLinks = document.querySelectorAll('header nav a');  // Perbaiki penulisan 'NavLinks' menjadi 'navLinks'

window.onscroll = () => {  // Perbaiki 'windows' menjadi 'window'
    sections.forEach(sec => {  // Perbaiki 'foeEach' menjadi 'forEach'
        let top = window.scrollY;  // Perbaiki 'windows' menjadi 'window'
        let offset = sec.offsetTop - 150;
        let height = sec.offsetHeight;
        let id = sec.getAttribute('id');

        if (top >= offset && top <= offset + height) {  // Perbaiki kondisi 'top <= offset && offset + height'
            navLinks.forEach(link => {  // Perbaiki 'links' menjadi 'link'
                link.classList.remove('active');
                document.querySelector('header nav a[href*="' + id + '"]').classList.add('active');  // Perbaiki sintaksis
            });
        }
    });

    /============================================= sticky navbar  ========================================================/
    let header = document.querySelector('header');  // Perbaiki 'heade' menjadi 'header'
    header.classList.toggle('sticky', window.scrollY > 100);  // Perbaiki 'windows.onscrollY' menjadi 'window.scrollY'

    /=============================================== remove toggle icon and navbar ========================================================/
    menuIcon.classList.remove('fa-xmark');
    navbar.classList.remove('active');
}

/=============================================== scroll reveal  ========================================================/
ScrollReveal({ 
    reset: true  // Set 'reset' untuk memperlihatkan animasi saat scroll ke atas
});

ScrollReveal().reveal('.home-content, .heading', { origin: 'top' });
ScrollReveal().reveal('.home-img, .services-container, .portofolio-box, .contact-form', { origin: 'bottom' });
ScrollReveal().reveal('.home-contact h1, .about-img', { origin: 'left' });
ScrollReveal().reveal('.home-contact p, .about-content', { origin: 'right' });

/=============================================== typed js  ========================================================/
const typed = new Typed('.multiple-text', {
    strings: ['Frontend Development', 'Web Design', 'YouTuber'],
    typeSpeed: 70,
    backSpeed: 70,
    backDelay: 1000,
    loop: true,
});