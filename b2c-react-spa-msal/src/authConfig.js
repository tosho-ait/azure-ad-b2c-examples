// Config object to be passed to Msal on creation
export const msalConfig = {
    auth: {
        clientId: "91ef4356-d076-40d0-bde1-677f0b463251",
        authority: "https://viamedisdev.b2clogin.com/viamedisdev.onmicrosoft.com/B2C_1_SUSI",
        knownAuthorities: ["viamedisdev.b2clogin.com"],
        redirectUri: "http://localhost:6420",
        postLogoutRedirectUri: "http://localhost:6420"
    }
};

// Scopes you add here will be prompted for consent during login
export const loginRequest = {
    scopes: ["https://viamedisdev.onmicrosoft.com/97ff4c34-8fef-4968-ba8b-a544a68875d4/viapi.access"]
};
