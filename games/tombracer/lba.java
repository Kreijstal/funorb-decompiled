/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lba extends fi {
    private int field_l;
    private int field_s;
    private int field_o;
    static int field_p;
    private int field_m;
    private int field_k;
    private int field_i;
    private byte[] field_n;
    private int field_q;
    static ina field_r;
    private int field_j;

    final void a(int param0, byte param1, int param2) {
        int var5;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1 < -37) {
            break L0;
          } else {
            lba.d(-7);
            break L0;
          }
        }
        if (0 != param2) {
          L1: {
            this.field_l = this.field_q * this.field_o >> 1713718860;
            stackIn_9_0 = this;

            stackIn_9_1 = this.field_j;

            if ((param0 ^ -1) > -1) {
              stackIn_10_0 = this;
              stackIn_10_1 = stackIn_9_1;
              stackIn_10_2 = -param0;
              break L1;
            } else {
              stackIn_10_0 = this;
              stackIn_10_1 = stackIn_9_1;
              stackIn_10_2 = param0;
              break L1;
            }
          }
          ((lba) (this)).field_q = stackIn_10_1 + -stackIn_10_2;
          if (this.field_l >= 0) {
            if (4096 >= this.field_l) {
              this.field_q = this.field_q * this.field_q >> -1831798100;
              this.field_q = this.field_l * this.field_q >> 940271724;
              this.field_m = this.field_m + (this.field_s * this.field_q >> -37721428);
              this.field_s = this.field_k * this.field_s >> -1831605204;
              return;
            } else {
              this.field_l = 4096;
              this.field_q = this.field_q * this.field_q >> -1831798100;
              this.field_q = this.field_l * this.field_q >> 940271724;
              this.field_m = this.field_m + (this.field_s * this.field_q >> -37721428);
              this.field_s = this.field_k * this.field_s >> -1831605204;
              return;
            }
          } else {
            this.field_l = 0;
            this.field_q = this.field_q * this.field_q >> -1831798100;
            this.field_q = this.field_l * this.field_q >> 940271724;
            this.field_m = this.field_m + (this.field_s * this.field_q >> -37721428);
            this.field_s = this.field_k * this.field_s >> -1831605204;
            return;
          }
        } else {
          L2: {
            stackIn_5_0 = this;

            stackIn_5_1 = this.field_j;

            if (-1 < (param0 ^ -1)) {
              stackIn_6_0 = this;
              stackIn_6_1 = stackIn_5_1;
              stackIn_6_2 = -param0;
              break L2;
            } else {
              stackIn_6_0 = this;
              stackIn_6_1 = stackIn_5_1;
              stackIn_6_2 = param0;
              break L2;
            }
          }
          ((lba) (this)).field_q = stackIn_6_1 + -stackIn_6_2;
          this.field_q = this.field_q * this.field_q >> -18676436;
          this.field_l = 4096;
          this.field_m = this.field_q;
          return;
        }
    }

    final static void a(int param0, int param1, cn param2, boolean param3, iu[][] param4, int[] param5, String[][] param6, cn param7, int[] param8, String[] param9, hja[] param10, String[][] param11, String[] param12, iu[][] param13, cn param14, int param15, int param16, byte[] param17, byte[] param18) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          L0: {
            var20 = (String[]) null;
            bba.a(param12, param9, param3, param0, param17, (String[]) null, 95, param15, param13, param5, param6, param7, param18, param2, param14, param4, param8, param16, param10, param11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var19 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var19);

            stackIn_4_1 = new StringBuilder().append("lba.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param7 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param8 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param10 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param11 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param12 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param13 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param14 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param15).append(',').append(param16).append(',');

            if (param17 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

            if (param18 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L14;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_44_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5, String param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 53) {
                break L1;
              } else {
                field_p = -69;
                break L1;
              }
            }
            L2: {
              if (0 != sua.field_K.field_y) {
                if (fua.field_g) {
                  break L2;
                } else {
                  if (!ok.field_s) {
                    ni.field_c = true;
                    break L2;
                  } else {
                    ola.e((byte) 112);
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            if (ni.field_c) {
              av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
              wi.field_s.c(-73, param0);
              if (param0) {
                L3: {
                  if (lra.field_d.field_y == 0) {
                    break L3;
                  } else {
                    ni.field_c = false;
                    break L3;
                  }
                }
                if (0 == qpa.field_b.field_y) {
                  break L0;
                } else {
                  ufa.a(true);
                  ni.field_c = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8);

            stackIn_19_1 = new StringBuilder().append("lba.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param7 + ')');
        }
    }

    final void a(byte param0) {
        qea var3;
        if (param0 != 50) {
          var3 = (qea) null;
          lba.a((byte) 11, (qea) null, 6);
          this.field_m = 0;
          this.field_i = 0;
          return;
        } else {
          this.field_m = 0;
          this.field_i = 0;
          return;
        }
    }

    final static loa a(byte param0, qea param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        loa stackIn_3_0 = null;
        fva stackIn_12_0 = null;
        jra stackIn_14_0 = null;
        rja stackIn_16_0 = null;
        tna stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 27) {
              var3_int = param2;
              if (-1 != (var3_int ^ -1)) {
                if (var3_int != 1) {
                  if (2 == var3_int) {
                    stackIn_16_0 = new rja(param1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var3_int ^ -1) == -4) {
                      stackIn_18_0 = new tna(param1);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      throw new IllegalStateException("Unrecognised maze gen type: " + param2);
                    }
                  }
                } else {
                  stackIn_14_0 = new jra(param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_12_0 = new fva(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (loa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("lba.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L1;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (loa) ((Object) stackIn_12_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (loa) ((Object) stackIn_14_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (loa) ((Object) stackIn_16_0);
              } else {
                return (loa) ((Object) stackIn_18_0);
              }
            }
          }
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 != 1713718860) {
            lba.d(-50);
        }
    }

    void a(boolean param0, byte param1, int param2) {
        this.field_n[param2] = (byte)param1;
        if (param0) {
            this.field_l = 34;
        }
    }

    final void c(int param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        this.field_s = this.field_k;
        if (param0 == 32164) {
          this.field_m = this.field_m >> 4;
          if ((this.field_m ^ -1) <= -1) {
            if (255 < this.field_m) {
              this.field_m = 255;
              fieldTemp$6 = this.field_i;
              this.field_i = this.field_i + 1;
              this.a(false, (byte)this.field_m, fieldTemp$6);
              this.field_m = 0;
              return;
            } else {
              fieldTemp$7 = this.field_i;
              this.field_i = this.field_i + 1;
              this.a(false, (byte)this.field_m, fieldTemp$7);
              this.field_m = 0;
              return;
            }
          } else {
            this.field_m = 0;
            fieldTemp$8 = this.field_i;
            this.field_i = this.field_i + 1;
            this.a(false, (byte)this.field_m, fieldTemp$8);
            this.field_m = 0;
            return;
          }
        } else {
          this.field_s = -4;
          this.field_m = this.field_m >> 4;
          if ((this.field_m ^ -1) <= -1) {
            if (255 >= this.field_m) {
              fieldTemp$9 = this.field_i;
              this.field_i = this.field_i + 1;
              this.a(false, (byte)this.field_m, fieldTemp$9);
              this.field_m = 0;
              return;
            } else {
              this.field_m = 255;
              fieldTemp$10 = this.field_i;
              this.field_i = this.field_i + 1;
              this.a(false, (byte)this.field_m, fieldTemp$10);
              this.field_m = 0;
              return;
            }
          } else {
            this.field_m = 0;
            fieldTemp$11 = this.field_i;
            this.field_i = this.field_i + 1;
            this.a(false, (byte)this.field_m, fieldTemp$11);
            this.field_m = 0;
            return;
          }
        }
    }

    lba(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        this.field_j = (int)(param6 * 4096.0f);
        this.field_o = (int)(param7 * 4096.0f);
        int dupTemp$0 = (int)(4096.0 * Math.pow(0.5, (double)(-param5)));
        this.field_k = dupTemp$0;
        this.field_s = dupTemp$0;
    }

    static {
        field_p = 0;
    }
}
