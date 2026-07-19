/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pna extends gda {
    float field_f;
    float field_e;
    float field_r;
    float field_s;
    float field_h;
    float field_j;
    float field_l;
    float field_o;
    float field_g;
    static String field_k;
    float field_i;
    float field_n;
    static boolean field_p;
    float field_m;
    static int field_q;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = ph.field_c[16383 & param3];
        float var8 = ph.field_n[param3 & 16383];
        float var9 = ph.field_c[param4 & 16383];
        float var10 = ph.field_n[param4 & 16383];
        float var11 = ph.field_c[16383 & param5];
        float var12 = ph.field_n[param5 & 16383];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field_j = var10 * var12 + var13 * var9;
        this.field_s = var11 * var7;
        this.field_f = var7 * var9;
        this.field_i = var12 * var7;
        this.field_r = var10 * var7;
        this.field_g = var9 * var11 + var14 * var10;
        this.field_h = var10 * var13 + -var9 * var12;
        this.field_o = -var8;
        this.field_n = var9 * var14 + -var10 * var11;
        this.field_e = (float)(-param0) * this.field_h - (float)param1 * this.field_s - (float)param2 * this.field_j;
        this.field_l = -(this.field_i * (float)param1) + (float)(-param0) * this.field_g - (float)param2 * this.field_n;
        this.field_m = -(this.field_o * (float)param1) + (float)(-param0) * this.field_r - this.field_f * (float)param2;
    }

    final void a() {
        this.field_l = 0.0f;
        this.field_n = 0.0f;
        this.field_o = 0.0f;
        this.field_m = 0.0f;
        this.field_j = 0.0f;
        this.field_i = 0.0f;
        this.field_f = 1.0f;
        this.field_g = 1.0f;
        this.field_e = 0.0f;
        this.field_r = 0.0f;
        this.field_s = 1.0f;
        this.field_h = 0.0f;
    }

    final void d(int param0) {
        float var2 = ph.field_c[16383 & param0];
        float var3 = ph.field_n[param0 & 16383];
        float var4 = this.field_g;
        float var5 = this.field_i;
        float var6 = this.field_n;
        this.field_g = var3 * this.field_r + var4 * var2;
        float var7 = this.field_l;
        this.field_i = var2 * var5 + this.field_o * var3;
        this.field_r = -(var4 * var3) + var2 * this.field_r;
        this.field_o = this.field_o * var2 - var3 * var5;
        this.field_n = var2 * var6 + var3 * this.field_f;
        this.field_f = -(var3 * var6) + this.field_f * var2;
        this.field_l = var2 * var7 + this.field_m * var3;
        this.field_m = -(var7 * var3) + var2 * this.field_m;
    }

    public static void e(int param0) {
        int var1 = -86 / ((param0 - 40) / 50);
        field_k = null;
    }

    final void c(int param0) {
        float var2 = ph.field_c[param0 & 16383];
        float var3 = ph.field_n[16383 & param0];
        float var4 = this.field_h;
        float var5 = this.field_s;
        float var6 = this.field_j;
        float var7 = this.field_e;
        this.field_h = -(this.field_r * var3) + var4 * var2;
        this.field_s = var5 * var2 - this.field_o * var3;
        this.field_r = var4 * var3 + var2 * this.field_r;
        this.field_o = var3 * var5 + this.field_o * var2;
        this.field_j = -(var3 * this.field_f) + var6 * var2;
        this.field_e = -(this.field_m * var3) + var2 * var7;
        this.field_f = var3 * var6 + var2 * this.field_f;
        this.field_m = var2 * this.field_m + var7 * var3;
    }

    pna() {
        this.a();
    }

    final void a(int param0, int param1, int param2) {
        this.field_l = this.field_l + (float)param0;
        this.field_m = this.field_m + (float)param2;
        this.field_e = this.field_e + (float)param1;
    }

    final void b(int param0) {
        float var2 = ph.field_c[16383 & param0];
        float var3 = ph.field_n[param0 & 16383];
        float var4 = this.field_g;
        float var5 = this.field_i;
        float var6 = this.field_n;
        float var7 = this.field_l;
        this.field_g = var4 * var2 - this.field_h * var3;
        this.field_i = var5 * var2 - var3 * this.field_s;
        this.field_h = var2 * this.field_h + var4 * var3;
        this.field_s = var2 * this.field_s + var5 * var3;
        this.field_n = -(this.field_j * var3) + var6 * var2;
        this.field_l = -(this.field_e * var3) + var2 * var7;
        this.field_j = var3 * var6 + var2 * this.field_j;
        this.field_e = this.field_e * var2 + var3 * var7;
    }

    static {
        field_k = "Pistols contain unlimited bullets, and can be used to dispatch skeletons and propel blocks. Press <img=12><img=13><img=14><img=15> to fire.";
        field_q = 20;
    }
}
