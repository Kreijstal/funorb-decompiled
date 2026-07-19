/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends ck {
    boolean field_q;
    static boolean field_v;
    static ul field_w;
    boolean field_p;
    int field_A;
    static int field_o;
    int field_x;
    int field_s;
    int field_B;
    int field_u;
    int field_y;
    int field_r;
    boolean field_z;
    static int field_t;

    public static void a(byte param0) {
        u discarded$0 = null;
        field_w = null;
        if (param0 >= -102) {
            byte[] var2 = (byte[]) null;
            discarded$0 = je.a(-111, (byte[]) null);
        }
    }

    final static u a(int param0, byte[] param1) {
        u var2 = null;
        RuntimeException var2_ref = null;
        u stackIn_5_0 = null;
        u stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        u stackOut_6_0 = null;
        u stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param0 >= 57) {
                var2 = new u(param1, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
                uh.a(9324);
                stackOut_6_0 = (u) (var2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (u) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("je.B(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    je(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          this.field_x = param2;
          this.field_s = param0;
          this.field_q = false;
          this.field_A = param1;
          this.field_p = false;
          var4 = 50;
          this.field_z = false;
          if (-7 != (this.field_s ^ -1)) {
            break L0;
          } else {
            var4 = 5;
            break L0;
          }
        }
        L1: {
          if (this.field_s != 5) {
            break L1;
          } else {
            this.field_z = true;
            var4 = 125;
            break L1;
          }
        }
        L2: {
          if ((this.field_s ^ -1) != -13) {
            break L2;
          } else {
            this.field_z = false;
            var4 = 5;
            break L2;
          }
        }
        L3: {
          if (-4 != (this.field_s ^ -1)) {
            break L3;
          } else {
            this.field_z = true;
            var4 = 100;
            break L3;
          }
        }
        L4: {
          if (0 != this.field_s) {
            break L4;
          } else {
            L5: {
              var4 = 10;
              if (-1 != (this.field_A ^ -1)) {
                break L5;
              } else {
                var4 = 25;
                break L5;
              }
            }
            L6: {
              if (1 != this.field_A) {
                break L6;
              } else {
                var4 = 20;
                break L6;
              }
            }
            L7: {
              if ((this.field_A ^ -1) != -3) {
                break L7;
              } else {
                var4 = 35;
                break L7;
              }
            }
            L8: {
              if (3 != this.field_A) {
                break L8;
              } else {
                var4 = 50;
                break L8;
              }
            }
            L9: {
              if (6 != this.field_A) {
                break L9;
              } else {
                var4 = 40;
                this.field_z = true;
                break L9;
              }
            }
            L10: {
              if ((this.field_A ^ -1) != -8) {
                break L10;
              } else {
                var4 = 50;
                this.field_z = true;
                break L10;
              }
            }
            L11: {
              if (8 != this.field_A) {
                break L11;
              } else {
                var4 = 100;
                this.field_z = true;
                break L11;
              }
            }
            L12: {
              if ((this.field_A ^ -1) != -10) {
                break L12;
              } else {
                var4 = 30;
                this.field_z = true;
                break L12;
              }
            }
            L13: {
              if ((this.field_A ^ -1) != -11) {
                break L13;
              } else {
                var4 = 20;
                this.field_z = true;
                break L13;
              }
            }
            L14: {
              if (this.field_A != 4) {
                break L14;
              } else {
                var4 = 75;
                break L14;
              }
            }
            if (5 != this.field_A) {
              break L4;
            } else {
              var4 = 75;
              break L4;
            }
          }
        }
        L15: {
          if ((this.field_s ^ -1) != -8) {
            break L15;
          } else {
            this.field_z = true;
            var4 = 25;
            if (3 != this.field_A) {
              break L15;
            } else {
              var4 = 100;
              break L15;
            }
          }
        }
        L16: {
          if (this.field_s != 8) {
            break L16;
          } else {
            var4 = 25;
            this.field_z = true;
            break L16;
          }
        }
        L17: {
          if ((this.field_s ^ -1) != -10) {
            break L17;
          } else {
            this.field_z = true;
            var4 = 25;
            break L17;
          }
        }
        L18: {
          if (11 != this.field_s) {
            break L18;
          } else {
            var4 = 25;
            this.field_z = false;
            break L18;
          }
        }
        L19: {
          if (this.field_s != 10) {
            break L19;
          } else {
            var4 = 1;
            break L19;
          }
        }
        this.field_r = var4 + this.field_x;
    }

    static {
        field_v = false;
        field_o = 0;
        field_w = new ul();
    }
}
