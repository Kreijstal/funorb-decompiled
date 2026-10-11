/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cca extends rva {
    vua field_A;
    jo field_x;
    private boolean field_y;
    private jo field_D;
    private boolean field_B;
    static long field_z;

    final static iu[] a(int param0, cn param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        iu[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!jna.a(false, param0, param3, param1)) {
            stackIn_2_0 = null;
            return (iu[]) (stackIn_2_0);
          }
          if (param2 > -7) {
            field_z = 29L;
          }
          stackIn_6_0 = pn.i(94);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cca.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 > -122) {
          this.field_x = (jo) null;
          if (null != this.field_x) {
            this.field_A.field_x.field_n = -(int)((long)this.field_x.field_O * (long)(this.field_A.field_x.field_p - this.field_A.field_p) >> 16);
          }
          if (null == this.field_D) {
            return;
          }
          this.field_A.field_x.field_i = -(int)((long)(-this.field_A.field_m + this.field_A.field_x.field_m) * (long)this.field_D.field_C >> 16);
          return;
        }
        if (null != this.field_x) {
          this.field_A.field_x.field_n = -(int)((long)this.field_x.field_O * (long)(this.field_A.field_x.field_p - this.field_A.field_p) >> 16);
        }
        if (null != this.field_D) {
          this.field_A.field_x.field_i = -(int)((long)(-this.field_A.field_m + this.field_A.field_x.field_m) * (long)this.field_D.field_C >> 16);
          return;
        }
    }

    final void a(byte param0) {
        boolean discarded$2 = false;
        boolean discarded$1 = false;
        boolean discarded$0 = false;
        boolean discarded$5 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        jo stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_15_4;
        jo stackIn_20_0;
        int stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        int stackIn_21_5;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        jo stackIn_35_0;
        int stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        int stackIn_36_4;
        jo stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        int stackIn_41_4;
        int stackIn_42_5;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        jo stackIn_54_0;
        int stackIn_54_1;
        int stackIn_54_2;
        int stackIn_54_3;
        int stackIn_55_4;
        jo stackIn_60_0;
        int stackIn_60_1;
        int stackIn_60_2;
        int stackIn_60_3;
        int stackIn_60_4;
        int stackIn_61_5;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        jo stackIn_72_0;
        int stackIn_72_1;
        int stackIn_72_2;
        int stackIn_72_3;
        int stackIn_73_4;
        jo stackIn_78_0;
        int stackIn_78_1;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        int stackIn_79_5;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_91_0 = 0;
        jo stackIn_94_0;
        int stackIn_94_1;
        int stackIn_94_2;
        int stackIn_94_3;
        int stackIn_95_4;
        jo stackIn_100_0;
        int stackIn_100_1;
        int stackIn_100_2;
        int stackIn_100_3;
        int stackIn_100_4;
        int stackIn_101_5;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        jo stackIn_112_0;
        int stackIn_112_1;
        int stackIn_112_2;
        int stackIn_112_3;
        int stackIn_113_4;
        jo stackIn_118_0;
        int stackIn_118_1;
        int stackIn_118_2;
        int stackIn_118_3;
        int stackIn_118_4;
        int stackIn_119_5;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        jo stackIn_132_0;
        int stackIn_132_1;
        int stackIn_132_2;
        int stackIn_132_3;
        int stackIn_133_4;
        jo stackIn_138_0;
        int stackIn_138_1;
        int stackIn_138_2;
        int stackIn_138_3;
        int stackIn_138_4;
        int stackIn_139_5;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        jo stackIn_150_0;
        int stackIn_150_1;
        int stackIn_150_2;
        int stackIn_150_3;
        int stackIn_151_4;
        jo stackIn_156_0;
        int stackIn_156_1;
        int stackIn_156_2;
        int stackIn_156_3;
        int stackIn_156_4;
        int stackIn_157_5;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        jo stackIn_169_0;
        int stackIn_169_1;
        int stackIn_169_2;
        int stackIn_169_3;
        int stackIn_170_4;
        jo stackIn_175_0;
        int stackIn_175_1;
        int stackIn_175_2;
        int stackIn_175_3;
        int stackIn_175_4;
        int stackIn_176_5;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        jo stackIn_187_0;
        int stackIn_187_1;
        int stackIn_187_2;
        int stackIn_187_3;
        int stackIn_188_4;
        jo stackIn_193_0;
        int stackIn_193_1;
        int stackIn_193_2;
        int stackIn_193_3;
        int stackIn_193_4;
        int stackIn_194_5;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var3Lifetime4;
        int var3Lifetime5;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var4Lifetime1Lifetime1;
        int var4Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime2Lifetime1;
        if (this.field_B) {
          stackIn_83_0 = 0;
        } else {
          if (null == this.field_x) {
            var2 = 0;
            if (this.field_y) {
              var3 = 0;
              if (param0 != 88) {
                discarded$2 = this.a(-26, -25);
              }
              if (this.field_x == null) {
                stackIn_8_0 = this.field_m;
              } else {
                stackIn_8_0 = this.field_m - this.field_x.field_m;
              }
              var4 = stackIn_8_0;
              if (null != this.field_D) {
                stackIn_11_0 = -this.field_D.field_p + this.field_p;
              } else {
                stackIn_11_0 = this.field_p;
              }
              var5 = stackIn_11_0;
              this.field_A.a((byte) -31, var4, var5, var2, var3);
              if (null != this.field_x) {
                stackIn_14_0 = this.field_x;
                stackIn_14_1 = -31;
                stackIn_14_2 = this.field_x.field_m;
                stackIn_14_3 = this.field_A.field_p;
                if (this.field_B) {
                  stackIn_15_4 = -this.field_x.field_m + this.field_m;
                } else {
                  stackIn_15_4 = 0;
                }
                ((jo) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_15_4, this.field_A.field_n);
              }
              if (null != this.field_D) {
                stackIn_20_0 = this.field_D;
                stackIn_20_1 = -31;
                stackIn_20_2 = this.field_A.field_m;
                stackIn_20_3 = this.field_D.field_p;
                stackIn_20_4 = this.field_A.field_i;
                if (!this.field_y) {
                  stackIn_21_5 = 0;
                } else {
                  stackIn_21_5 = -this.field_D.field_p + this.field_p;
                }
                ((jo) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2, stackIn_20_3, stackIn_20_4, stackIn_21_5);
              }
              this.c(-31791);
              return;
            }
            if (null == this.field_D) {
              var3Lifetime4 = 0;
              if (param0 != 88) {
                discarded$1 = this.a(-26, -25);
              }
              if (this.field_x == null) {
                stackIn_29_0 = this.field_m;
              } else {
                stackIn_29_0 = this.field_m - this.field_x.field_m;
              }
              var4Lifetime5 = stackIn_29_0;
              if (null != this.field_D) {
                stackIn_32_0 = -this.field_D.field_p + this.field_p;
              } else {
                stackIn_32_0 = this.field_p;
              }
              var5Lifetime5 = stackIn_32_0;
              this.field_A.a((byte) -31, var4Lifetime5, var5Lifetime5, var2, var3Lifetime4);
              if (null != this.field_x) {
                stackIn_35_0 = this.field_x;
                stackIn_35_1 = -31;
                stackIn_35_2 = this.field_x.field_m;
                stackIn_35_3 = this.field_A.field_p;
                if (this.field_B) {
                  stackIn_36_4 = -this.field_x.field_m + this.field_m;
                } else {
                  stackIn_36_4 = 0;
                }
                ((jo) (Object) stackIn_35_0).a((byte) stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_36_4, this.field_A.field_n);
              }
              if (null != this.field_D) {
                stackIn_41_0 = this.field_D;
                stackIn_41_1 = -31;
                stackIn_41_2 = this.field_A.field_m;
                stackIn_41_3 = this.field_D.field_p;
                stackIn_41_4 = this.field_A.field_i;
                if (!this.field_y) {
                  stackIn_42_5 = 0;
                } else {
                  stackIn_42_5 = -this.field_D.field_p + this.field_p;
                }
                ((jo) (Object) stackIn_41_0).a((byte) stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, stackIn_42_5);
              }
              this.c(-31791);
              return;
            }
            var3Lifetime5 = this.field_D.field_p;
            if (param0 == 88) {
              if (this.field_x == null) {
                stackIn_66_0 = this.field_m;
              } else {
                stackIn_66_0 = this.field_m - this.field_x.field_m;
              }
              var4Lifetime6 = stackIn_66_0;
              if (null != this.field_D) {
                stackIn_69_0 = -this.field_D.field_p + this.field_p;
              } else {
                stackIn_69_0 = this.field_p;
              }
              var5Lifetime6 = stackIn_69_0;
              this.field_A.a((byte) -31, var4Lifetime6, var5Lifetime6, var2, var3Lifetime5);
              if (null != this.field_x) {
                stackIn_72_0 = this.field_x;
                stackIn_72_1 = -31;
                stackIn_72_2 = this.field_x.field_m;
                stackIn_72_3 = this.field_A.field_p;
                if (this.field_B) {
                  stackIn_73_4 = -this.field_x.field_m + this.field_m;
                } else {
                  stackIn_73_4 = 0;
                }
                ((jo) (Object) stackIn_72_0).a((byte) stackIn_72_1, stackIn_72_2, stackIn_72_3, stackIn_73_4, this.field_A.field_n);
              }
              if (null != this.field_D) {
                stackIn_78_0 = this.field_D;
                stackIn_78_1 = -31;
                stackIn_78_2 = this.field_A.field_m;
                stackIn_78_3 = this.field_D.field_p;
                stackIn_78_4 = this.field_A.field_i;
                if (!this.field_y) {
                  stackIn_79_5 = 0;
                } else {
                  stackIn_79_5 = -this.field_D.field_p + this.field_p;
                }
                ((jo) (Object) stackIn_78_0).a((byte) stackIn_78_1, stackIn_78_2, stackIn_78_3, stackIn_78_4, stackIn_79_5);
              }
              this.c(-31791);
              return;
            }
            discarded$0 = this.a(-26, -25);
            if (this.field_x == null) {
              stackIn_48_0 = this.field_m;
            } else {
              stackIn_48_0 = this.field_m - this.field_x.field_m;
            }
            var4Lifetime7 = stackIn_48_0;
            if (null != this.field_D) {
              stackIn_51_0 = -this.field_D.field_p + this.field_p;
            } else {
              stackIn_51_0 = this.field_p;
            }
            var5Lifetime7 = stackIn_51_0;
            this.field_A.a((byte) -31, var4Lifetime7, var5Lifetime7, var2, var3Lifetime5);
            if (null != this.field_x) {
              stackIn_54_0 = this.field_x;
              stackIn_54_1 = -31;
              stackIn_54_2 = this.field_x.field_m;
              stackIn_54_3 = this.field_A.field_p;
              if (this.field_B) {
                stackIn_55_4 = -this.field_x.field_m + this.field_m;
              } else {
                stackIn_55_4 = 0;
              }
              ((jo) (Object) stackIn_54_0).a((byte) stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_55_4, this.field_A.field_n);
            }
            if (null != this.field_D) {
              stackIn_60_0 = this.field_D;
              stackIn_60_1 = -31;
              stackIn_60_2 = this.field_A.field_m;
              stackIn_60_3 = this.field_D.field_p;
              stackIn_60_4 = this.field_A.field_i;
              if (!this.field_y) {
                stackIn_61_5 = 0;
              } else {
                stackIn_61_5 = -this.field_D.field_p + this.field_p;
              }
              ((jo) (Object) stackIn_60_0).a((byte) stackIn_60_1, stackIn_60_2, stackIn_60_3, stackIn_60_4, stackIn_61_5);
            }
            this.c(-31791);
            return;
          }
          stackIn_83_0 = this.field_x.field_m;
        }
        var2Lifetime1 = stackIn_83_0;
        if (this.field_y) {
          var3Lifetime1 = 0;
          if (param0 == 88) {
            if (this.field_x == null) {
              stackIn_106_0 = this.field_m;
            } else {
              stackIn_106_0 = this.field_m - this.field_x.field_m;
            }
            var4Lifetime1 = stackIn_106_0;
            if (null != this.field_D) {
              stackIn_109_0 = -this.field_D.field_p + this.field_p;
            } else {
              stackIn_109_0 = this.field_p;
            }
            var5Lifetime1 = stackIn_109_0;
            this.field_A.a((byte) -31, var4Lifetime1, var5Lifetime1, var2Lifetime1, var3Lifetime1);
            if (null != this.field_x) {
              stackIn_112_0 = this.field_x;
              stackIn_112_1 = -31;
              stackIn_112_2 = this.field_x.field_m;
              stackIn_112_3 = this.field_A.field_p;
              if (this.field_B) {
                stackIn_113_4 = -this.field_x.field_m + this.field_m;
              } else {
                stackIn_113_4 = 0;
              }
              ((jo) (Object) stackIn_112_0).a((byte) stackIn_112_1, stackIn_112_2, stackIn_112_3, stackIn_113_4, this.field_A.field_n);
            }
            if (null != this.field_D) {
              stackIn_118_0 = this.field_D;
              stackIn_118_1 = -31;
              stackIn_118_2 = this.field_A.field_m;
              stackIn_118_3 = this.field_D.field_p;
              stackIn_118_4 = this.field_A.field_i;
              if (!this.field_y) {
                stackIn_119_5 = 0;
              } else {
                stackIn_119_5 = -this.field_D.field_p + this.field_p;
              }
              ((jo) (Object) stackIn_118_0).a((byte) stackIn_118_1, stackIn_118_2, stackIn_118_3, stackIn_118_4, stackIn_119_5);
            }
            this.c(-31791);
            return;
          }
          discarded$5 = this.a(-26, -25);
          if (this.field_x == null) {
            stackIn_88_0 = this.field_m;
          } else {
            stackIn_88_0 = this.field_m - this.field_x.field_m;
          }
          var4Lifetime1Lifetime1 = stackIn_88_0;
          if (null != this.field_D) {
            stackIn_91_0 = -this.field_D.field_p + this.field_p;
          } else {
            stackIn_91_0 = this.field_p;
          }
          var5Lifetime1Lifetime1 = stackIn_91_0;
          this.field_A.a((byte) -31, var4Lifetime1Lifetime1, var5Lifetime1Lifetime1, var2Lifetime1, var3Lifetime1);
          if (null != this.field_x) {
            stackIn_94_0 = this.field_x;
            stackIn_94_1 = -31;
            stackIn_94_2 = this.field_x.field_m;
            stackIn_94_3 = this.field_A.field_p;
            if (this.field_B) {
              stackIn_95_4 = -this.field_x.field_m + this.field_m;
            } else {
              stackIn_95_4 = 0;
            }
            ((jo) (Object) stackIn_94_0).a((byte) stackIn_94_1, stackIn_94_2, stackIn_94_3, stackIn_95_4, this.field_A.field_n);
          }
          if (null != this.field_D) {
            stackIn_100_0 = this.field_D;
            stackIn_100_1 = -31;
            stackIn_100_2 = this.field_A.field_m;
            stackIn_100_3 = this.field_D.field_p;
            stackIn_100_4 = this.field_A.field_i;
            if (!this.field_y) {
              stackIn_101_5 = 0;
            } else {
              stackIn_101_5 = -this.field_D.field_p + this.field_p;
            }
            ((jo) (Object) stackIn_100_0).a((byte) stackIn_100_1, stackIn_100_2, stackIn_100_3, stackIn_100_4, stackIn_101_5);
          }
          this.c(-31791);
          return;
        }
        if (null != this.field_D) {
          var3Lifetime2 = this.field_D.field_p;
          if (param0 == 88) {
            if (this.field_x == null) {
              stackIn_181_0 = this.field_m;
            } else {
              stackIn_181_0 = this.field_m - this.field_x.field_m;
            }
            var4Lifetime2 = stackIn_181_0;
            if (null != this.field_D) {
              stackIn_184_0 = -this.field_D.field_p + this.field_p;
            } else {
              stackIn_184_0 = this.field_p;
            }
            var5Lifetime2 = stackIn_184_0;
            this.field_A.a((byte) -31, var4Lifetime2, var5Lifetime2, var2Lifetime1, var3Lifetime2);
            if (null != this.field_x) {
              stackIn_187_0 = this.field_x;
              stackIn_187_1 = -31;
              stackIn_187_2 = this.field_x.field_m;
              stackIn_187_3 = this.field_A.field_p;
              if (this.field_B) {
                stackIn_188_4 = -this.field_x.field_m + this.field_m;
              } else {
                stackIn_188_4 = 0;
              }
              ((jo) (Object) stackIn_187_0).a((byte) stackIn_187_1, stackIn_187_2, stackIn_187_3, stackIn_188_4, this.field_A.field_n);
            }
            if (null != this.field_D) {
              stackIn_193_0 = this.field_D;
              stackIn_193_1 = -31;
              stackIn_193_2 = this.field_A.field_m;
              stackIn_193_3 = this.field_D.field_p;
              stackIn_193_4 = this.field_A.field_i;
              if (!this.field_y) {
                stackIn_194_5 = 0;
              } else {
                stackIn_194_5 = -this.field_D.field_p + this.field_p;
              }
              ((jo) (Object) stackIn_193_0).a((byte) stackIn_193_1, stackIn_193_2, stackIn_193_3, stackIn_193_4, stackIn_194_5);
            }
            this.c(-31791);
            return;
          }
          discarded$3 = this.a(-26, -25);
          if (this.field_x == null) {
            stackIn_163_0 = this.field_m;
          } else {
            stackIn_163_0 = this.field_m - this.field_x.field_m;
          }
          var4Lifetime2Lifetime1 = stackIn_163_0;
          if (null != this.field_D) {
            stackIn_166_0 = -this.field_D.field_p + this.field_p;
          } else {
            stackIn_166_0 = this.field_p;
          }
          var5Lifetime2Lifetime1 = stackIn_166_0;
          this.field_A.a((byte) -31, var4Lifetime2Lifetime1, var5Lifetime2Lifetime1, var2Lifetime1, var3Lifetime2);
          if (null != this.field_x) {
            stackIn_169_0 = this.field_x;
            stackIn_169_1 = -31;
            stackIn_169_2 = this.field_x.field_m;
            stackIn_169_3 = this.field_A.field_p;
            if (this.field_B) {
              stackIn_170_4 = -this.field_x.field_m + this.field_m;
            } else {
              stackIn_170_4 = 0;
            }
            ((jo) (Object) stackIn_169_0).a((byte) stackIn_169_1, stackIn_169_2, stackIn_169_3, stackIn_170_4, this.field_A.field_n);
          }
          if (null != this.field_D) {
            stackIn_175_0 = this.field_D;
            stackIn_175_1 = -31;
            stackIn_175_2 = this.field_A.field_m;
            stackIn_175_3 = this.field_D.field_p;
            stackIn_175_4 = this.field_A.field_i;
            if (!this.field_y) {
              stackIn_176_5 = 0;
            } else {
              stackIn_176_5 = -this.field_D.field_p + this.field_p;
            }
            ((jo) (Object) stackIn_175_0).a((byte) stackIn_175_1, stackIn_175_2, stackIn_175_3, stackIn_175_4, stackIn_176_5);
          }
          this.c(-31791);
          return;
        }
        var3Lifetime3 = 0;
        if (param0 == 88) {
          if (this.field_x == null) {
            stackIn_144_0 = this.field_m;
          } else {
            stackIn_144_0 = this.field_m - this.field_x.field_m;
          }
          var4Lifetime3 = stackIn_144_0;
          if (null != this.field_D) {
            stackIn_147_0 = -this.field_D.field_p + this.field_p;
          } else {
            stackIn_147_0 = this.field_p;
          }
          var5Lifetime3 = stackIn_147_0;
          this.field_A.a((byte) -31, var4Lifetime3, var5Lifetime3, var2Lifetime1, var3Lifetime3);
          if (null != this.field_x) {
            stackIn_150_0 = this.field_x;
            stackIn_150_1 = -31;
            stackIn_150_2 = this.field_x.field_m;
            stackIn_150_3 = this.field_A.field_p;
            if (this.field_B) {
              stackIn_151_4 = -this.field_x.field_m + this.field_m;
            } else {
              stackIn_151_4 = 0;
            }
            ((jo) (Object) stackIn_150_0).a((byte) stackIn_150_1, stackIn_150_2, stackIn_150_3, stackIn_151_4, this.field_A.field_n);
          }
          if (null != this.field_D) {
            stackIn_156_0 = this.field_D;
            stackIn_156_1 = -31;
            stackIn_156_2 = this.field_A.field_m;
            stackIn_156_3 = this.field_D.field_p;
            stackIn_156_4 = this.field_A.field_i;
            if (!this.field_y) {
              stackIn_157_5 = 0;
            } else {
              stackIn_157_5 = -this.field_D.field_p + this.field_p;
            }
            ((jo) (Object) stackIn_156_0).a((byte) stackIn_156_1, stackIn_156_2, stackIn_156_3, stackIn_156_4, stackIn_157_5);
          }
          this.c(-31791);
          return;
        }
        discarded$4 = this.a(-26, -25);
        if (this.field_x == null) {
          stackIn_126_0 = this.field_m;
        } else {
          stackIn_126_0 = this.field_m - this.field_x.field_m;
        }
        var4Lifetime4 = stackIn_126_0;
        if (null != this.field_D) {
          stackIn_129_0 = -this.field_D.field_p + this.field_p;
        } else {
          stackIn_129_0 = this.field_p;
        }
        var5Lifetime4 = stackIn_129_0;
        this.field_A.a((byte) -31, var4Lifetime4, var5Lifetime4, var2Lifetime1, var3Lifetime3);
        if (null != this.field_x) {
          stackIn_132_0 = this.field_x;
          stackIn_132_1 = -31;
          stackIn_132_2 = this.field_x.field_m;
          stackIn_132_3 = this.field_A.field_p;
          if (this.field_B) {
            stackIn_133_4 = -this.field_x.field_m + this.field_m;
          } else {
            stackIn_133_4 = 0;
          }
          ((jo) (Object) stackIn_132_0).a((byte) stackIn_132_1, stackIn_132_2, stackIn_132_3, stackIn_133_4, this.field_A.field_n);
        }
        if (null != this.field_D) {
          stackIn_138_0 = this.field_D;
          stackIn_138_1 = -31;
          stackIn_138_2 = this.field_A.field_m;
          stackIn_138_3 = this.field_D.field_p;
          stackIn_138_4 = this.field_A.field_i;
          if (!this.field_y) {
            stackIn_139_5 = 0;
          } else {
            stackIn_139_5 = -this.field_D.field_p + this.field_p;
          }
          ((jo) (Object) stackIn_138_0).a((byte) stackIn_138_1, stackIn_138_2, stackIn_138_3, stackIn_138_4, stackIn_139_5);
        }
        this.c(-31791);
        return;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!super.a(param0, param1, param2, param3)) {
            return false;
          }
          this.g((byte) -123);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("cca.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_x == null) {
          if (param0 != -31791) {
            this.g((byte) 98);
          }
        } else {
          if (this.field_A.field_p < this.field_A.field_x.field_p) {
            this.field_x.c(this.field_A.field_x.field_p, this.field_A.field_p, -1789710879);
            if (param0 != -31791) {
              this.g((byte) 98);
            }
            if (this.field_D != null) {
              if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                this.field_D.a((byte) -84, 1, 1);
              } else {
                this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
              }
            }
            return;
          }
          this.field_x.c(1, 1, param0 ^ 1789701680);
          if (param0 == -31791) {
            if (this.field_D != null) {
              if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                this.field_D.a((byte) -84, 1, 1);
              } else {
                this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
              }
            }
            return;
          }
          this.g((byte) 98);
        }
        if (this.field_D == null) {
          return;
        }
        if (this.field_A.field_x.field_m <= this.field_A.field_m) {
          this.field_D.a((byte) -84, 1, 1);
        } else {
          this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
        }
    }

    final void a(int param0, jo param1, boolean param2) {
        try {
          this.field_x = param1;
          this.field_w[param0] = (ae) ((Object) param1);
          this.field_B = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cca.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.c(-31791);
          this.g((byte) -125);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cca.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        cn var7;
        if (param5 < pka.field_b) {
          gt.a(param1, param5, param3, param2, 10, param0);
        } else {
          if (ss.field_c < param1) {
            gt.a(param1, param5, param3, param2, 10, param0);
          } else {
            if (param3 < gca.field_d) {
              gt.a(param1, param5, param3, param2, 10, param0);
            } else {
              if (hc.field_h < param0) {
                gt.a(param1, param5, param3, param2, 10, param0);
              } else {
                caa.a(param2, param1, param5, param3, param0, param4 ^ 936441872);
              }
            }
          }
        }
        if (param4 == 936441872) {
          return;
        }
        var7 = (cn) null;
        cca.a(-19, (cn) null, 56, -52);
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return true;
          }
          stackIn_8_0 = (this.b((byte) -34)) && (this.a(param0, ~param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("cca.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    cca(int param0, int param1, int param2, int param3, isa param4, ae param5, isa param6) {
        super(param0, param1, param2, param3, param4);
        vua dupTemp$0 = null;
        try {
          this.field_w = new ae[3];
          dupTemp$0 = new vua(param0, param1, param2, param3, param6, param5);
          this.field_A = dupTemp$0;
          this.field_w[2] = (ae) ((Object) dupTemp$0);
          this.a((byte) 88);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cca.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, int param1) {
        if (param1 != 0) {
          return false;
        }
        if (null == this.field_x) {
          return false;
        }
        this.field_x.c(16, this.field_x.field_M * param0 + this.field_x.field_O);
        return true;
    }

    static {
    }
}
