/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends kf implements qh, vn {
    private ek field_X;
    static int field_gb;
    private ek field_ib;
    static int[] field_V;
    static boolean field_db;
    private rk field_bb;
    private boolean field_Z;
    private boolean field_W;
    private boolean field_eb;
    static int field_ab;
    private rk field_cb;
    static String field_fb;
    static w field_jb;
    static int field_S;
    private String field_T;
    static String field_Y;
    private ek field_U;
    static String field_hb;

    he(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (gl) null);
        de dupTemp$2 = null;
        de dupTemp$3 = null;
        RuntimeException var6 = null;
        fk var6_ref = null;
        mm var7 = null;
        String var8 = null;
        ij var9 = null;
        de var12 = null;
        de var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        ek stackIn_16_1 = null;
        ek stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        ek stackIn_17_1 = null;
        ek stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ek stackIn_18_1 = null;
        ek stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        ek stackOut_15_1 = null;
        ek stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        ek stackOut_17_1 = null;
        ek stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        ek stackOut_16_1 = null;
        ek stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              this.field_T = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((he) (this)).field_Z = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param4) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((he) (this)).field_W = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((he) (this)).field_eb = stackIn_10_1 != 0;
              if (!this.field_Z) {
                break L4;
              } else {
                L5: {
                  if (this.field_eb) {
                    break L5;
                  } else {
                    if (!this.field_W) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_bb = (rk) ((Object) new og(param0, (kg) (this), 100));
              this.field_cb = (rk) ((Object) new og("", (kg) (this), 20));
              if (this.field_Z) {
                this.field_U = new ek(sh.field_c, (kg) null);
                this.field_X = new ek(ig.field_Tb, (kg) null);
                this.field_bb.field_I = false;
                break L6;
              } else {
                L7: {
                  this.field_U = new ek(jh.field_a, (kg) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (!this.field_W) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = bl.field_X;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = ic.field_b;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((he) (this)).field_X = new ek(stackIn_18_3, (kg) null);
                if (!this.field_eb) {
                  break L6;
                } else {
                  this.field_ib = new ek(i.field_f, (kg) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_bb.field_p = (gl) ((Object) new di(10000536));
              this.field_cb.field_p = (gl) ((Object) new gm(10000536));
              var6_ref = new fk();
              this.field_U.field_p = (gl) ((Object) var6_ref);
              if (this.field_X == null) {
                break L8;
              } else {
                this.field_X.field_p = (gl) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              this.field_bb.field_B = f.field_v;
              if (this.field_ib == null) {
                break L9;
              } else {
                this.field_ib.field_p = (gl) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              if (null == this.field_ib) {
                break L10;
              } else {
                this.field_ib.field_B = tm.field_h;
                break L10;
              }
            }
            L11: {
              if (!this.field_Z) {
                if (this.field_W) {
                  this.field_X.field_B = kh.field_c;
                  this.field_X.field_p = (gl) ((Object) new on());
                  break L11;
                } else {
                  this.field_X.field_p = (gl) ((Object) new on());
                  break L11;
                }
              } else {
                this.field_X.field_B = gi.field_d;
                break L11;
              }
            }
            L12: {
              this.field_D = 15;
              var7 = hh.field_e;
              if (this.field_T == null) {
                break L12;
              } else {
                this.field_D = this.field_D + (5 + var7.b(this.field_T, this.field_t + -40, var7.field_R));
                break L12;
              }
            }
            L13: {
              var8 = ua.field_G;
              var9 = jb.a(se.h(25144), -10314);
              if (var9 != ah.field_f) {
                if (var9 != ge.field_g) {
                  break L13;
                } else {
                  var8 = sl.field_a;
                  break L13;
                }
              } else {
                var8 = v.field_g;
                break L13;
              }
            }
            L14: {
              dupTemp$2 = new de(10, this.field_D, this.field_t - 20, 25, this.field_bb, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.b(dupTemp$2, (byte) -55);
              this.field_D = this.field_D + (((ce) ((Object) var12)).field_y + 5);
              dupTemp$3 = new de(10, this.field_D, -20 + this.field_t, 25, this.field_cb, false, 80, 3, var7, 16777215, ch.field_d);
              var13 = dupTemp$3;
              this.b(dupTemp$3, (byte) -55);
              this.field_U.field_v = (kg) (this);
              this.field_D = this.field_D + (5 + ((ce) ((Object) var13)).field_y);
              if (this.field_ib == null) {
                break L14;
              } else {
                this.field_ib.field_v = (kg) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_X == null) {
                break L15;
              } else {
                this.field_X.field_v = (kg) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_ib) {
                this.field_U.b(30, this.field_t - 16, 8, this.field_D, -16555);
                this.field_D = this.field_D + 35;
                break L16;
              } else {
                this.field_U.b(30, this.field_t + -95, 85, this.field_D, -16555);
                this.field_D = this.field_D + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_ib) {
                break L17;
              } else {
                this.field_ib.b(30, -10 + (-6 + this.field_t), 8, this.field_D, -16555);
                this.field_D = this.field_D + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_X == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_Z) {
                    break L19;
                  } else {
                    if (!this.field_W) {
                      this.field_X.b(20, 40, 8, this.field_D, -16555);
                      this.field_D = this.field_D + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_X.b(30, -10 + (-6 + this.field_t), 8, this.field_D, -16555);
                this.field_D = this.field_D + 35;
                break L18;
              }
            }
            L20: {
              this.b(this.field_D + 3, this.field_t, 0, 0, -16555);
              this.b(this.field_U, (byte) -55);
              if (null == this.field_ib) {
                break L20;
              } else {
                this.b(this.field_ib, (byte) -55);
                break L20;
              }
            }
            L21: {
              if (this.field_X == null) {
                break L21;
              } else {
                this.b(this.field_X, (byte) -55);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("he.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(int param0, rk param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (this.field_bb == param1) {
                discarded$2 = this.field_cb.a(false, (ce) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != this.field_cb) {
                break L2;
              } else {
                this.f((byte) -29);
                break L2;
              }
            }
            L3: {
              if (param0 == -2569) {
                break L3;
              } else {
                field_fb = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("he.K(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1, int param2, uf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
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
        byte[] stackOut_17_0 = null;
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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param3.a(16, (byte) 81);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (~param1.length != ~var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              var5 = param3.a(3, (byte) 52);
              L3: {
                var6 = (byte)param3.a(8, (byte) 58);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (byte)(var6 + param3.a(var5, (byte) 117));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) (param1);
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("he.F(").append(5).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(16).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    private final void f(byte param0) {
        L0: {
          L1: {
            if (ri.a(71)) {
              break L1;
            } else {
              if (this.field_bb.field_E.length() <= 0) {
                break L0;
              } else {
                if (this.field_cb.field_E.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          da.a((byte) -109, this.field_bb.field_E, this.field_cb.field_E);
          break L0;
        }
        L2: {
          if (param0 <= -26) {
            break L2;
          } else {
            field_hb = (String) null;
            break L2;
          }
        }
    }

    final String j(int param0) {
        if (param0 != 80) {
            he.a(false, false, -20);
        }
        if (!(this.field_bb.field_E != null)) {
            return "";
        }
        return this.field_bb.field_E;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vj var4 = null;
        Object var5 = null;
        wb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pf var16 = null;
        pf var17 = null;
        nm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        nm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        nm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        w stackIn_19_0 = null;
        w stackIn_20_0 = null;
        w stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        nm stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        nm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        w stackOut_18_0 = null;
        w stackOut_20_0 = null;
        String stackOut_20_1 = null;
        w stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = ge.field_f.field_Rb;
              stackOut_1_1 = 2 + kf.field_O;
              stackOut_1_2 = param2 * ((kf.field_O - -2) * 3);
              stackOut_1_3 = -15230;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (ki.field_w != ge.field_f.field_Rb) {
                stackOut_3_0 = (nm) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                break L1;
              } else {
                stackOut_2_0 = (nm) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((nm) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, 2, param1) ? 1 : 0;
                var4 = ge.field_f.field_Sb.field_M;
                if (jj.field_b == 2) {
                  break L3;
                } else {
                  if (jj.field_b == 1) {
                    break L3;
                  } else {
                    ge.field_f.field_Hb = false;
                    ge.field_f.field_Rb.field_Rb.field_Y = wf.field_m;
                    gk.a(ge.field_f.field_Sb, true);
                    break L2;
                  }
                }
              }
              ge.field_f.field_Rb.field_Rb.field_Y = null;
              ge.field_f.field_Hb = true;
              var5 = null;
              var6 = (wb) ((Object) var4.c((byte) 95));
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (ge.field_f.field_Ob.field_ob == 0) {
                      break L5;
                    } else {
                      vh.field_h = new hb(ge.field_f.field_Ob.field_E, ge.field_f.field_Ob.field_pb, ge.field_f.field_Ob.field_mb, ge.field_f.field_Ob.field_N, pj.field_L, ah.field_h, ua.field_H, ua.field_H);
                      of.field_d = 2;
                      break L5;
                    }
                  }
                  if (ge.field_f.field_Nb.field_ob == 0) {
                    break L2;
                  } else {
                    vh.field_h = new hb(ge.field_f.field_Nb.field_E, ge.field_f.field_Nb.field_pb, ge.field_f.field_Nb.field_mb, ge.field_f.field_Nb.field_N, bn.field_b, ah.field_h, ua.field_H, ua.field_H);
                    of.field_d = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (null == var6.field_M) {
                      var6.field_Sb = new w(0L, gg.field_G);
                      var6.a(var6.field_Sb, -16834);
                      var6.field_Wb = new w(0L, gg.field_G);
                      var6.a(var6.field_Wb, -16834);
                      var6.d(-36);
                      var7 = 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_mb = ge.field_f.field_Sb.field_mb;
                    var6.field_Sb.a(var6.field_mb, 0, 0, kf.field_O, 0);
                    var8 = 0;
                    if (var6.field_Tb == null) {
                      break L7;
                    } else {
                      if (!var6.field_Tb.equals("")) {
                        var6.field_Wb.field_I = a.field_p;
                        var6.field_Wb.field_Bb = 16737894;
                        var6.field_Wb.a(3 + a.field_p.field_K, 0, 0, kf.field_O, 0);
                        var8 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_mb;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = 3 + a.field_p.field_K;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_18_0 = var6.field_Sb;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var10 <= 0) {
                      stackOut_20_0 = (w) ((Object) stackIn_20_0);
                      stackOut_20_1 = var6.field_Ob;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (w) ((Object) stackIn_19_0);
                      stackOut_19_1 = mm.a(var6.field_Sb.field_J, var6.field_Ob, var10);
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_Y = stackIn_21_1;
                    if (var6.field_Sb.field_Y.equals(var6.field_Ob)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L10;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_24_0;
                    var6.field_Sb.a(var10, 0, 0, kf.field_O, var9);
                    if (var3_int != 0) {
                      break L11;
                    } else {
                      var6.field_F = kf.field_O - var6.field_N;
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      ge.field_f.field_Sb.a((w) (var5), var6, 2, 0);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var6.field_Wb) {
                        break L14;
                      } else {
                        if (!var6.field_Wb.field_jb) {
                          break L14;
                        } else {
                          sl.field_g = var6.field_Tb;
                          break L13;
                        }
                      }
                    }
                    if (!var6.field_Sb.field_jb) {
                      break L13;
                    } else {
                      if (var11 != 0) {
                        sl.field_g = var6.field_Ob;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    var5 = var6;
                    if (var6.field_ob == 0) {
                      break L15;
                    } else {
                      sl.a(var6.field_Pb, (int[]) null, (byte) 112, ge.field_f.field_Rb, var6, var6.field_Ob, 0L, -1, -1);
                      var16 = w.field_H;
                      var13_ref_String = wk.field_o;
                      var16.field_h.a(var13_ref_String, 7, 72);
                      var17 = w.field_H;
                      var13 = field_S;
                      var14 = nf.field_h;
                      var17.field_h.b(var14, var13, 89, 0, 0);
                      break L15;
                    }
                  }
                  var6 = (wb) ((Object) var4.d(param0));
                  continue L4;
                }
              }
            }
            L16: {
              if (param0) {
                break L16;
              } else {
                field_jb = (w) null;
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "he.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (128 > param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (255 >= param1) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 == 0) {
                  break L4;
                } else {
                  var6 = nh.field_l;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= var6.length) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "he.B(" + -97 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param0 = jm.a('_', param0, "", -1);
                var3 = oa.a(param0, -1);
                var4 = -17 % ((58 - param1) / 55);
                if (param2.indexOf(param0) != -1) {
                  break L2;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3_ref);
            stackOut_6_1 = new StringBuilder().append("he.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(String param0, int param1) {
        rk var3 = null;
        String var4 = null;
        boolean discarded$0 = false;
        try {
            var3 = this.field_bb;
            var4 = param0;
            var3.a(var4, (byte) 114, false);
            if (param1 != 30534) {
                discarded$0 = this.a(127, 108, (ce) null, 'ﾫ');
            }
            this.field_cb.m(0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "he.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(65, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = 56 / ((-22 - param0) / 49);
              if (param1 != 98) {
                if (99 == param1) {
                  stackOut_9_0 = this.a(32, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.a(param2, (byte) -45);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("he.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    public final void a(int param0, rk param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 16737894) {
                break L1;
              } else {
                this.field_W = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("he.N(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0) {
        if (param0 <= 28) {
            this.field_X = (ek) null;
        }
        this.field_bb.m(0);
        this.field_cb.m(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (this.field_T != null) {
            discarded$0 = hh.field_e.a(this.field_T, param0 + (this.field_u - -20), param3 + (this.field_D + 15), this.field_t - 40, this.field_y, 16777215, -1, 1, 0, hh.field_e.field_R);
        }
        if (param1 > -103) {
            field_jb = (w) null;
        }
        if (!(this.field_ib == null)) {
            hk.a(10 + param0, 134 + param3, -20 + this.field_t, 4210752);
        }
        super.a(param0, -119, param2, param3);
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != this.field_U) {
                if (param2 == this.field_ib) {
                  ha.e(0);
                  break L1;
                } else {
                  if (param2 != this.field_X) {
                    break L1;
                  } else {
                    if (this.field_Z) {
                      qi.h(17);
                      break L1;
                    } else {
                      if (this.field_W) {
                        t.k((byte) -73);
                        break L1;
                      } else {
                        lg.a(8927);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                this.f((byte) -37);
                break L1;
              }
            }
            L2: {
              if (param0 == 67) {
                break L2;
              } else {
                discarded$1 = this.j(-21);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("he.H(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        tf.field_gb.a(1141039778, param0);
    }

    public static void i(int param0) {
        field_hb = null;
        field_Y = null;
        field_V = null;
        field_fb = null;
        field_jb = null;
    }

    static {
        field_V = new int[4];
        field_gb = 250;
        field_fb = "Loading sound effects";
        field_S = 0;
    }
}
