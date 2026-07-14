/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    int field_q;
    static ck field_i;
    int field_h;
    private boolean field_e;
    int field_o;
    mm field_p;
    int field_c;
    static vj field_r;
    gl field_b;
    int field_d;
    int field_n;
    gl field_l;
    int field_f;
    gl field_g;
    gl field_a;
    gl field_k;
    private int field_j;
    static ck[] field_m;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 23302) {
            return;
        }
        field_r = null;
        field_i = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        hk.a(param6, param1, param3, param4, param5, param2);
        int var8 = -40 / ((param0 - -68) / 42);
    }

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (!fd.field_d.startsWith("win")) {
                break L0;
              } else {
                if (fc.a((byte) -19, param1)) {
                  return;
                } else {
                  break L0;
                }
              }
            }
            try {
              L1: {
                param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                if (param0 > 72) {
                  break L1;
                } else {
                  field_m = null;
                  break L1;
                }
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              qb.a((Throwable) null, 16408, "MGR1: " + param1);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, mm param1) {
        int var7_int = 0;
        int var15 = client.field_A ? 1 : 0;
        a var17 = new a(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_K + param1.field_R);
        var17.field_q = 16777215;
        ((c) this).field_k = (gl) (Object) var17;
        bc var4 = new bc();
        var17.a(-12253, (a) (Object) var4);
        var4.field_c = 11711154;
        var4.field_v = 15658734;
        ((c) this).field_h = 3;
        ((c) this).field_p = param1;
        ((c) this).field_j = 15658734;
        ((c) this).field_n = -1;
        ((c) this).field_c = 3;
        ((c) this).field_f = 5592405;
        ((c) this).field_o = 15658734;
        ((c) this).field_d = 3;
        ((c) this).field_q = 3;
        sn discarded$0 = var4.a(0, 117).a(15658734, (byte) 106).a(120, fl.a(7829367, 8947848, 10066329, 32140));
        sn discarded$1 = var4.a(1, param0 ^ 13421780).a(-50, fl.a(13421772, 11184810, 10066329, 32140));
        sn discarded$2 = var4.a(3, 101).a(121, fl.a(10066329, 8947848, 7829367, 32140)).c(-1, 1).a(1, -2147483648);
        ck[] var5 = new ck[9];
        ld var16 = new ld(32, 32);
        ld var18 = var16;
        for (var7_int = 0; var18.field_D.length > var7_int; var7_int++) {
            var16.field_D[var7_int] = 1077952576;
        }
        var5[4] = (ck) (Object) var18;
        sn discarded$3 = var4.a(4, 25).a(param0 + -13438370, true).a(113, var5);
        sn discarded$4 = var4.a(5, 44).a(param0 ^ 13421739, ta.a(false, 0, 65793, 0, 0)).a(param0 + -13438370, true).a(-1, (byte) 106);
        ((c) this).field_b = (gl) (Object) var4;
        bc var6 = new bc(var4, true);
        var6.field_f = 0;
        bc var7 = new bc(var4, true);
        var7.field_f = 0;
        var7.a(qm.a(9, 8947848), false);
        sn discarded$5 = var7.a(1, 95).a(-128, qm.a(9, 11184810)).a(2236962, (byte) 106);
        ((c) this).field_a = (gl) (Object) new kk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        al discarded$6 = new al(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        qj discarded$7 = new qj(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        bc var8 = new bc();
        var17.a(-12253, (a) (Object) var8);
        sn discarded$8 = var8.a(0, 78).a(param0 ^ -13421740, fl.a(10066329, 15658734, 7829367, param0 + -13389632)).a(1118481, (byte) 106).b(-83, -1);
        sn discarded$9 = var8.a(4, param0 ^ 13421812).a(-16598, true).a(-27, var5);
        ((c) this).field_l = (gl) (Object) var8;
        ck[] var9 = new ck[9];
        var9[4] = new ck(2, 1);
        ck[] var10 = new ck[9];
        var10[4] = new ck(1, 2);
        var9[4].field_D = new int[]{6710886, 7829367};
        var10[4].field_D = new int[]{6710886, 7829367};
        bc var11 = new bc();
        bc var12 = new bc();
        var11.a(119, var9, 0);
        var12.a(param0 ^ 13421750, var10, 0);
        ck var13 = new ck(7, 4);
        var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        bc var14 = new bc(var4, true);
        var14.a(var13.c(), 2);
        var13.d();
        var14 = new bc(var4, true);
        var14.a(var13.c(), 2);
        var13.d();
        var14 = new bc(var4, true);
        var14.a(var13.c(), 2);
        var13.d();
        bc var19 = new bc(var4, true);
        var19.a(var13, 2);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param0 < 50) {
          return;
        } else {
          L0: {
            var5 = ((c) this).field_p.a(param1);
            var6 = ((c) this).field_p.field_K + ((c) this).field_p.field_C;
            var7 = param2;
            if (hk.field_j < var7 + (var5 - -6)) {
              var7 = -var5 + (hk.field_j + -6);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var8 = 32 + (-((c) this).field_p.field_C + param3);
            if (hk.field_i >= var8 - (-var6 + -6)) {
              break L1;
            } else {
              var8 = -6 + hk.field_i - var6;
              break L1;
            }
          }
          hk.f(var7, var8, var5 + 6, 6 + var6, ((c) this).field_j);
          hk.a(1 + var7, var8 - -1, var5 - -4, 4 + var6, ((c) this).field_f);
          ((c) this).field_p.a(param1, var7 + 3, var8 - (-3 + -((c) this).field_p.field_C), ((c) this).field_j, -1);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 111 % ((param4 - -23) / 54);
        hk.b(param2, param1, param0, param5, param3);
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var5 = ((c) this).field_c + ((c) this).field_d;
          var6 = ((c) this).field_h + ((c) this).field_q;
          var7 = ((c) this).field_n;
          if (var7 == -1) {
            var7 = ((c) this).field_p.field_K + ((c) this).field_p.field_R;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 16521) {
          var8 = hk.field_j >> 631180802;
          var9 = ((c) this).field_p.a(param2);
          var10 = ((c) this).field_p.field_R + ((c) this).field_p.field_K;
          var11 = 1;
          if (var9 > var8) {
            L1: {
              if (var8 < var9) {
                var13 = var9 / var8;
                var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
                break L1;
              } else {
                var12 = var8;
                break L1;
              }
            }
            L2: {
              if (el.field_L == null) {
                el.field_L = new String[16];
                break L2;
              } else {
                break L2;
              }
            }
            var11 = ((c) this).field_p.a(param2, new int[1], el.field_L);
            var10 = var10 + (-1 + var11) * var7;
            var9 = 0;
            var13 = 0;
            L3: while (true) {
              if (var11 > var13) {
                var14 = ((c) this).field_p.a(el.field_L[var13]);
                if (var14 > var9) {
                  var9 = var14;
                  var13++;
                  continue L3;
                } else {
                  var13++;
                  continue L3;
                }
              } else {
                L4: {
                  var12 = param0;
                  if (var5 + var12 + var9 > hk.field_j) {
                    var12 = hk.field_j + (-var9 + -var5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var13 = 32 + param3 + -((c) this).field_p.field_C;
                  if (hk.field_i >= var13 - (-var10 + -var6)) {
                    break L5;
                  } else {
                    var13 = -var6 + (param3 - var10);
                    break L5;
                  }
                }
                hk.f(var12, var13, var5 + var9, var10 - -var6, ((c) this).field_o);
                hk.a(1 + var12, 1 + var13, var5 + (var9 - 2), var10 - (-var6 + 2), ((c) this).field_f);
                int discarded$3 = ((c) this).field_p.a(param2, ((c) this).field_c + var12, ((c) this).field_q + var13, var9, var10, ((c) this).field_j, -1, 0, 0, var7);
                return;
              }
            }
          } else {
            if (-1 == param2.indexOf("<br>")) {
              L6: {
                var12 = param0;
                if (var5 + var12 + var9 > hk.field_j) {
                  var12 = hk.field_j + (-var9 + -var5);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var13 = 32 + param3 + -((c) this).field_p.field_C;
                if (hk.field_i >= var13 - (-var10 + -var6)) {
                  break L7;
                } else {
                  var13 = -var6 + (param3 - var10);
                  break L7;
                }
              }
              hk.f(var12, var13, var5 + var9, var10 - -var6, ((c) this).field_o);
              hk.a(1 + var12, 1 + var13, var5 + (var9 - 2), var10 - (-var6 + 2), ((c) this).field_f);
              int discarded$4 = ((c) this).field_p.a(param2, ((c) this).field_c + var12, ((c) this).field_q + var13, var9, var10, ((c) this).field_j, -1, 0, 0, var7);
              return;
            } else {
              L8: {
                if (var8 < var9) {
                  var13 = var9 / var8;
                  var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
                  break L8;
                } else {
                  var12 = var8;
                  break L8;
                }
              }
              L9: {
                if (el.field_L == null) {
                  el.field_L = new String[16];
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                var11 = ((c) this).field_p.a(param2, new int[1], el.field_L);
                var10 = var10 + (-1 + var11) * var7;
                var9 = 0;
                var13 = 0;
                if (var11 <= var13) {
                  break L10;
                } else {
                  L11: {
                    var14 = ((c) this).field_p.a(el.field_L[var13]);
                    if (var14 <= var9) {
                      var13++;
                      break L11;
                    } else {
                      var9 = var14;
                      break L11;
                    }
                  }
                  var13++;
                  var13++;
                  var13++;
                  break L10;
                }
              }
              L12: {
                var12 = param0;
                if (var5 + var12 + var9 > hk.field_j) {
                  var12 = hk.field_j + (-var9 + -var5);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                var13 = 32 + param3 + -((c) this).field_p.field_C;
                if (hk.field_i >= var13 - (-var10 + -var6)) {
                  break L13;
                } else {
                  var13 = -var6 + (param3 - var10);
                  break L13;
                }
              }
              hk.f(var12, var13, var5 + var9, var10 - -var6, ((c) this).field_o);
              hk.a(1 + var12, 1 + var13, var5 + (var9 - 2), var10 - (-var6 + 2), ((c) this).field_f);
              int discarded$5 = ((c) this).field_p.a(param2, ((c) this).field_c + var12, ((c) this).field_q + var13, var9, var10, ((c) this).field_j, -1, 0, 0, var7);
              return;
            }
          }
        } else {
          return;
        }
    }

    public c() {
        ((c) this).field_e = true;
    }

    final void a(String param0, int param1, int param2, int param3) {
        if (!((c) this).field_e) {
          this.a(param1 ^ -55, param0, param3, param2);
          if (param1 == -1) {
            return;
          } else {
            ((c) this).a(124, 123, -118, 6, (byte) -71, 127);
            return;
          }
        } else {
          this.a(param3, 16521, param0, param2);
          if (param1 == -1) {
            return;
          } else {
            ((c) this).a(124, 123, -118, 6, (byte) -71, 127);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new vj();
    }
}
