/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aka extends ana {
    private int field_D;
    private fk field_C;
    private taa field_v;
    private cf field_z;
    private kv field_B;
    private dda field_A;
    static vr field_w;
    static kv field_E;
    static vm field_G;
    static String field_y;
    static lda field_x;

    public static void e(byte param0) {
        boolean discarded$0 = false;
        field_G = null;
        field_y = null;
        field_w = null;
        field_E = null;
        field_x = null;
        if (param0 >= -91) {
            discarded$0 = aka.a(-64, -126, 88, (byte) 79);
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        ad var3 = null;
        if (!this.field_v.a((byte) -106)) {
          L0: {
            if (li.field_l != this.field_z) {
              break L0;
            } else {
              if (!this.field_A.field_h) {
                this.field_A.a(0);
                return false;
              } else {
                this.field_z = fn.field_m;
                wf.a(28, (byte) 3);
                break L0;
              }
            }
          }
          L1: {
            if (this.field_z == fn.field_m) {
              if (!this.field_A.field_h) {
                if (75 != this.field_l) {
                  break L1;
                } else {
                  var3 = this.field_C.field_l.a(-27449, this.field_q);
                  var3.field_s.j(-105);
                  var3.field_s.field_A = false;
                  var3.field_j = 0;
                  break L1;
                }
              } else {
                return false;
              }
            } else {
              break L1;
            }
          }
          fieldTemp$2 = this.field_l - 1;
          this.field_l = this.field_l - 1;
          if ((fieldTemp$2 ^ -1) >= -1) {
            if (fn.field_m == this.field_z) {
              this.field_v = new taa(this.field_q, this.field_C.field_q, this.field_C.field_r);
              this.a(27799, this.field_v);
              this.field_z = qn.field_i;
              this.field_l = 40;
              return false;
            } else {
              L2: {
                if (this.field_z == qn.field_i) {
                  this.field_z = sv.field_a;
                  this.field_A.c((byte) -19);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (this.field_D < mp.field_q.length) {
                fieldTemp$3 = this.field_D;
                this.field_D = this.field_D + 1;
                this.a(-1, fieldTemp$3);
                this.field_l = this.field_l + 30;
                var2 = 96 % ((71 - param0) / 47);
                return false;
              } else {
                this.d(14481);
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        ad var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        op var16 = null;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var15 = BachelorFridge.field_y;
        var16 = this.field_q.field_h;
        var4 = var16.field_z;
        var5 = var16.field_B;
        var6 = this.field_C.field_l.a(-27449, this.field_q);
        var7 = sj.field_l[param1];
        var8 = mp.field_q.length + param0;
        var9 = -var8;
        L0: while (true) {
          if (var8 < var9) {
            return;
          } else {
            var10 = -var8;
            L1: while (true) {
              if (var10 > var8) {
                var9++;
                continue L0;
              } else {
                var11 = var9 + this.field_C.field_q;
                var12 = this.field_C.field_r - -var10;
                if (0 <= var11) {
                  if (var4 > var11) {
                    if (-1 >= (var12 ^ -1)) {
                      if (var5 > var12) {
                        L2: {
                          if (-1 < (var9 ^ -1)) {
                            stackOut_14_0 = -var9;
                            stackIn_15_0 = stackOut_14_0;
                            break L2;
                          } else {
                            stackOut_13_0 = var9;
                            stackIn_15_0 = stackOut_13_0;
                            break L2;
                          }
                        }
                        L3: {
                          stackOut_15_0 = stackIn_15_0;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (-1 >= (var10 ^ -1)) {
                            stackOut_17_0 = stackIn_17_0;
                            stackOut_17_1 = var10;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L3;
                          } else {
                            stackOut_16_0 = stackIn_16_0;
                            stackOut_16_1 = -var10;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            break L3;
                          }
                        }
                        var13 = stackIn_18_0 + stackIn_18_1;
                        if (var13 == param1) {
                          L4: {
                            if (var13 != 0) {
                              var14 = new uea(this.field_q, var11, var12, var7);
                              break L4;
                            } else {
                              var14 = new dw(this.field_q, var11, var12);
                              break L4;
                            }
                          }
                          ((kj) (var14)).a(param0 + 1);
                          this.a(var11, var12, var6, param0 + 1);
                          var10++;
                          continue L1;
                        } else {
                          var10++;
                          continue L1;
                        }
                      } else {
                        var10++;
                        continue L1;
                      }
                    } else {
                      var10++;
                      continue L1;
                    }
                  } else {
                    var10++;
                    continue L1;
                  }
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void d(int param0) {
        if (param0 != 14481) {
            this.a(-47, -111);
        }
    }

    final void c(int param0) {
        int var2 = 0;
        ad var3_ref_ad = null;
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        aj var10 = null;
        int var3 = 0;
        int var9 = BachelorFridge.field_y;
        if (fn.field_m == this.field_z) {
            var2 = this.field_l;
            var3_ref_ad = this.field_C.field_l.a(-27449, this.field_q);
            var4 = this.field_q.field_s.a(var3_ref_ad.field_s.field_J, (byte) 33, var3_ref_ad.field_s.field_x);
            var5 = (-var2 + 150) * ((150 + -var2) * 400) / 22500;
            dg.a(fr.field_p);
            var6 = 32 + var4.field_a;
            dg.a(0, 0, 640, var6);
            this.field_B.b(var4.field_c, 30 + (var4.field_a - var5));
            var7 = new int[]{35, 35, 36, 37, 38, 39, 41, 43, 45, 48, 52, 56};
            for (var8 = 0; var8 < var7.length; var8++) {
                dg.a(var4.field_c - -var7[var8], var6 - -var8, var4.field_c - (-128 - -var7[var8]), 1 + (var8 + var6));
                this.field_B.b(var4.field_c, 30 + (var4.field_a - var5));
            }
            dg.b(fr.field_p);
            return;
        }
        if (this.field_z == qn.field_i) {
            var10 = this.field_q.field_s.a(this.field_C.field_r, (byte) -112, this.field_C.field_q);
            var3 = 400 * this.field_l / 40;
            this.field_B.e(var10.field_c, 60 + -this.field_B.field_o + -var3 + var10.field_a);
        }
        if (param0 > -10) {
            this.d(53);
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        boolean discarded$0 = false;
        if (param3 > -80) {
            discarded$0 = aka.a(22, 90, 31, (byte) -58);
        }
        return nv.a(param1, param2, -106, param0);
    }

    aka(gj param0, fk param1) {
        super(param0, param1);
        aga var3 = null;
        try {
            this.field_C = param1;
            this.field_v = this.field_m;
            this.field_z = li.field_l;
            this.field_B = de.field_F.a();
            this.field_l = 150;
            var3 = this.field_C.field_l.a(34, this.field_q.field_h);
            this.field_A = new dda(this.field_q, var3.field_x, var3.field_J);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "aka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = "Offline";
    }
}
