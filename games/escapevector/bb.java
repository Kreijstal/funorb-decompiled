/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends bj {
    static String field_O;
    static java.applet.Applet field_P;
    static cn field_L;
    static int field_H;
    private int field_N;
    static String field_J;
    static String field_K;
    static int[] field_R;
    private tb field_Q;
    boolean field_G;
    static String field_I;

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 == -13907) {
          L0: {
            var2 = this.k(-1);
            var3 = var2 - ((bb) this).field_N;
            if (0 < var3) {
              ((bb) this).field_N = ((bb) this).field_N + (8 + var3 + -1) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 >= (var3 ^ -1)) {
              break L1;
            } else {
              ((bb) this).field_N = ((bb) this).field_N + (1 + (var3 - 16)) / 16;
              break L1;
            }
          }
          L2: {
            L3: {
              if (0 != ((bb) this).field_N) {
                break L3;
              } else {
                if (0 != var2) {
                  break L3;
                } else {
                  if (((bb) this).field_G) {
                    break L3;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          return stackIn_12_0 != 0;
        } else {
          return false;
        }
    }

    final hm a(boolean param0) {
        hm var2 = super.a(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (hm) this;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (0 == ((bb) this).field_N) {
          return;
        } else {
          if (((bb) this).field_N < 256) {
            L0: {
              L1: {
                if (li.field_r == null) {
                  break L1;
                } else {
                  if (li.field_r.field_s < ((bb) this).field_g) {
                    break L1;
                  } else {
                    if (((bb) this).field_x > li.field_r.field_x) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              li.field_r = new ed(((bb) this).field_g, ((bb) this).field_x);
              break L0;
            }
            L2: {
              eo.a(li.field_r, (byte) -76);
              em.d();
              ((bb) this).b(0, 0, (byte) 87);
              super.a(-((bb) this).field_j + -param0, (byte) 118, param2, -((bb) this).field_k + -param3);
              if (param1 > 85) {
                break L2;
              } else {
                field_L = null;
                break L2;
              }
            }
            dl.a((byte) 125);
            li.field_r.d(((bb) this).field_k + param3, ((bb) this).field_j + param0, ((bb) this).field_N);
            return;
          } else {
            if (param2 != 0) {
              return;
            } else {
              ((bb) this).b(((bb) this).field_j + param0, param3 - -((bb) this).field_k, (byte) 89);
              super.a(param0, (byte) 87, param2, param3);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, te param3, int param4, int param5) {
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        L0: {
          var20 = EscapeVector.field_A;
          if (param2 == 4163) {
            break L0;
          } else {
            var21 = null;
            String[] discarded$1 = bb.a(-7, (String) null, 'ﾱ');
            break L0;
          }
        }
        L1: {
          var6 = (param5 - param1 << -164361688) / param3.field_a;
          param0 = param0 + param3.field_f;
          param4 = param4 + param3.field_i;
          var7 = var6 * param3.field_f + (param1 << -2133584440);
          var8 = param4 * em.field_l + param0;
          var9 = 0;
          var10 = param3.field_d;
          var11 = param3.field_g;
          var12 = -var11 + em.field_l;
          var13 = 0;
          if (em.field_k <= param4) {
            break L1;
          } else {
            var14 = em.field_k - param4;
            var10 = var10 - var14;
            var8 = var8 + em.field_l * var14;
            param4 = em.field_k;
            var9 = var9 + var14 * var11;
            break L1;
          }
        }
        L2: {
          if (param4 + var10 > em.field_j) {
            var10 = var10 - (var10 + param4 + -em.field_j);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 < em.field_a) {
            var14 = -param0 + em.field_a;
            var8 = var8 + var14;
            var7 = var7 + var6 * var14;
            param0 = em.field_a;
            var11 = var11 - var14;
            var9 = var9 + var14;
            var12 = var12 + var14;
            var13 = var13 + var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var11 + param0 > em.field_b) {
            var14 = -em.field_b + var11 + param0;
            var13 = var13 + var14;
            var11 = var11 - var14;
            var12 = var12 + var14;
            break L4;
          } else {
            break L4;
          }
        }
        if (var11 >= -1) {
          return;
        } else {
          if (-1 < var10) {
            param4 = -var10;
            L5: while (true) {
              if (0 <= param4) {
                return;
              } else {
                var14 = var7;
                param0 = -var11;
                L6: while (true) {
                  if (0 <= param0) {
                    var9 = var9 + var13;
                    var8 = var8 + var12;
                    param4++;
                    continue L5;
                  } else {
                    var15 = var14 >> -1759791704;
                    var16 = 256 - var15;
                    var14 = var14 + var6;
                    if (-1 < (var15 ^ -1)) {
                      var8++;
                      var9++;
                      param0++;
                      continue L6;
                    } else {
                      var9++;
                      var17 = param3.field_l[param3.field_k[var9] & 255];
                      if (var17 != 0) {
                        if (255 >= var15) {
                          var18 = em.field_i[var8];
                          var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 908123272;
                          em.field_i[var8] = (ae.a(ae.a(var17, 65280) * var15 + var16 * ae.a(var18, 65280), 16711906) >> 642414920) + var19;
                          var8++;
                          param0++;
                          continue L6;
                        } else {
                          em.field_i[var8] = var17;
                          var8++;
                          param0++;
                          continue L6;
                        }
                      } else {
                        var8++;
                        param0++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        if (param0 != -23466) {
            return;
        }
        while (true) {
            param3--;
            if (0 > param3) {
                break;
            }
            var9 = param4;
            int[] var5 = var9;
            var6 = param1;
            var7 = param2;
            var9[var6] = ae.a(var9[var6] >> 1707135809, 8355711) + var7;
            param1++;
        }
    }

    public static void h(byte param0) {
        if (param0 != 127) {
            field_H = -93;
        }
        field_P = null;
        field_L = null;
        field_R = null;
        field_I = null;
        field_J = null;
        field_O = null;
        field_K = null;
    }

    bb(tb param0, int param1, int param2) {
        super(dm.field_h + -param1 >> 1379198305, r.field_B - param2 >> -503561663, param1, param2, (db) null);
        ((bb) this).field_G = false;
        ((bb) this).field_N = 0;
        ((bb) this).field_Q = param0;
    }

    abstract void b(int param0, int param1, byte param2);

    private final int k(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        L1: {
          if (!((bb) this).field_G) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            if ((Object) (Object) ((bb) this).field_Q.n(0) == this) {
              stackOut_5_0 = 256;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 0;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
          }
        }
        return stackIn_7_0;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        CharSequence var11 = (CharSequence) (Object) param1;
        int var3 = un.a(var11, 4277, param2);
        String[] var4 = new String[var3 - -1];
        if (param0 > -127) {
            Object var10 = null;
            String[] discarded$0 = bb.a(119, (String) null, 'e');
        }
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param1.charAt(var8) != param2; var8++) {
            }
            var5++;
            var4[var5] = param1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param1.substring(var6);
        return var4;
    }

    boolean a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -106 / ((param0 - 7) / 55);
            ((bb) this).field_N = this.k(-1);
            if (((bb) this).field_N != 0) {
              break L1;
            } else {
              if (((bb) this).field_G) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 255) {
            field_K = null;
        }
        ((bb) this).a(param2, -param1 + r.field_B >> -1477107551, -param2 + dm.field_h >> -182727679, true, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Back";
        field_H = 0;
        field_J = "Cancel";
        field_R = new int[]{1, 160};
        field_K = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "to keep fullscreen or";
    }
}
