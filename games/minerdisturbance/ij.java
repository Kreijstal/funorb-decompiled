/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends vb {
    private uh field_k;
    private int field_q;
    private tg field_i;
    static int field_v;
    private nm field_y;
    private byte[] field_A;
    static boolean field_p;
    private int field_n;
    private byte[] field_h;
    private uh field_e;
    static ea field_t;
    private g field_w;
    private ch field_j;
    private int field_u;
    static pl field_o;
    private em field_z;
    private boolean field_g;
    private ta field_x;
    private boolean field_m;
    private int field_l;
    private ta field_r;
    private long field_s;
    private boolean field_f;

    final static ed a(int param0, String param1, boolean param2) {
        ed var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new ed(false);
            if (param2) {
              var3.field_h = param1;
              var3.field_e = param0;
              stackOut_3_0 = (ed) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ed) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ij.F(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    final byte[] a(int param0, int param1) {
        em var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        var3 = this.a(124, 0, param1);
        if (var3 == null) {
          return null;
        } else {
          var4 = var3.c((byte) -115);
          var5 = 22 / ((-32 - param0) / 34);
          var3.b(34);
          return var4;
        }
    }

    final g a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        if (((ij) this).field_w == null) {
          L0: {
            if (((ij) this).field_z != null) {
              break L0;
            } else {
              if (!((ij) this).field_j.d((byte) -111)) {
                ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, -21, true, ((ij) this).field_u, 255);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((ij) this).field_z.field_C) {
            if (param0 == 53) {
              L1: {
                L2: {
                  var5 = ((ij) this).field_z.c((byte) -115);
                  var2 = var5;
                  if (((ij) this).field_z instanceof vl) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        if (var5 != null) {
                          ((ij) this).field_w = new g(var5, ((ij) this).field_q, ((ij) this).field_h);
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var3 = decompiledCaughtException;
                      ((ij) this).field_j.d(20);
                      ((ij) this).field_w = null;
                      if (((ij) this).field_j.d((byte) -111)) {
                        ((ij) this).field_z = null;
                        if (var4 == 0) {
                          return null;
                        } else {
                          ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, param0 + -74, true, ((ij) this).field_u, 255);
                          return null;
                        }
                      } else {
                        ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, param0 + -74, true, ((ij) this).field_u, 255);
                        return null;
                      }
                    }
                    if (null == ((ij) this).field_e) {
                      break L1;
                    } else {
                      vl discarded$1 = ((ij) this).field_y.a(((ij) this).field_e, false, var5, ((ij) this).field_u);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                try {
                  L4: {
                    if (var5 != null) {
                      ((ij) this).field_w = new g(var5, ((ij) this).field_q, ((ij) this).field_h);
                      if (((ij) this).field_n != ((ij) this).field_w.field_r) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = decompiledCaughtException;
                  ((ij) this).field_w = null;
                  if (!((ij) this).field_j.d((byte) -111)) {
                    ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, -21, true, ((ij) this).field_u, 255);
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((ij) this).field_z = null;
                      return null;
                    }
                  } else {
                    ((ij) this).field_z = null;
                    return null;
                  }
                }
                break L1;
              }
              L5: {
                if (((ij) this).field_k != null) {
                  ((ij) this).field_A = new byte[((ij) this).field_w.field_c];
                  break L5;
                } else {
                  break L5;
                }
              }
              ((ij) this).field_z = null;
              return ((ij) this).field_w;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((ij) this).field_w;
        }
    }

    final void c(int param0) {
        int var2_int = 0;
        em var2 = null;
        pi var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        byte stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        byte stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_81_0 = 0;
        boolean stackIn_98_0 = false;
        boolean stackIn_101_0 = false;
        byte stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_48_0 = 0;
        byte stackOut_56_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_80_0 = 0;
        boolean stackOut_97_0 = false;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MinerDisturbance.field_ab;
                    if (null != ((ij) this).field_x) {
                        statePc = 2;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (((ij) this).a((byte) 53) != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (((ij) this).field_g) {
                        statePc = 54;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!((ij) this).field_m) {
                        statePc = 52;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2_int = 1;
                    var3 = ((ij) this).field_x.b(71);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == null) {
                        statePc = 34;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = (int)var3.field_d;
                    stackOut_8_0 = ((ij) this).field_A[var4];
                    stackOut_8_1 = 1;
                    stackIn_18_0 = stackOut_8_0;
                    stackIn_18_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    em discarded$5 = this.a(param0 + 116, 2, var4);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (((ij) this).field_A[var4] != 1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var3.b(34);
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2_int = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var3 = ((ij) this).field_x.b((byte) 56);
                    statePc = 7;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= stackIn_18_1) {
                        statePc = 48;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = -1;
                    stackIn_49_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var5 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 != ~((ij) this).field_w.field_d[((ij) this).field_l]) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (((ij) this).field_j.c((byte) -46)) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (1 != ((ij) this).field_A[((ij) this).field_l]) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    em discarded$6 = this.a(param0 ^ 124, 2, ((ij) this).field_l);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (1 == ((ij) this).field_A[((ij) this).field_l]) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var3 = new pi();
                    var3.field_d = (long)((ij) this).field_l;
                    var2_int = 0;
                    ((ij) this).field_x.a((byte) -116, var3);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (((ij) this).field_l >= ((ij) this).field_w.field_d.length) {
                        statePc = 48;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = -1;
                    stackIn_49_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (var5 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 != ~((ij) this).field_w.field_d[((ij) this).field_l]) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 39: {
                    if (((ij) this).field_j.c((byte) -46)) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (1 != ((ij) this).field_A[((ij) this).field_l]) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    em discarded$7 = this.a(param0 ^ 124, 2, ((ij) this).field_l);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (1 == ((ij) this).field_A[((ij) this).field_l]) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var3 = new pi();
                    var3.field_d = (long)((ij) this).field_l;
                    var2_int = 0;
                    ((ij) this).field_x.a((byte) -116, var3);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = var2_int;
                    stackIn_49_0 = stackOut_48_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((ij) this).field_m = false;
                    ((ij) this).field_l = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var5 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ((ij) this).field_x = null;
                    if (var5 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var2_int = 1;
                    var3 = ((ij) this).field_x.b(72);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var3 == null) {
                        statePc = 65;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var4 = (int)var3.field_d;
                    stackOut_56_0 = ((ij) this).field_A[var4];
                    stackIn_66_0 = stackOut_56_0;
                    stackIn_57_0 = stackOut_56_0;
                    if (var5 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    em discarded$8 = this.a(113, 1, var4);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (0 == ((ij) this).field_A[var4]) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var3.b(34);
                    if (var5 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var2_int = 0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var3 = ((ij) this).field_x.b((byte) 56);
                    statePc = 55;
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = ((ij) this).field_l;
                    stackIn_66_0 = stackOut_65_0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 >= ((ij) this).field_w.field_d.length) {
                        statePc = 80;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = ((ij) this).field_w.field_d[((ij) this).field_l];
                    stackIn_81_0 = stackOut_67_0;
                    stackIn_68_0 = stackOut_67_0;
                    if (var5 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 71: {
                    if (250 > ((ij) this).field_y.field_b) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (((ij) this).field_A[((ij) this).field_l] == 0) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    em discarded$9 = this.a(param0 + 112, 1, ((ij) this).field_l);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (((ij) this).field_A[((ij) this).field_l] == 0) {
                        statePc = 78;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var3 = new pi();
                    var3.field_d = (long)((ij) this).field_l;
                    var2_int = 0;
                    ((ij) this).field_x.a((byte) -114, var3);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = var2_int;
                    stackIn_81_0 = stackOut_80_0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 83: {
                    ((ij) this).field_l = 0;
                    ((ij) this).field_g = false;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (((ij) this).field_f) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (param0 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    ((ij) this).c(-80);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    return;
                }
                case 88: {
                    if (~sf.a((byte) -111) <= ~((ij) this).field_s) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (param0 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    ((ij) this).c(-80);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    return;
                }
                case 92: {
                    var2 = (em) (Object) ((ij) this).field_i.a(param0 ^ -16545);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (var2 != null) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    ((ij) this).field_s = sf.a((byte) 101) + 1000L;
                    if (param0 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    ((ij) this).c(-80);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    return;
                }
                case 97: {
                    stackOut_97_0 = var2.field_C;
                    stackIn_101_0 = stackOut_97_0;
                    stackIn_98_0 = stackOut_97_0;
                    if (var5 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (!stackIn_98_0) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    ((ij) this).c(-80);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    return;
                }
                case 101: {
                    if (!stackIn_101_0) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var5 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (!var2.field_z) {
                        statePc = 109;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (!var2.field_v) {
                        statePc = 107;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 107: {
                    throw new RuntimeException();
                }
                case 108: {
                    var2.b(param0 ^ 34);
                    if (var5 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var2.field_z = true;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    var2 = (em) (Object) ((ij) this).field_i.a(true);
                    statePc = 93;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, sb param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte stackIn_6_0 = 0;
            int stackIn_10_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_5_0 = 0;
            int stackOut_9_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var5 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (null != w.field_W) {
                      try {
                        L3: {
                          w.field_W.a((byte) 120, 0L);
                          w.field_W.a(var6, 119);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var3_int >= 24) {
                                  break L6;
                                } else {
                                  stackOut_5_0 = var6[var3_int];
                                  stackIn_10_0 = stackOut_5_0;
                                  stackIn_6_0 = stackOut_5_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    if (stackIn_6_0 != 0) {
                                      break L6;
                                    } else {
                                      var3_int++;
                                      continue L4;
                                    }
                                  }
                                }
                              }
                              stackOut_9_0 = ~var3_int;
                              stackIn_10_0 = stackOut_9_0;
                              break L5;
                            }
                            if (stackIn_10_0 > -25) {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L7: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L8: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 0;
                              break L7;
                            } else {
                              L9: {
                                var6[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  break L9;
                                } else {
                                  if (var5 == 0) {
                                    continue L8;
                                  } else {
                                    param1.a(0, 24, param0, var2);
                                    break L9;
                                  }
                                }
                              }
                              decompiledRegionSelector0 = 1;
                              break L7;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param1.a(0, 24, param0, var2);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) var2_ref;
                stackOut_20_1 = new StringBuilder().append("ij.E(").append(param0).append(44);
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L10;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L10;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        byte stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        var4 = MinerDisturbance.field_ab;
        if (null != ((ij) this).field_x) {
          if (((ij) this).a((byte) 53) == null) {
            return;
          } else {
            var2 = ((ij) this).field_r.b(111);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_d;
                    stackOut_5_0 = -1;
                    stackOut_5_1 = ~var3;
                    stackIn_22_0 = stackOut_5_0;
                    stackIn_22_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_6_0 < stackIn_6_1) {
                              break L5;
                            } else {
                              if (((ij) this).field_w.field_c <= var3) {
                                break L5;
                              } else {
                                if (((ij) this).field_w.field_d[var3] == 0) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.b(34);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (((ij) this).field_A[var3] == 0) {
                            em discarded$2 = this.a(103, 1, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (-1 == ((ij) this).field_A[var3]) {
                            em discarded$3 = this.a(92, 2, var3);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (1 == ((ij) this).field_A[var3]) {
                          var2.b(34);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = ((ij) this).field_r.b((byte) 56);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_21_0 = param0;
                stackOut_21_1 = 1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L1;
              }
              L8: {
                if (stackIn_22_0 >= stackIn_22_1) {
                  break L8;
                } else {
                  ((ij) this).field_w = null;
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        var2 = -5 / ((33 - param0) / 58);
        if (null == ((ij) this).field_k) {
          return;
        } else {
          L0: {
            ((ij) this).field_m = true;
            if (null != ((ij) this).field_x) {
              break L0;
            } else {
              ((ij) this).field_x = new ta();
              break L0;
            }
          }
          return;
        }
    }

    private final em a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_63_0 = null;
        byte stackIn_82_0 = 0;
        byte stackIn_82_1 = 0;
        byte stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        byte stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_62_0 = null;
        L0: {
          var10 = MinerDisturbance.field_ab;
          if (param0 >= 86) {
            break L0;
          } else {
            ((ij) this).b(-36);
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (em) (Object) ((ij) this).field_i.a((long)param2, -27109);
          if (var4 == null) {
            break L1;
          } else {
            if (0 != param1) {
              break L1;
            } else {
              if (((em) var4).field_v) {
                break L1;
              } else {
                if (!((em) var4).field_C) {
                  break L1;
                } else {
                  ((em) var4).b(34);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              L4: {
                if (0 != param1) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      if (null == ((ij) this).field_k) {
                        break L6;
                      } else {
                        if (-1 != ((ij) this).field_A[param2]) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (!((ij) this).field_j.d((byte) -111)) {
                      var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    } else {
                      return null;
                    }
                  }
                  var4 = (Object) (Object) ((ij) this).field_y.a((byte) 54, param2, ((ij) this).field_k);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (param1 != 1) {
                  break L7;
                } else {
                  if (((ij) this).field_k != null) {
                    var4 = (Object) (Object) ((ij) this).field_y.a(param2, false, ((ij) this).field_k);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              if (param1 == 2) {
                if (null != ((ij) this).field_k) {
                  if (((ij) this).field_A[param2] != -1) {
                    throw new RuntimeException();
                  } else {
                    if (!((ij) this).field_j.c((byte) -68)) {
                      var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, false, param2, ((ij) this).field_u);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                throw new RuntimeException();
              }
            }
            ((ij) this).field_i.a(0, (long)param2, (pi) var4);
            break L2;
          }
        }
        if (!((em) var4).field_C) {
          var5 = ((em) var4).c((byte) -115);
          if (!(var4 instanceof vl)) {
            try {
              L8: {
                L9: {
                  if (var5 == null) {
                    break L9;
                  } else {
                    if (var5.length > 2) {
                      wa.field_b.reset();
                      wa.field_b.update(var5, 0, var5.length + -2);
                      var6_int = (int)wa.field_b.getValue();
                      if (((ij) this).field_w.field_h[param2] == var6_int) {
                        L10: {
                          if (null == ((ij) this).field_w.field_l) {
                            break L10;
                          } else {
                            if (null == ((ij) this).field_w.field_l[param2]) {
                              break L10;
                            } else {
                              var7 = ((ij) this).field_w.field_l[param2];
                              var8 = wb.a(var5.length + -2, 0, var5, 18738);
                              var9 = 0;
                              L11: while (true) {
                                if (64 <= var9) {
                                  break L10;
                                } else {
                                  stackOut_81_0 = var8[var9];
                                  stackOut_81_1 = var7[var9];
                                  stackIn_96_0 = stackOut_81_0;
                                  stackIn_96_1 = stackOut_81_1;
                                  stackIn_82_0 = stackOut_81_0;
                                  stackIn_82_1 = stackOut_81_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L8;
                                  } else {
                                    if (stackIn_82_0 == stackIn_82_1) {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L11;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((ij) this).field_j.field_o = 0;
                        ((ij) this).field_j.field_j = 0;
                        decompiledRegionSelector0 = 1;
                        break L8;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((ij) this).field_j.d(20);
              ((em) var4).b(34);
              if (((em) var4).field_v) {
                if (((ij) this).field_j.d((byte) -111)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                  ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                  return null;
                }
              } else {
                return null;
              }
            }
            L12: {
              L13: {
                if (decompiledRegionSelector0 == 0) {
                  break L13;
                } else {
                  var5[-2 + var5.length] = (byte)(((ij) this).field_w.field_q[param2] >>> 8);
                  var5[-1 + var5.length] = (byte)((ij) this).field_w.field_q[param2];
                  if (null != ((ij) this).field_k) {
                    vl discarded$1 = ((ij) this).field_y.a(((ij) this).field_k, false, var5, param2);
                    stackOut_95_0 = ((ij) this).field_A[param2];
                    stackOut_95_1 = 1;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              if (stackIn_96_0 == stackIn_96_1) {
                break L12;
              } else {
                ((ij) this).field_A[param2] = (byte) 1;
                break L12;
              }
            }
            L14: {
              if (((em) var4).field_v) {
                break L14;
              } else {
                ((em) var4).b(34);
                break L14;
              }
            }
            return (em) var4;
          } else {
            try {
              L15: {
                L16: {
                  if (var5 == null) {
                    break L16;
                  } else {
                    if (2 < var5.length) {
                      wa.field_b.reset();
                      wa.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)wa.field_b.getValue();
                      if (((ij) this).field_w.field_h[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L17: {
                          L18: {
                            if (((ij) this).field_w.field_l == null) {
                              break L18;
                            } else {
                              if (((ij) this).field_w.field_l[param2] != null) {
                                var7 = ((ij) this).field_w.field_l[param2];
                                var8 = wb.a(var5.length + -2, 0, var5, 18738);
                                var9 = 0;
                                L19: while (true) {
                                  if (var9 >= 64) {
                                    break L18;
                                  } else {
                                    stackOut_47_0 = var7[var9];
                                    stackOut_47_1 = var8[var9];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      break L17;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L19;
                                        } else {
                                          break L18;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L18;
                              }
                            }
                          }
                          stackOut_51_0 = (255 & var5[var5.length - 2]) << 8;
                          stackOut_51_1 = -(255 & var5[-1 + var5.length]);
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L17;
                        }
                        var7_int = stackIn_52_0 - stackIn_52_1;
                        if (var7_int != (((ij) this).field_w.field_q[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L20: {
                            if (1 != ((ij) this).field_A[param2]) {
                              L21: {
                                if (((ij) this).field_A[param2] == 0) {
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              ((ij) this).field_A[param2] = (byte) 1;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L22: {
                            if (!((em) var4).field_v) {
                              ((em) var4).b(34);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          stackOut_62_0 = var4;
                          stackIn_63_0 = stackOut_62_0;
                          break L15;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((ij) this).field_A[param2] = (byte) -1;
              ((em) var4).b(34);
              if (((em) var4).field_v) {
                if (((ij) this).field_j.d((byte) -111)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                  ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (em) (Object) stackIn_63_0;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_t = null;
        if (!param0) {
            field_t = null;
        }
    }

    final int a(byte param0, int param1) {
        em var3 = null;
        L0: {
          if (param0 >= 62) {
            break L0;
          } else {
            ((ij) this).c(25);
            break L0;
          }
        }
        var3 = (em) (Object) ((ij) this).field_i.a((long)param1, -27109);
        if (var3 == null) {
          return 0;
        } else {
          return var3.f(100);
        }
    }

    ij(int param0, uh param1, uh param2, ch param3, nm param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((ij) this).field_i = new tg(16);
        ((ij) this).field_l = 0;
        ((ij) this).field_r = new ta();
        ((ij) this).field_s = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ij) this).field_u = param0;
                ((ij) this).field_k = param1;
                if (((ij) this).field_k != null) {
                  break L2;
                } else {
                  ((ij) this).field_g = false;
                  if (MinerDisturbance.field_ab == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ij) this).field_g = true;
              ((ij) this).field_x = new ta();
              break L1;
            }
            L3: {
              ((ij) this).field_j = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((ij) this).field_f = stackIn_7_1 != 0;
              ((ij) this).field_n = param7;
              ((ij) this).field_e = param2;
              ((ij) this).field_y = param4;
              ((ij) this).field_q = param5;
              ((ij) this).field_h = param6;
              if (((ij) this).field_e == null) {
                break L4;
              } else {
                ((ij) this).field_z = (em) (Object) ((ij) this).field_y.a((byte) -74, ((ij) this).field_u, ((ij) this).field_e);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("ij.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
        field_o = null;
    }
}
