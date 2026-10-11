/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bn extends sb {
    private final void a(mb param0, ul param1, ul param2, int param3, int param4, boolean[] param5, boolean param6, boolean param7, int param8, int[] param9) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var31Lifetime1;
        int var31Lifetime2;
        int var14Lifetime1Lifetime1;
        if (param2 != null &&
          param3 != 0) {
          var34 = 0;
          var11 = var34;
          var35 = 0;
          var12 = var35;
          var36 = 0;
          var13 = var36;
          while (var36 < param0.field_o) {
            var14 = 0;
            if (var34 < param1.field_l &&
              param1.field_f[var34] == var36) {
              var14 = 1;
            }
            var15 = 0;
            if (var35 < param2.field_l &&
              param2.field_f[var35] == var36) {
              var15 = 1;
            }
            if (var14 != 0 ||
              var15 != 0) {
              if (param5 != null &&
                param5[var36] != param6 &&
                param0.field_r[var36] != 0) {
                if (var14 != 0) {
                  var34++;
                }
                if (var15 != 0) {
                  var35++;
                }
              } else {
                var16 = 0;
                var17 = param0.field_r[var36];
                if (var17 == 3) {
                  var16 = 128;
                }
                if (var14 == 0) {
                  var18 = var16;
                  var19 = var16;
                  var20 = var16;
                  var21 = -1;
                  var22 = 0;
                } else {
                  var18 = param1.field_d[var34];
                  var19 = param1.field_n[var34];
                  var20 = param1.field_k[var34];
                  var21 = param1.field_e[var34];
                  var22 = param1.field_g[var34];
                  var34++;
                }
                if (var15 == 0) {
                  var23 = var16;
                  var24 = var16;
                  var25 = var16;
                  var26 = -1;
                  var27 = 0;
                } else {
                  var23 = param2.field_d[var35];
                  var24 = param2.field_n[var35];
                  var25 = param2.field_k[var35];
                  var26 = param2.field_e[var35];
                  var27 = param2.field_g[var35];
                  var35++;
                }
                if ((var22 & 2) == 0 &&
                  (var27 & 1) == 0) {
                  if (var17 != 2) {
                    if (var17 != 7) {
                      var28 = var18 + (var23 - var18) * param3 / param4;
                      var29 = var19 + (var24 - var19) * param3 / param4;
                      var30 = var20 + (var25 - var20) * param3 / param4;
                    } else {
                      var31 = var23 - var18 & 63;
                      if (var31 >= 32) {
                        var31 -= 64;
                      }
                      var28 = var18 + var31 * param3 / param4 & 63;
                      var29 = var19 + (var24 - var19) * param3 / param4;
                      var30 = var20 + (var25 - var20) * param3 / param4;
                    }
                  } else {
                    var31 = var23 - var18 & 2047;
                    var32 = var24 - var19 & 2047;
                    var33 = var25 - var20 & 2047;
                    if (var31 >= 1024) {
                      var31 -= 2048;
                    }
                    if (var32 >= 1024) {
                      var32 -= 2048;
                    }
                    if (var33 >= 1024) {
                      var33 -= 2048;
                    }
                    var28 = var18 + var31 * param3 / param4 & 2047;
                    var29 = var19 + var32 * param3 / param4 & 2047;
                    var30 = var20 + var33 * param3 / param4 & 2047;
                  }
                } else {
                  var28 = var18;
                  var29 = var19;
                  var30 = var20;
                }
                if (var21 == -1) {
                  if (var26 != -1) {
                    var31Lifetime1 = param8 & param0.field_u[var26];
                    if (var31Lifetime1 == 65535) {
                      this.a(0, param0.field_p[var26], 0, 0, 0, param7);
                    } else {
                      this.a(0, param0.field_p[var26], 0, 0, 0, param7, var31Lifetime1, param9);
                    }
                  }
                } else {
                  var31Lifetime1 = param8 & param0.field_u[var21];
                  if (var31Lifetime1 == 65535) {
                    this.a(0, param0.field_p[var21], 0, 0, 0, param7);
                  } else {
                    this.a(0, param0.field_p[var21], 0, 0, 0, param7, var31Lifetime1, param9);
                  }
                }
                var31Lifetime2 = param8 & param0.field_u[var36];
                if (var31Lifetime2 == 65535) {
                  this.a(var17, param0.field_p[var36], var28, var29, var30, param7);
                } else {
                  this.a(var17, param0.field_p[var36], var28, var29, var30, param7, var31Lifetime2, param9);
                }
              }
            }
            var36++;
          }
          return;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param1.field_l; var11Lifetime1++) {
          var12Lifetime1 = param1.field_f[var11Lifetime1];
          if (param5 == null ||
            param5[var12Lifetime1] == param6 ||
            param0.field_r[var12Lifetime1] == 0) {
            var13Lifetime1 = param1.field_e[var11Lifetime1];
            if (var13Lifetime1 != -1) {
              var14Lifetime1 = param8 & param0.field_u[var13Lifetime1];
              if (var14Lifetime1 == 65535) {
                this.a(0, param0.field_p[var13Lifetime1], 0, 0, 0, param7);
              } else {
                this.a(0, param0.field_p[var13Lifetime1], 0, 0, 0, param7, var14Lifetime1, param9);
              }
            }
            var14Lifetime1Lifetime1 = param8 & param0.field_u[var12Lifetime1];
            if (var14Lifetime1Lifetime1 == 65535) {
              this.a(param0.field_r[var12Lifetime1], param0.field_p[var12Lifetime1], (int) param1.field_d[var11Lifetime1], (int) param1.field_n[var11Lifetime1], (int) param1.field_k[var11Lifetime1], param7);
            } else {
              this.a(param0.field_r[var12Lifetime1], param0.field_p[var12Lifetime1], (int) param1.field_d[var11Lifetime1], (int) param1.field_n[var11Lifetime1], (int) param1.field_k[var11Lifetime1], param7, var14Lifetime1Lifetime1, param9);
            }
          }
        }
    }

    abstract bn a(boolean param0, boolean param1, boolean param2);

    abstract boolean a();

    bn() {
    }

    final void a(ei param0, int param1, ei param2, int param3, int param4, int param5, boolean param6) {
        if (param1 == -1) {
          return;
        }
        if (!this.a()) {
          return;
        }
        ul var8 = param0.field_t[param1];
        mb var9 = var8.field_a;
        Object var10 = null;
        if (param2 != null) {
          var10 = param2.field_t[param3];
          if (((ul) (var10)).field_a != var9) {
            var10 = null;
          }
        }
        this.a(var9, var8, (ul) (var10), param4, param5, (boolean[]) null, false, param6, 65535, (int[]) null);
        this.b();
    }

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7);

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5);

    abstract void b();
}
