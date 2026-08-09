/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t extends bl {
    private int field_db;
    private int field_gb;
    private int field_eb;
    static String field_bb;
    static String field_ib;
    private int field_jb;
    static String[] field_cb;
    private int field_hb;
    private int field_fb;

    boolean h(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          if (-1 <= (this.field_hb ^ -1)) {
            break L0;
          } else {
            L1: {
              L2: {
                var2 = this.field_jb;
                var3 = this.field_gb;
                fieldTemp$1 = this.field_eb + 1;
                this.field_eb = this.field_eb + 1;
                if (this.field_hb > fieldTemp$1) {
                  break L2;
                } else {
                  this.field_hb = 0;
                  this.j((byte) -52);
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = (-this.field_eb + 2 * this.field_hb) * this.field_eb;
              var5 = this.field_hb * this.field_hb;
              var2 = var4 * (this.field_jb + -this.field_db) / var5 + this.field_db;
              var3 = this.field_fb + var4 * (-this.field_fb + this.field_gb) / var5;
              break L1;
            }
            this.a(110, var2, var3);
            break L0;
          }
        }
        if (param0 >= 15) {
          return super.h((byte) 90);
        } else {
          return true;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 != 194) {
            this.b(35, 121, -128, 19);
        }
        if (param1 <= 0) {
            this.a(121, param0, param2);
            return;
        }
        this.field_hb = param1;
        this.field_gb = param2;
        this.field_db = this.field_t;
        this.field_fb = this.field_y;
        this.field_jb = param0;
        this.field_eb = 0;
    }

    final static void k(byte param0) {
        if (param0 != -73) {
            return;
        }
        de.field_W.c(new lg(), (byte) 121);
    }

    void j(int param0) {
        if (!(this.field_hb > 0)) {
            return;
        }
        this.a(112, this.field_jb, this.field_gb);
        this.field_hb = 0;
        this.j((byte) -32);
        int var2 = 40 % ((param0 - -15) / 49);
    }

    final static boolean i(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 124) {
            break L0;
          } else {
            field_bb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (hc.field_d ^ -1)) {
              break L2;
            } else {
              if (-14 < (ca.field_vb ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    t(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_eb = 0;
        this.field_hb = 0;
    }

    boolean f(byte param0) {
        this.j(38);
        if (param0 < 77) {
            field_bb = (String) null;
        }
        return super.f((byte) 125);
    }

    void j(byte param0) {
        int var2 = -128 % ((param0 - 30) / 39);
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 104) {
            return;
        }
        uc.a(true, param1, 54);
    }

    void b(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int statePc = 0;
        int var4 = 0;
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
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = client.field_A ? 1 : 0;
                    if (param0 <= -127) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    hk.d(6 + param2, 35 + param1, -12 + this.field_t, this.field_y - 40, 2105376, 0);
                    var5 = 211;
                    var4 = 35;
                    var6 = 194;
                    var7 = 0;
                    var8 = param1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var4 ^ -1) >= (var7 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_38_0 = hk.field_h;
                    stackIn_5_0 = stackIn_38_0;
                    stackIn_38_1 = var8;
                    stackIn_5_1 = stackIn_38_1;
                    if (var16 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 > stackIn_5_1) {
                        statePc = 36;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((hk.field_b ^ -1) >= (var8 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var9 = var5 - -((-var5 + var6) * var7 / var4);
                    var10 = 0;
                    var11 = this.field_t;
                    if (20 >= var7) {
                        statePc = 9;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var10 ^ -1) < -21) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12 = (20 + -var7) * (-var7 + 20) - -((-var10 + 20) * (20 + -var10));
                    stackIn_20_0 = 462;
                    stackIn_11_0 = stackIn_20_0;
                    stackIn_20_1 = var12;
                    stackIn_11_1 = stackIn_20_1;
                    if (var16 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 >= stackIn_11_1) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var16 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var12 ^ -1) <= -421) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var16 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var13 = (-var12 + 462) * var9 / 42;
                    var13 = var13 | (var13 << 1261671240 | var13 << 720680144);
                    hk.field_l[hk.field_j * var8 - -param2 - -var10] = var13;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var10++;
                    if (var16 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = -21;
                    stackIn_20_1 = var7 ^ -1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 <= stackIn_20_1) {
                        statePc = 22;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (20 < var13) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var14 = (-var7 + 20) * (20 + -var7) + var13 * var13;
                    stackIn_35_0 = -463;
                    stackIn_25_0 = stackIn_35_0;
                    stackIn_35_1 = var14 ^ -1;
                    stackIn_25_1 = stackIn_35_1;
                    if (var16 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 <= stackIn_25_1) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var16 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (420 > var14) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var12 = var11 - -1;
                    if (var16 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << -1614545976 | var15 << -192934416);
                    hk.field_l[param2 + var8 * hk.field_j + var11] = var15;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var13++;
                    var11++;
                    if (var16 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11 = var12;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var9 = var9 | (var9 << -1835908592 | var9 << -1970200856);
                    stackIn_35_0 = var10 + param2;
                    stackIn_35_1 = var8;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    hk.a(stackIn_35_0, stackIn_35_1, -var10 + var11, var9);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var7++;
                    var8++;
                    if (var16 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var6 = 169;
                    var4 = 22;
                    var5 = 194;
                    var7 = 0;
                    stackIn_38_0 = param1;
                    stackIn_38_1 = -35;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var8 = stackIn_38_0 - stackIn_38_1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var7 >= var4) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << -1910141936 | var9 << -1313540568);
                    hk.a(param2, var8, 6, var9);
                    hk.a(param2 + this.field_t + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    if (var16 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var16 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    jm.field_q.c(-90 + (param2 - -this.field_t), 10 + param1);
                    ng.a(c.field_m, -10 + this.field_t, param1 + 35, -1, 5 + param2);
                    ng.a(g.field_O, this.field_t, param1 + (this.field_y + -22), -1, param2);
                    var4 = this.field_y + -79;
                    var5 = 169;
                    var6 = 127;
                    var7 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var8 = 57 + param1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var7 >= var4) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var9 = var5 - -(var7 * (var6 + -var5) / var4);
                    var9 = var9 | (var9 << 23526640 | var9 << 495246472);
                    hk.a(param2, var8, 6, var9);
                    hk.a(-6 + (this.field_t + param2), var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var16 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static pi[] a(String param0, ji param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pi[] stackIn_2_0 = null;
        pi[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              var4_int = param1.b(-1, param3);
              var5 = param1.a(var4_int, 13030, param0);
              stackIn_4_0 = on.a(var5, (byte) 37, var4_int, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pi[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("t.MA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void l(byte param0) {
        field_bb = null;
        field_ib = null;
        if (param0 != 94) {
            t.a((String) null, (ji) null, true, (String) null);
        }
        field_cb = null;
    }

    final static hm k(int param0) {
        try {
            Throwable var1 = null;
            hm stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            if (param0 == -22) {
              try {
                L0: {
                  stackIn_3_0 = (hm) (Class.forName("ag").newInstance());
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return (hm) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_bb = "Matching Score: ";
        field_ib = "Animals";
        field_cb = new String[255];
    }
}
