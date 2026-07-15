/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends a {
    static mf field_E;
    static String field_F;
    private sn field_C;
    private sn[] field_A;
    static int[][] field_D;
    static String field_G;
    static int[] field_J;
    static int[] field_I;
    static int field_B;
    static String field_K;

    private final void a(byte param0, bc param1, boolean param2) {
        int var4 = 0;
        sn var5 = null;
        sn var6 = null;
        int var7 = 0;
        sn stackIn_7_0 = null;
        sn stackIn_8_0 = null;
        sn stackIn_9_0 = null;
        sn stackIn_9_1 = null;
        sn stackOut_6_0 = null;
        sn stackOut_8_0 = null;
        sn stackOut_8_1 = null;
        sn stackOut_7_0 = null;
        sn stackOut_7_1 = null;
        L0: {
          var7 = client.field_A ? 1 : 0;
          super.a(-12253, (a) (Object) param1);
          if (param2) {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -7) {
                break L0;
              } else {
                var5 = ((bc) this).field_A[var4];
                if (var5 != null) {
                  L2: {
                    var6 = param1.field_A[var4];
                    stackOut_6_0 = (sn) var5;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 == null) {
                      sn dupTemp$1 = new sn();
                      param1.field_A[var4] = dupTemp$1;
                      stackOut_8_0 = (sn) (Object) stackIn_8_0;
                      stackOut_8_1 = (sn) dupTemp$1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = (sn) (Object) stackIn_7_0;
                      stackOut_7_1 = (sn) var6;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  ((sn) (Object) stackIn_9_0).a(stackIn_9_1, 1);
                  var4++;
                  continue L1;
                } else {
                  param1.field_A[var4] = null;
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            an.a((Object[]) (Object) ((bc) this).field_A, 0, (Object[]) (Object) param1.field_A, 0, 6);
            break L0;
          }
        }
        var4 = -82 % ((-68 - param0) / 44);
    }

    final void a(int param0, ck[] param1, int param2) {
        if (param0 <= 97) {
            Object var5 = null;
            ((bc) this).a(true, -54, 87, (byte) -121, (ce) null);
        }
        int var4 = param2;
        if (((bc) this).field_A[var4] == null) {
            ((bc) this).field_A[var4] = new sn();
        }
        ((bc) this).field_A[param2].field_a = param1;
    }

    bc(bc param0, boolean param1) {
        this();
        param0.a((byte) -117, (bc) this, param1);
    }

    public bc() {
        ((bc) this).field_A = new sn[6];
        ((bc) this).field_C = new sn();
        sn dupTemp$0 = new sn();
        ((bc) this).field_A[0] = dupTemp$0;
        sn var1 = dupTemp$0;
        var1.b((byte) 68);
    }

    final sn a(int param0, int param1) {
        if (param1 <= 0) {
            field_E = null;
        }
        sn dupTemp$0 = new sn();
        ((bc) this).field_A[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = client.field_A ? 1 : 0;
          if (param1 == 65) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        L1: {
          var2 = param0.length();
          if (-21 > (var2 ^ -1)) {
            var2 = 20;
            break L1;
          } else {
            break L1;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param0.charAt(var4);
              if (65 > var5) {
                break L3;
              } else {
                if (var5 > 90) {
                  break L3;
                } else {
                  var3[var4] = (char)(-65 + (var5 + 97));
                  var4++;
                  continue L2;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var5 < 48) {
                  break L6;
                } else {
                  if (var5 > 57) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        sn var7 = null;
        sn var9 = null;
        Object var10 = null;
        ek var11 = null;
        sn var12 = null;
        sn var13 = null;
        sn var14 = null;
        sn var15 = null;
        ce stackIn_3_0 = null;
        ce stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof ek) {
            stackOut_2_0 = (ce) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ce) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (ek) (Object) stackIn_3_0;
          gg.a(param4.field_D + param2, 20763, param4.field_t + param4.field_u + param1, param1 - -param4.field_u, param4.field_D + param2 + param4.field_y);
          if (var11 != null) {
            param0 = param0 & var11.field_I;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((bc) this).field_A[0];
          ((bc) this).field_C.b((byte) 80);
          var7.a(((bc) this).field_C, (bc) this, 122, param2, param1, param4);
          if (var11 != null) {
            L3: {
              if (!var11.field_H) {
                break L3;
              } else {
                var12 = ((bc) this).field_A[1];
                if (var12 == null) {
                  break L3;
                } else {
                  var12.a(((bc) this).field_C, (bc) this, 127, param2, param1, param4);
                  break L3;
                }
              }
            }
            if (var11.field_q) {
              L4: {
                var13 = ((bc) this).field_A[3];
                if (var11.field_o == 0) {
                  break L4;
                } else {
                  if (var13 != null) {
                    var13.a(((bc) this).field_C, (bc) this, 122, param2, param1, param4);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var9 = ((bc) this).field_A[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a(((bc) this).field_C, (bc) this, 126, param2, param1, param4);
                break L2;
              }
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param4.a(true)) {
            var14 = ((bc) this).field_A[5];
            if (var14 != null) {
              var14.a(((bc) this).field_C, (bc) this, 126, param2, param1, param4);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (!param0) {
            var15 = ((bc) this).field_A[4];
            if (var15 != null) {
              var15.a(((bc) this).field_C, (bc) this, 124, param2, param1, param4);
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          ((bc) this).field_C.a(-2, param4, param1, (bc) this, param2);
          mk.a((byte) -5);
          if (param3 <= -60) {
            break L7;
          } else {
            var10 = null;
            ((bc) this).a(true, -61, 21, (byte) -12, (ce) null);
            break L7;
          }
        }
    }

    final void a(ck param0, int param1) {
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var7 = ((bc) this).field_A;
          var3 = var7;
          if (param1 == 2) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(ck[] param0, boolean param1) {
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        var6 = client.field_A ? 1 : 0;
        var7 = ((bc) this).field_A;
        var3 = var7;
        var4 = 0;
        if (!param1) {
          L0: while (true) {
            if (var4 >= var7.length) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_a = param0;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_F = null;
        field_J = null;
        field_D = null;
        field_K = null;
        if (param0 >= -101) {
            field_K = null;
        }
        field_I = null;
        field_G = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "No spectators";
        field_I = new int[8192];
        field_G = "Allow spectators?";
        field_K = "To play a multiplayer game, please log in or create a free account.";
    }
}
