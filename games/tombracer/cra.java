/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cra {
    private int field_j;
    private int field_g;
    private int field_c;
    private int field_l;
    private int field_d;
    int field_f;
    boolean field_o;
    private dk[] field_h;
    private int[] field_e;
    static String field_a;
    private boolean field_n;
    private int field_i;
    private int field_m;
    private dk field_b;
    private int field_k;

    final void a(int param0, byte param1) {
        ((cra) this).field_f = param0;
        ((cra) this).field_o = true;
        ((cra) this).field_g = ((cra) this).field_b.field_l[((cra) this).field_f];
        ((cra) this).field_c = ((cra) this).field_b.field_l[(1 + ((cra) this).field_f) % this.b(param1)];
        ((cra) this).field_d = 0;
    }

    private final int b(byte param0) {
        int var2 = 118 % ((param0 - 43) / 36);
        return ((cra) this).field_b.field_l.length;
    }

    private final boolean a(int param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          ((cra) this).field_o = true;
          if (param0 < -43) {
            break L0;
          } else {
            ((cra) this).field_i = 78;
            break L0;
          }
        }
        L1: {
          if (((cra) this).field_b.field_i) {
            L2: {
              ((cra) this).field_j = 1 + ((cra) this).field_f;
              if (((cra) this).field_b.field_l.length > ((cra) this).field_j) {
                break L2;
              } else {
                L3: {
                  ((cra) this).field_m = ((cra) this).field_m + 1;
                  if (((cra) this).field_b.field_f) {
                    break L3;
                  } else {
                    if (((cra) this).field_b.field_j > ((cra) this).field_m) {
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                L4: {
                  if (((cra) this).field_b.field_b < 0) {
                    break L4;
                  } else {
                    if (((cra) this).field_b.field_b < this.b((byte) -76)) {
                      ((cra) this).field_j = ((cra) this).field_b.field_b;
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                ((cra) this).field_j = 0;
                break L2;
              }
            }
            ((cra) this).field_c = ((cra) this).field_b.field_l[((cra) this).field_j];
            break L1;
          } else {
            break L1;
          }
        }
        L5: {
          ((cra) this).field_f = ((cra) this).field_f + 1;
          if (((cra) this).field_b.field_l.length <= ((cra) this).field_f) {
            L6: {
              if (!((cra) this).field_b.field_i) {
                ((cra) this).field_m = ((cra) this).field_m + 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((cra) this).field_b.field_f) {
                break L7;
              } else {
                if (((cra) this).field_m < ((cra) this).field_b.field_j) {
                  break L7;
                } else {
                  return true;
                }
              }
            }
            L8: {
              if (((cra) this).field_b.field_b < 0) {
                break L8;
              } else {
                if (((cra) this).field_b.field_b < ((cra) this).field_b.field_l.length) {
                  ((cra) this).field_f = ((cra) this).field_b.field_b;
                  break L5;
                } else {
                  break L8;
                }
              }
            }
            ((cra) this).field_f = 0;
            break L5;
          } else {
            break L5;
          }
        }
        ((cra) this).field_g = ((cra) this).field_b.field_l[((cra) this).field_f];
        ((cra) this).field_d = ((cra) this).field_b.field_e[((cra) this).field_f];
        ((cra) this).field_i = ((cra) this).field_b.field_e[((cra) this).field_f];
        return false;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 >= -9) {
            return false;
        }
        return (((24 & param2) != 0 ? 1 : 0) | (544 == (544 & param2) ? 1 : 0)) != 0;
    }

    final static void a(cn param0, cn param1, int param2, boolean param3, cn param4) {
        try {
            if (param2 != 1) {
                Object var6 = null;
                cra.a((cn) null, (cn) null, -57, true, (cn) null);
            }
            gva.field_b = ai.a((byte) 121, "");
            gva.field_b.a(-71, false);
            fha.a(true, param1, param0, param4);
            pq.b(117);
            kl.field_a = fta.field_c;
            wt.field_d = fta.field_c;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cra.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0) {
        ((cra) this).field_m = 0;
        ((cra) this).field_j = 0;
        ((cra) this).field_o = false;
        ((cra) this).field_d = 0;
        ((cra) this).field_c = 0;
        ((cra) this).field_f = 0;
        if (param0 > -63) {
            ((cra) this).field_m = 101;
        }
        ((cra) this).field_g = 0;
        ((cra) this).field_i = 1;
    }

    final boolean b(int param0) {
        int var2 = 0;
        if (((cra) this).field_n) {
            return false;
        }
        ((cra) this).field_o = false;
        if (null != ((cra) this).field_h) {
            if (0 <= ((cra) this).field_k) {
                ((cra) this).field_e[((cra) this).field_k] = ((cra) this).field_e[((cra) this).field_k] - 1;
                if (!(0 <= ((cra) this).field_e[((cra) this).field_k])) {
                    var2 = ((cra) this).field_k;
                    ((cra) this).a(((cra) this).field_h[((cra) this).field_k], -30988);
                    ((cra) this).field_k = var2;
                    ((cra) this).field_h[((cra) this).field_k] = null;
                    ((cra) this).field_k = ((cra) this).field_k + 1;
                    if (((cra) this).field_k == ((cra) this).field_h.length) {
                        ((cra) this).field_k = 0;
                    }
                    if (!(((cra) this).field_h[((cra) this).field_k] != null)) {
                        ((cra) this).field_k = -1;
                    }
                }
            }
        }
        if (param0 < 6) {
            return true;
        }
        if (((cra) this).field_b == null) {
            return true;
        }
        ((cra) this).field_d = ((cra) this).field_d - 1;
        if (((cra) this).field_d <= 0) {
            return this.a(-99);
        }
        return false;
    }

    public static void c(int param0) {
        field_a = null;
    }

    final void a(int param0, ka param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -103 / ((param0 - -36) / 51);
              if (!((cra) this).field_b.field_i) {
                param1.a(-121, hba.field_c, -1, ((cra) this).field_g, 0, (ena) null, 0, ((cra) this).field_b.field_h, 0);
                break L1;
              } else {
                param1.a(-124, hba.field_c, ((cra) this).field_c, ((cra) this).field_g, ((cra) this).field_i - ((cra) this).field_d, hba.field_c, ((cra) this).field_i, ((cra) this).field_b.field_h, 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cra.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((cra) this).field_g = 93;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((cra) this).field_b) {
              break L2;
            } else {
              L3: {
                if (((cra) this).field_b.field_f) {
                  break L3;
                } else {
                  if (((cra) this).field_m < ((cra) this).field_b.field_j) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void a(dk param0, int param1) {
        try {
            ((cra) this).a((byte) -91);
            ((cra) this).field_b = param0;
            ((cra) this).field_f = -1;
            if (param1 != -30988) {
                boolean discarded$0 = this.a(102);
            }
            boolean discarded$1 = this.a(-95);
            ((cra) this).field_k = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cra.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(dk param0, int param1, int param2) {
        try {
            if (((cra) this).field_h == null) {
                throw new RuntimeException();
            }
            ((cra) this).field_h[((cra) this).field_l] = param0;
            if (param2 != 8198) {
                boolean discarded$0 = this.a(16);
            }
            ((cra) this).field_e[((cra) this).field_l] = param1;
            if (0 > ((cra) this).field_k) {
                ((cra) this).field_k = ((cra) this).field_l;
            }
            ((cra) this).field_l = ((cra) this).field_l + 1;
            if (!(((cra) this).field_h.length != ((cra) this).field_l)) {
                ((cra) this).field_l = 0;
            }
            ((cra) this).field_o = true;
            ((cra) this).field_i = 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cra.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public cra() {
        ((cra) this).field_o = false;
    }

    cra(int param0) {
        ((cra) this).field_o = false;
        ((cra) this).field_e = new int[param0];
        ((cra) this).field_k = -1;
        ((cra) this).field_h = new dk[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "There are no valid types of game that match your preferences.";
    }
}
