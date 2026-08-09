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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (jna.a(false, param0, param3, param1)) {
              L1: {
                if (param2 <= -7) {
                  break L1;
                } else {
                  field_z = 29L;
                  break L1;
                }
              }
              stackIn_6_0 = pn.i(94);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("cca.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (iu[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    private final void g(byte param0) {
        if (param0 > -122) {
            this.field_x = (jo) null;
            if (!(null == this.field_x)) {
                this.field_A.field_x.field_n = -(int)((long)this.field_x.field_O * (long)(this.field_A.field_x.field_p - this.field_A.field_p) >> 936441872);
            }
            if (null == this.field_D) {
                return;
            }
            this.field_A.field_x.field_i = -(int)((long)(-this.field_A.field_m + this.field_A.field_x.field_m) * (long)this.field_D.field_C >> 1846661328);
            return;
        }
        if (!(null == this.field_x)) {
            this.field_A.field_x.field_n = -(int)((long)this.field_x.field_O * (long)(this.field_A.field_x.field_p - this.field_A.field_p) >> 936441872);
        }
        if (null != this.field_D) {
            this.field_A.field_x.field_i = -(int)((long)(-this.field_A.field_m + this.field_A.field_x.field_m) * (long)this.field_D.field_C >> 1846661328);
            return;
        }
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        jo stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        jo stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        jo stackIn_20_0;
        int stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        jo stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        jo stackIn_35_0;
        int stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        jo stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        int stackIn_36_4;
        jo stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        int stackIn_41_4;
        jo stackIn_42_0;
        int stackIn_42_1;
        int stackIn_42_2;
        int stackIn_42_3;
        int stackIn_42_4;
        int stackIn_42_5;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        jo stackIn_54_0;
        int stackIn_54_1;
        int stackIn_54_2;
        int stackIn_54_3;
        jo stackIn_55_0;
        int stackIn_55_1;
        int stackIn_55_2;
        int stackIn_55_3;
        int stackIn_55_4;
        jo stackIn_60_0;
        int stackIn_60_1;
        int stackIn_60_2;
        int stackIn_60_3;
        int stackIn_60_4;
        jo stackIn_61_0;
        int stackIn_61_1;
        int stackIn_61_2;
        int stackIn_61_3;
        int stackIn_61_4;
        int stackIn_61_5;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        jo stackIn_72_0;
        int stackIn_72_1;
        int stackIn_72_2;
        int stackIn_72_3;
        jo stackIn_73_0;
        int stackIn_73_1;
        int stackIn_73_2;
        int stackIn_73_3;
        int stackIn_73_4;
        jo stackIn_78_0;
        int stackIn_78_1;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        jo stackIn_79_0;
        int stackIn_79_1;
        int stackIn_79_2;
        int stackIn_79_3;
        int stackIn_79_4;
        int stackIn_79_5;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_91_0 = 0;
        jo stackIn_94_0;
        int stackIn_94_1;
        int stackIn_94_2;
        int stackIn_94_3;
        jo stackIn_95_0;
        int stackIn_95_1;
        int stackIn_95_2;
        int stackIn_95_3;
        int stackIn_95_4;
        jo stackIn_100_0;
        int stackIn_100_1;
        int stackIn_100_2;
        int stackIn_100_3;
        int stackIn_100_4;
        jo stackIn_101_0;
        int stackIn_101_1;
        int stackIn_101_2;
        int stackIn_101_3;
        int stackIn_101_4;
        int stackIn_101_5;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        jo stackIn_112_0;
        int stackIn_112_1;
        int stackIn_112_2;
        int stackIn_112_3;
        jo stackIn_113_0;
        int stackIn_113_1;
        int stackIn_113_2;
        int stackIn_113_3;
        int stackIn_113_4;
        jo stackIn_118_0;
        int stackIn_118_1;
        int stackIn_118_2;
        int stackIn_118_3;
        int stackIn_118_4;
        jo stackIn_119_0;
        int stackIn_119_1;
        int stackIn_119_2;
        int stackIn_119_3;
        int stackIn_119_4;
        int stackIn_119_5;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        jo stackIn_132_0;
        int stackIn_132_1;
        int stackIn_132_2;
        int stackIn_132_3;
        jo stackIn_133_0;
        int stackIn_133_1;
        int stackIn_133_2;
        int stackIn_133_3;
        int stackIn_133_4;
        jo stackIn_138_0;
        int stackIn_138_1;
        int stackIn_138_2;
        int stackIn_138_3;
        int stackIn_138_4;
        jo stackIn_139_0;
        int stackIn_139_1;
        int stackIn_139_2;
        int stackIn_139_3;
        int stackIn_139_4;
        int stackIn_139_5;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        jo stackIn_150_0;
        int stackIn_150_1;
        int stackIn_150_2;
        int stackIn_150_3;
        jo stackIn_151_0;
        int stackIn_151_1;
        int stackIn_151_2;
        int stackIn_151_3;
        int stackIn_151_4;
        jo stackIn_156_0;
        int stackIn_156_1;
        int stackIn_156_2;
        int stackIn_156_3;
        int stackIn_156_4;
        jo stackIn_157_0;
        int stackIn_157_1;
        int stackIn_157_2;
        int stackIn_157_3;
        int stackIn_157_4;
        int stackIn_157_5;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        jo stackIn_169_0;
        int stackIn_169_1;
        int stackIn_169_2;
        int stackIn_169_3;
        jo stackIn_170_0;
        int stackIn_170_1;
        int stackIn_170_2;
        int stackIn_170_3;
        int stackIn_170_4;
        jo stackIn_175_0;
        int stackIn_175_1;
        int stackIn_175_2;
        int stackIn_175_3;
        int stackIn_175_4;
        jo stackIn_176_0;
        int stackIn_176_1;
        int stackIn_176_2;
        int stackIn_176_3;
        int stackIn_176_4;
        int stackIn_176_5;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        jo stackIn_187_0;
        int stackIn_187_1;
        int stackIn_187_2;
        int stackIn_187_3;
        jo stackIn_188_0;
        int stackIn_188_1;
        int stackIn_188_2;
        int stackIn_188_3;
        int stackIn_188_4;
        jo stackIn_193_0;
        int stackIn_193_1;
        int stackIn_193_2;
        int stackIn_193_3;
        int stackIn_193_4;
        jo stackIn_194_0;
        int stackIn_194_1;
        int stackIn_194_2;
        int stackIn_194_3;
        int stackIn_194_4;
        int stackIn_194_5;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          if (this.field_B) {
            stackIn_83_0 = 0;
            break L0;
          } else {
            if (null != this.field_x) {
              stackIn_83_0 = this.field_x.field_m;
              break L0;
            } else {
              var2 = 0;
              if (!this.field_y) {
                if (null != this.field_D) {
                  var3 = this.field_D.field_p;
                  if (param0 == 88) {
                    L1: {
                      if (this.field_x == null) {
                        stackIn_66_0 = this.field_m;
                        break L1;
                      } else {
                        stackIn_66_0 = this.field_m + -this.field_x.field_m;
                        break L1;
                      }
                    }
                    L2: {
                      var4 = stackIn_66_0;
                      if (null != this.field_D) {
                        stackIn_69_0 = -this.field_D.field_p + this.field_p;
                        break L2;
                      } else {
                        stackIn_69_0 = this.field_p;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_69_0;
                      this.field_A.a((byte) -31, var4, var5, var2, var3);
                      if (null == this.field_x) {
                        break L3;
                      } else {
                        L4: {
                          stackIn_72_0 = this.field_x;

                          stackIn_72_1 = -31;

                          stackIn_72_2 = this.field_x.field_m;

                          stackIn_72_3 = this.field_A.field_p;

                          if (this.field_B) {
                            stackIn_73_0 = (jo) ((Object) stackIn_72_0);
                            stackIn_73_1 = stackIn_72_1;
                            stackIn_73_2 = stackIn_72_2;
                            stackIn_73_3 = stackIn_72_3;
                            stackIn_73_4 = -this.field_x.field_m + this.field_m;
                            break L4;
                          } else {
                            stackIn_73_0 = (jo) ((Object) stackIn_72_0);
                            stackIn_73_1 = stackIn_72_1;
                            stackIn_73_2 = stackIn_72_2;
                            stackIn_73_3 = stackIn_72_3;
                            stackIn_73_4 = 0;
                            break L4;
                          }
                        }
                        ((jo) (Object) stackIn_73_0).a((byte) stackIn_73_1, stackIn_73_2, stackIn_73_3, stackIn_73_4, this.field_A.field_n);
                        break L3;
                      }
                    }
                    L5: {
                      if (null != this.field_D) {
                        L6: {
                          stackIn_78_0 = this.field_D;

                          stackIn_78_1 = -31;

                          stackIn_78_2 = this.field_A.field_m;

                          stackIn_78_3 = this.field_D.field_p;

                          stackIn_78_4 = this.field_A.field_i;

                          if (!this.field_y) {
                            stackIn_79_0 = (jo) ((Object) stackIn_78_0);
                            stackIn_79_1 = stackIn_78_1;
                            stackIn_79_2 = stackIn_78_2;
                            stackIn_79_3 = stackIn_78_3;
                            stackIn_79_4 = stackIn_78_4;
                            stackIn_79_5 = 0;
                            break L6;
                          } else {
                            stackIn_79_0 = (jo) ((Object) stackIn_78_0);
                            stackIn_79_1 = stackIn_78_1;
                            stackIn_79_2 = stackIn_78_2;
                            stackIn_79_3 = stackIn_78_3;
                            stackIn_79_4 = stackIn_78_4;
                            stackIn_79_5 = -this.field_D.field_p + this.field_p;
                            break L6;
                          }
                        }
                        ((jo) (Object) stackIn_79_0).a((byte) stackIn_79_1, stackIn_79_2, stackIn_79_3, stackIn_79_4, stackIn_79_5);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.c(-31791);
                    return;
                  } else {
                    L7: {
                      discarded$0 = this.a(-26, -25);
                      if (this.field_x == null) {
                        stackIn_48_0 = this.field_m;
                        break L7;
                      } else {
                        stackIn_48_0 = this.field_m + -this.field_x.field_m;
                        break L7;
                      }
                    }
                    L8: {
                      var4 = stackIn_48_0;
                      if (null != this.field_D) {
                        stackIn_51_0 = -this.field_D.field_p + this.field_p;
                        break L8;
                      } else {
                        stackIn_51_0 = this.field_p;
                        break L8;
                      }
                    }
                    L9: {
                      var5 = stackIn_51_0;
                      this.field_A.a((byte) -31, var4, var5, var2, var3);
                      if (null == this.field_x) {
                        break L9;
                      } else {
                        L10: {
                          stackIn_54_0 = this.field_x;

                          stackIn_54_1 = -31;

                          stackIn_54_2 = this.field_x.field_m;

                          stackIn_54_3 = this.field_A.field_p;

                          if (this.field_B) {
                            stackIn_55_0 = (jo) ((Object) stackIn_54_0);
                            stackIn_55_1 = stackIn_54_1;
                            stackIn_55_2 = stackIn_54_2;
                            stackIn_55_3 = stackIn_54_3;
                            stackIn_55_4 = -this.field_x.field_m + this.field_m;
                            break L10;
                          } else {
                            stackIn_55_0 = (jo) ((Object) stackIn_54_0);
                            stackIn_55_1 = stackIn_54_1;
                            stackIn_55_2 = stackIn_54_2;
                            stackIn_55_3 = stackIn_54_3;
                            stackIn_55_4 = 0;
                            break L10;
                          }
                        }
                        ((jo) (Object) stackIn_55_0).a((byte) stackIn_55_1, stackIn_55_2, stackIn_55_3, stackIn_55_4, this.field_A.field_n);
                        break L9;
                      }
                    }
                    L11: {
                      if (null != this.field_D) {
                        L12: {
                          stackIn_60_0 = this.field_D;

                          stackIn_60_1 = -31;

                          stackIn_60_2 = this.field_A.field_m;

                          stackIn_60_3 = this.field_D.field_p;

                          stackIn_60_4 = this.field_A.field_i;

                          if (!this.field_y) {
                            stackIn_61_0 = (jo) ((Object) stackIn_60_0);
                            stackIn_61_1 = stackIn_60_1;
                            stackIn_61_2 = stackIn_60_2;
                            stackIn_61_3 = stackIn_60_3;
                            stackIn_61_4 = stackIn_60_4;
                            stackIn_61_5 = 0;
                            break L12;
                          } else {
                            stackIn_61_0 = (jo) ((Object) stackIn_60_0);
                            stackIn_61_1 = stackIn_60_1;
                            stackIn_61_2 = stackIn_60_2;
                            stackIn_61_3 = stackIn_60_3;
                            stackIn_61_4 = stackIn_60_4;
                            stackIn_61_5 = -this.field_D.field_p + this.field_p;
                            break L12;
                          }
                        }
                        ((jo) (Object) stackIn_61_0).a((byte) stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_61_4, stackIn_61_5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.c(-31791);
                    return;
                  }
                } else {
                  L13: {
                    var3 = 0;
                    if (param0 == 88) {
                      break L13;
                    } else {
                      discarded$1 = this.a(-26, -25);
                      break L13;
                    }
                  }
                  L14: {
                    if (this.field_x == null) {
                      stackIn_29_0 = this.field_m;
                      break L14;
                    } else {
                      stackIn_29_0 = this.field_m + -this.field_x.field_m;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = stackIn_29_0;
                    if (null != this.field_D) {
                      stackIn_32_0 = -this.field_D.field_p + this.field_p;
                      break L15;
                    } else {
                      stackIn_32_0 = this.field_p;
                      break L15;
                    }
                  }
                  L16: {
                    var5 = stackIn_32_0;
                    this.field_A.a((byte) -31, var4, var5, var2, var3);
                    if (null == this.field_x) {
                      break L16;
                    } else {
                      L17: {
                        stackIn_35_0 = this.field_x;

                        stackIn_35_1 = -31;

                        stackIn_35_2 = this.field_x.field_m;

                        stackIn_35_3 = this.field_A.field_p;

                        if (this.field_B) {
                          stackIn_36_0 = (jo) ((Object) stackIn_35_0);
                          stackIn_36_1 = stackIn_35_1;
                          stackIn_36_2 = stackIn_35_2;
                          stackIn_36_3 = stackIn_35_3;
                          stackIn_36_4 = -this.field_x.field_m + this.field_m;
                          break L17;
                        } else {
                          stackIn_36_0 = (jo) ((Object) stackIn_35_0);
                          stackIn_36_1 = stackIn_35_1;
                          stackIn_36_2 = stackIn_35_2;
                          stackIn_36_3 = stackIn_35_3;
                          stackIn_36_4 = 0;
                          break L17;
                        }
                      }
                      ((jo) (Object) stackIn_36_0).a((byte) stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4, this.field_A.field_n);
                      break L16;
                    }
                  }
                  L18: {
                    if (null != this.field_D) {
                      L19: {
                        stackIn_41_0 = this.field_D;

                        stackIn_41_1 = -31;

                        stackIn_41_2 = this.field_A.field_m;

                        stackIn_41_3 = this.field_D.field_p;

                        stackIn_41_4 = this.field_A.field_i;

                        if (!this.field_y) {
                          stackIn_42_0 = (jo) ((Object) stackIn_41_0);
                          stackIn_42_1 = stackIn_41_1;
                          stackIn_42_2 = stackIn_41_2;
                          stackIn_42_3 = stackIn_41_3;
                          stackIn_42_4 = stackIn_41_4;
                          stackIn_42_5 = 0;
                          break L19;
                        } else {
                          stackIn_42_0 = (jo) ((Object) stackIn_41_0);
                          stackIn_42_1 = stackIn_41_1;
                          stackIn_42_2 = stackIn_41_2;
                          stackIn_42_3 = stackIn_41_3;
                          stackIn_42_4 = stackIn_41_4;
                          stackIn_42_5 = -this.field_D.field_p + this.field_p;
                          break L19;
                        }
                      }
                      ((jo) (Object) stackIn_42_0).a((byte) stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  this.c(-31791);
                  return;
                }
              } else {
                L20: {
                  var3 = 0;
                  if (param0 == 88) {
                    break L20;
                  } else {
                    discarded$2 = this.a(-26, -25);
                    break L20;
                  }
                }
                L21: {
                  if (this.field_x == null) {
                    stackIn_8_0 = this.field_m;
                    break L21;
                  } else {
                    stackIn_8_0 = this.field_m + -this.field_x.field_m;
                    break L21;
                  }
                }
                L22: {
                  var4 = stackIn_8_0;
                  if (null != this.field_D) {
                    stackIn_11_0 = -this.field_D.field_p + this.field_p;
                    break L22;
                  } else {
                    stackIn_11_0 = this.field_p;
                    break L22;
                  }
                }
                L23: {
                  var5 = stackIn_11_0;
                  this.field_A.a((byte) -31, var4, var5, var2, var3);
                  if (null == this.field_x) {
                    break L23;
                  } else {
                    L24: {
                      stackIn_14_0 = this.field_x;

                      stackIn_14_1 = -31;

                      stackIn_14_2 = this.field_x.field_m;

                      stackIn_14_3 = this.field_A.field_p;

                      if (this.field_B) {
                        stackIn_15_0 = (jo) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = stackIn_14_3;
                        stackIn_15_4 = -this.field_x.field_m + this.field_m;
                        break L24;
                      } else {
                        stackIn_15_0 = (jo) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = stackIn_14_3;
                        stackIn_15_4 = 0;
                        break L24;
                      }
                    }
                    ((jo) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, this.field_A.field_n);
                    break L23;
                  }
                }
                L25: {
                  if (null != this.field_D) {
                    L26: {
                      stackIn_20_0 = this.field_D;

                      stackIn_20_1 = -31;

                      stackIn_20_2 = this.field_A.field_m;

                      stackIn_20_3 = this.field_D.field_p;

                      stackIn_20_4 = this.field_A.field_i;

                      if (!this.field_y) {
                        stackIn_21_0 = (jo) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = stackIn_20_3;
                        stackIn_21_4 = stackIn_20_4;
                        stackIn_21_5 = 0;
                        break L26;
                      } else {
                        stackIn_21_0 = (jo) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = stackIn_20_2;
                        stackIn_21_3 = stackIn_20_3;
                        stackIn_21_4 = stackIn_20_4;
                        stackIn_21_5 = -this.field_D.field_p + this.field_p;
                        break L26;
                      }
                    }
                    ((jo) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                this.c(-31791);
                return;
              }
            }
          }
        }
        var2 = stackIn_83_0;
        if (!this.field_y) {
          if (null != this.field_D) {
            var3 = this.field_D.field_p;
            if (param0 == 88) {
              L27: {
                if (this.field_x == null) {
                  stackIn_181_0 = this.field_m;
                  break L27;
                } else {
                  stackIn_181_0 = this.field_m + -this.field_x.field_m;
                  break L27;
                }
              }
              L28: {
                var4 = stackIn_181_0;
                if (null != this.field_D) {
                  stackIn_184_0 = -this.field_D.field_p + this.field_p;
                  break L28;
                } else {
                  stackIn_184_0 = this.field_p;
                  break L28;
                }
              }
              L29: {
                var5 = stackIn_184_0;
                this.field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == this.field_x) {
                  break L29;
                } else {
                  L30: {
                    stackIn_187_0 = this.field_x;

                    stackIn_187_1 = -31;

                    stackIn_187_2 = this.field_x.field_m;

                    stackIn_187_3 = this.field_A.field_p;

                    if (this.field_B) {
                      stackIn_188_0 = (jo) ((Object) stackIn_187_0);
                      stackIn_188_1 = stackIn_187_1;
                      stackIn_188_2 = stackIn_187_2;
                      stackIn_188_3 = stackIn_187_3;
                      stackIn_188_4 = -this.field_x.field_m + this.field_m;
                      break L30;
                    } else {
                      stackIn_188_0 = (jo) ((Object) stackIn_187_0);
                      stackIn_188_1 = stackIn_187_1;
                      stackIn_188_2 = stackIn_187_2;
                      stackIn_188_3 = stackIn_187_3;
                      stackIn_188_4 = 0;
                      break L30;
                    }
                  }
                  ((jo) (Object) stackIn_188_0).a((byte) stackIn_188_1, stackIn_188_2, stackIn_188_3, stackIn_188_4, this.field_A.field_n);
                  break L29;
                }
              }
              L31: {
                if (null != this.field_D) {
                  L32: {
                    stackIn_193_0 = this.field_D;

                    stackIn_193_1 = -31;

                    stackIn_193_2 = this.field_A.field_m;

                    stackIn_193_3 = this.field_D.field_p;

                    stackIn_193_4 = this.field_A.field_i;

                    if (!this.field_y) {
                      stackIn_194_0 = (jo) ((Object) stackIn_193_0);
                      stackIn_194_1 = stackIn_193_1;
                      stackIn_194_2 = stackIn_193_2;
                      stackIn_194_3 = stackIn_193_3;
                      stackIn_194_4 = stackIn_193_4;
                      stackIn_194_5 = 0;
                      break L32;
                    } else {
                      stackIn_194_0 = (jo) ((Object) stackIn_193_0);
                      stackIn_194_1 = stackIn_193_1;
                      stackIn_194_2 = stackIn_193_2;
                      stackIn_194_3 = stackIn_193_3;
                      stackIn_194_4 = stackIn_193_4;
                      stackIn_194_5 = -this.field_D.field_p + this.field_p;
                      break L32;
                    }
                  }
                  ((jo) (Object) stackIn_194_0).a((byte) stackIn_194_1, stackIn_194_2, stackIn_194_3, stackIn_194_4, stackIn_194_5);
                  break L31;
                } else {
                  break L31;
                }
              }
              this.c(-31791);
              return;
            } else {
              L33: {
                discarded$3 = this.a(-26, -25);
                if (this.field_x == null) {
                  stackIn_163_0 = this.field_m;
                  break L33;
                } else {
                  stackIn_163_0 = this.field_m + -this.field_x.field_m;
                  break L33;
                }
              }
              L34: {
                var4 = stackIn_163_0;
                if (null != this.field_D) {
                  stackIn_166_0 = -this.field_D.field_p + this.field_p;
                  break L34;
                } else {
                  stackIn_166_0 = this.field_p;
                  break L34;
                }
              }
              L35: {
                var5 = stackIn_166_0;
                this.field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == this.field_x) {
                  break L35;
                } else {
                  L36: {
                    stackIn_169_0 = this.field_x;

                    stackIn_169_1 = -31;

                    stackIn_169_2 = this.field_x.field_m;

                    stackIn_169_3 = this.field_A.field_p;

                    if (this.field_B) {
                      stackIn_170_0 = (jo) ((Object) stackIn_169_0);
                      stackIn_170_1 = stackIn_169_1;
                      stackIn_170_2 = stackIn_169_2;
                      stackIn_170_3 = stackIn_169_3;
                      stackIn_170_4 = -this.field_x.field_m + this.field_m;
                      break L36;
                    } else {
                      stackIn_170_0 = (jo) ((Object) stackIn_169_0);
                      stackIn_170_1 = stackIn_169_1;
                      stackIn_170_2 = stackIn_169_2;
                      stackIn_170_3 = stackIn_169_3;
                      stackIn_170_4 = 0;
                      break L36;
                    }
                  }
                  ((jo) (Object) stackIn_170_0).a((byte) stackIn_170_1, stackIn_170_2, stackIn_170_3, stackIn_170_4, this.field_A.field_n);
                  break L35;
                }
              }
              L37: {
                if (null != this.field_D) {
                  L38: {
                    stackIn_175_0 = this.field_D;

                    stackIn_175_1 = -31;

                    stackIn_175_2 = this.field_A.field_m;

                    stackIn_175_3 = this.field_D.field_p;

                    stackIn_175_4 = this.field_A.field_i;

                    if (!this.field_y) {
                      stackIn_176_0 = (jo) ((Object) stackIn_175_0);
                      stackIn_176_1 = stackIn_175_1;
                      stackIn_176_2 = stackIn_175_2;
                      stackIn_176_3 = stackIn_175_3;
                      stackIn_176_4 = stackIn_175_4;
                      stackIn_176_5 = 0;
                      break L38;
                    } else {
                      stackIn_176_0 = (jo) ((Object) stackIn_175_0);
                      stackIn_176_1 = stackIn_175_1;
                      stackIn_176_2 = stackIn_175_2;
                      stackIn_176_3 = stackIn_175_3;
                      stackIn_176_4 = stackIn_175_4;
                      stackIn_176_5 = -this.field_D.field_p + this.field_p;
                      break L38;
                    }
                  }
                  ((jo) (Object) stackIn_176_0).a((byte) stackIn_176_1, stackIn_176_2, stackIn_176_3, stackIn_176_4, stackIn_176_5);
                  break L37;
                } else {
                  break L37;
                }
              }
              this.c(-31791);
              return;
            }
          } else {
            var3 = 0;
            if (param0 == 88) {
              L39: {
                if (this.field_x == null) {
                  stackIn_144_0 = this.field_m;
                  break L39;
                } else {
                  stackIn_144_0 = this.field_m + -this.field_x.field_m;
                  break L39;
                }
              }
              L40: {
                var4 = stackIn_144_0;
                if (null != this.field_D) {
                  stackIn_147_0 = -this.field_D.field_p + this.field_p;
                  break L40;
                } else {
                  stackIn_147_0 = this.field_p;
                  break L40;
                }
              }
              L41: {
                var5 = stackIn_147_0;
                this.field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == this.field_x) {
                  break L41;
                } else {
                  L42: {
                    stackIn_150_0 = this.field_x;

                    stackIn_150_1 = -31;

                    stackIn_150_2 = this.field_x.field_m;

                    stackIn_150_3 = this.field_A.field_p;

                    if (this.field_B) {
                      stackIn_151_0 = (jo) ((Object) stackIn_150_0);
                      stackIn_151_1 = stackIn_150_1;
                      stackIn_151_2 = stackIn_150_2;
                      stackIn_151_3 = stackIn_150_3;
                      stackIn_151_4 = -this.field_x.field_m + this.field_m;
                      break L42;
                    } else {
                      stackIn_151_0 = (jo) ((Object) stackIn_150_0);
                      stackIn_151_1 = stackIn_150_1;
                      stackIn_151_2 = stackIn_150_2;
                      stackIn_151_3 = stackIn_150_3;
                      stackIn_151_4 = 0;
                      break L42;
                    }
                  }
                  ((jo) (Object) stackIn_151_0).a((byte) stackIn_151_1, stackIn_151_2, stackIn_151_3, stackIn_151_4, this.field_A.field_n);
                  break L41;
                }
              }
              L43: {
                if (null != this.field_D) {
                  L44: {
                    stackIn_156_0 = this.field_D;

                    stackIn_156_1 = -31;

                    stackIn_156_2 = this.field_A.field_m;

                    stackIn_156_3 = this.field_D.field_p;

                    stackIn_156_4 = this.field_A.field_i;

                    if (!this.field_y) {
                      stackIn_157_0 = (jo) ((Object) stackIn_156_0);
                      stackIn_157_1 = stackIn_156_1;
                      stackIn_157_2 = stackIn_156_2;
                      stackIn_157_3 = stackIn_156_3;
                      stackIn_157_4 = stackIn_156_4;
                      stackIn_157_5 = 0;
                      break L44;
                    } else {
                      stackIn_157_0 = (jo) ((Object) stackIn_156_0);
                      stackIn_157_1 = stackIn_156_1;
                      stackIn_157_2 = stackIn_156_2;
                      stackIn_157_3 = stackIn_156_3;
                      stackIn_157_4 = stackIn_156_4;
                      stackIn_157_5 = -this.field_D.field_p + this.field_p;
                      break L44;
                    }
                  }
                  ((jo) (Object) stackIn_157_0).a((byte) stackIn_157_1, stackIn_157_2, stackIn_157_3, stackIn_157_4, stackIn_157_5);
                  break L43;
                } else {
                  break L43;
                }
              }
              this.c(-31791);
              return;
            } else {
              L45: {
                discarded$4 = this.a(-26, -25);
                if (this.field_x == null) {
                  stackIn_126_0 = this.field_m;
                  break L45;
                } else {
                  stackIn_126_0 = this.field_m + -this.field_x.field_m;
                  break L45;
                }
              }
              L46: {
                var4 = stackIn_126_0;
                if (null != this.field_D) {
                  stackIn_129_0 = -this.field_D.field_p + this.field_p;
                  break L46;
                } else {
                  stackIn_129_0 = this.field_p;
                  break L46;
                }
              }
              L47: {
                var5 = stackIn_129_0;
                this.field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == this.field_x) {
                  break L47;
                } else {
                  L48: {
                    stackIn_132_0 = this.field_x;

                    stackIn_132_1 = -31;

                    stackIn_132_2 = this.field_x.field_m;

                    stackIn_132_3 = this.field_A.field_p;

                    if (this.field_B) {
                      stackIn_133_0 = (jo) ((Object) stackIn_132_0);
                      stackIn_133_1 = stackIn_132_1;
                      stackIn_133_2 = stackIn_132_2;
                      stackIn_133_3 = stackIn_132_3;
                      stackIn_133_4 = -this.field_x.field_m + this.field_m;
                      break L48;
                    } else {
                      stackIn_133_0 = (jo) ((Object) stackIn_132_0);
                      stackIn_133_1 = stackIn_132_1;
                      stackIn_133_2 = stackIn_132_2;
                      stackIn_133_3 = stackIn_132_3;
                      stackIn_133_4 = 0;
                      break L48;
                    }
                  }
                  ((jo) (Object) stackIn_133_0).a((byte) stackIn_133_1, stackIn_133_2, stackIn_133_3, stackIn_133_4, this.field_A.field_n);
                  break L47;
                }
              }
              L49: {
                if (null != this.field_D) {
                  L50: {
                    stackIn_138_0 = this.field_D;

                    stackIn_138_1 = -31;

                    stackIn_138_2 = this.field_A.field_m;

                    stackIn_138_3 = this.field_D.field_p;

                    stackIn_138_4 = this.field_A.field_i;

                    if (!this.field_y) {
                      stackIn_139_0 = (jo) ((Object) stackIn_138_0);
                      stackIn_139_1 = stackIn_138_1;
                      stackIn_139_2 = stackIn_138_2;
                      stackIn_139_3 = stackIn_138_3;
                      stackIn_139_4 = stackIn_138_4;
                      stackIn_139_5 = 0;
                      break L50;
                    } else {
                      stackIn_139_0 = (jo) ((Object) stackIn_138_0);
                      stackIn_139_1 = stackIn_138_1;
                      stackIn_139_2 = stackIn_138_2;
                      stackIn_139_3 = stackIn_138_3;
                      stackIn_139_4 = stackIn_138_4;
                      stackIn_139_5 = -this.field_D.field_p + this.field_p;
                      break L50;
                    }
                  }
                  ((jo) (Object) stackIn_139_0).a((byte) stackIn_139_1, stackIn_139_2, stackIn_139_3, stackIn_139_4, stackIn_139_5);
                  break L49;
                } else {
                  break L49;
                }
              }
              this.c(-31791);
              return;
            }
          }
        } else {
          var3 = 0;
          if (param0 == 88) {
            L51: {
              if (this.field_x == null) {
                stackIn_106_0 = this.field_m;
                break L51;
              } else {
                stackIn_106_0 = this.field_m + -this.field_x.field_m;
                break L51;
              }
            }
            L52: {
              var4 = stackIn_106_0;
              if (null != this.field_D) {
                stackIn_109_0 = -this.field_D.field_p + this.field_p;
                break L52;
              } else {
                stackIn_109_0 = this.field_p;
                break L52;
              }
            }
            L53: {
              var5 = stackIn_109_0;
              this.field_A.a((byte) -31, var4, var5, var2, var3);
              if (null == this.field_x) {
                break L53;
              } else {
                L54: {
                  stackIn_112_0 = this.field_x;

                  stackIn_112_1 = -31;

                  stackIn_112_2 = this.field_x.field_m;

                  stackIn_112_3 = this.field_A.field_p;

                  if (this.field_B) {
                    stackIn_113_0 = (jo) ((Object) stackIn_112_0);
                    stackIn_113_1 = stackIn_112_1;
                    stackIn_113_2 = stackIn_112_2;
                    stackIn_113_3 = stackIn_112_3;
                    stackIn_113_4 = -this.field_x.field_m + this.field_m;
                    break L54;
                  } else {
                    stackIn_113_0 = (jo) ((Object) stackIn_112_0);
                    stackIn_113_1 = stackIn_112_1;
                    stackIn_113_2 = stackIn_112_2;
                    stackIn_113_3 = stackIn_112_3;
                    stackIn_113_4 = 0;
                    break L54;
                  }
                }
                ((jo) (Object) stackIn_113_0).a((byte) stackIn_113_1, stackIn_113_2, stackIn_113_3, stackIn_113_4, this.field_A.field_n);
                break L53;
              }
            }
            L55: {
              if (null != this.field_D) {
                L56: {
                  stackIn_118_0 = this.field_D;

                  stackIn_118_1 = -31;

                  stackIn_118_2 = this.field_A.field_m;

                  stackIn_118_3 = this.field_D.field_p;

                  stackIn_118_4 = this.field_A.field_i;

                  if (!this.field_y) {
                    stackIn_119_0 = (jo) ((Object) stackIn_118_0);
                    stackIn_119_1 = stackIn_118_1;
                    stackIn_119_2 = stackIn_118_2;
                    stackIn_119_3 = stackIn_118_3;
                    stackIn_119_4 = stackIn_118_4;
                    stackIn_119_5 = 0;
                    break L56;
                  } else {
                    stackIn_119_0 = (jo) ((Object) stackIn_118_0);
                    stackIn_119_1 = stackIn_118_1;
                    stackIn_119_2 = stackIn_118_2;
                    stackIn_119_3 = stackIn_118_3;
                    stackIn_119_4 = stackIn_118_4;
                    stackIn_119_5 = -this.field_D.field_p + this.field_p;
                    break L56;
                  }
                }
                ((jo) (Object) stackIn_119_0).a((byte) stackIn_119_1, stackIn_119_2, stackIn_119_3, stackIn_119_4, stackIn_119_5);
                break L55;
              } else {
                break L55;
              }
            }
            this.c(-31791);
            return;
          } else {
            L57: {
              discarded$5 = this.a(-26, -25);
              if (this.field_x == null) {
                stackIn_88_0 = this.field_m;
                break L57;
              } else {
                stackIn_88_0 = this.field_m + -this.field_x.field_m;
                break L57;
              }
            }
            L58: {
              var4 = stackIn_88_0;
              if (null != this.field_D) {
                stackIn_91_0 = -this.field_D.field_p + this.field_p;
                break L58;
              } else {
                stackIn_91_0 = this.field_p;
                break L58;
              }
            }
            L59: {
              var5 = stackIn_91_0;
              this.field_A.a((byte) -31, var4, var5, var2, var3);
              if (null == this.field_x) {
                break L59;
              } else {
                L60: {
                  stackIn_94_0 = this.field_x;

                  stackIn_94_1 = -31;

                  stackIn_94_2 = this.field_x.field_m;

                  stackIn_94_3 = this.field_A.field_p;

                  if (this.field_B) {
                    stackIn_95_0 = (jo) ((Object) stackIn_94_0);
                    stackIn_95_1 = stackIn_94_1;
                    stackIn_95_2 = stackIn_94_2;
                    stackIn_95_3 = stackIn_94_3;
                    stackIn_95_4 = -this.field_x.field_m + this.field_m;
                    break L60;
                  } else {
                    stackIn_95_0 = (jo) ((Object) stackIn_94_0);
                    stackIn_95_1 = stackIn_94_1;
                    stackIn_95_2 = stackIn_94_2;
                    stackIn_95_3 = stackIn_94_3;
                    stackIn_95_4 = 0;
                    break L60;
                  }
                }
                ((jo) (Object) stackIn_95_0).a((byte) stackIn_95_1, stackIn_95_2, stackIn_95_3, stackIn_95_4, this.field_A.field_n);
                break L59;
              }
            }
            L61: {
              if (null != this.field_D) {
                L62: {
                  stackIn_100_0 = this.field_D;

                  stackIn_100_1 = -31;

                  stackIn_100_2 = this.field_A.field_m;

                  stackIn_100_3 = this.field_D.field_p;

                  stackIn_100_4 = this.field_A.field_i;

                  if (!this.field_y) {
                    stackIn_101_0 = (jo) ((Object) stackIn_100_0);
                    stackIn_101_1 = stackIn_100_1;
                    stackIn_101_2 = stackIn_100_2;
                    stackIn_101_3 = stackIn_100_3;
                    stackIn_101_4 = stackIn_100_4;
                    stackIn_101_5 = 0;
                    break L62;
                  } else {
                    stackIn_101_0 = (jo) ((Object) stackIn_100_0);
                    stackIn_101_1 = stackIn_100_1;
                    stackIn_101_2 = stackIn_100_2;
                    stackIn_101_3 = stackIn_100_3;
                    stackIn_101_4 = stackIn_100_4;
                    stackIn_101_5 = -this.field_D.field_p + this.field_p;
                    break L62;
                  }
                }
                ((jo) (Object) stackIn_101_0).a((byte) stackIn_101_1, stackIn_101_2, stackIn_101_3, stackIn_101_4, stackIn_101_5);
                break L61;
              } else {
                break L61;
              }
            }
            this.c(-31791);
            return;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.g((byte) -123);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("cca.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    private final void c(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_x != null) {
          if (this.field_A.field_p >= this.field_A.field_x.field_p) {
            this.field_x.c(1, 1, param0 ^ 1789701680);
            if (param0 != -31791) {
              this.g((byte) 98);
              if (this.field_D != null) {
                if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                  this.field_D.a((byte) -84, 1, 1);
                  return;
                } else {
                  this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
                  return;
                }
              } else {
                return;
              }
            } else {
              L0: {
                if (this.field_D != null) {
                  if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                    this.field_D.a((byte) -84, 1, 1);
                    break L0;
                  } else {
                    this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            this.field_x.c(this.field_A.field_x.field_p, this.field_A.field_p, -1789710879);
            if (param0 != -31791) {
              L1: {
                this.g((byte) 98);
                if (this.field_D != null) {
                  if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                    this.field_D.a((byte) -84, 1, 1);
                    break L1;
                  } else {
                    this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (this.field_D != null) {
                  if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                    this.field_D.a((byte) -84, 1, 1);
                    break L2;
                  } else {
                    this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          if (param0 == -31791) {
            if (this.field_D != null) {
              if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                this.field_D.a((byte) -84, 1, 1);
                return;
              } else {
                this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
                return;
              }
            } else {
              return;
            }
          } else {
            this.g((byte) 98);
            if (this.field_D != null) {
              if (this.field_A.field_x.field_m <= this.field_A.field_m) {
                this.field_D.a((byte) -84, 1, 1);
                return;
              } else {
                this.field_D.a((byte) -101, this.field_A.field_m, this.field_A.field_x.field_m);
                return;
              }
            } else {
              return;
            }
          }
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
          if (param4 != 936441872) {
            var7 = (cn) null;
            cca.a(-19, (cn) null, 56, -52);
            return;
          } else {
            return;
          }
        } else {
          if (ss.field_c < param1) {
            gt.a(param1, param5, param3, param2, 10, param0);
            if (param4 == 936441872) {
              return;
            } else {
              var7 = (cn) null;
              cca.a(-19, (cn) null, 56, -52);
              return;
            }
          } else {
            if (param3 < gca.field_d) {
              gt.a(param1, param5, param3, param2, 10, param0);
              if (param4 == 936441872) {
                return;
              } else {
                var7 = (cn) null;
                cca.a(-19, (cn) null, 56, -52);
                return;
              }
            } else {
              if (hc.field_h < param0) {
                gt.a(param1, param5, param3, param2, 10, param0);
                if (param4 == 936441872) {
                  return;
                } else {
                  var7 = (cn) null;
                  cca.a(-19, (cn) null, 56, -52);
                  return;
                }
              } else {
                caa.a(param2, param1, param5, param3, param0, param4 ^ 936441872);
                if (param4 != 936441872) {
                  var7 = (cn) null;
                  cca.a(-19, (cn) null, 56, -52);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (!this.b((byte) -34)) {
                    break L2;
                  } else {
                    if (!this.a(param0, param6 ^ -1)) {
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("cca.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_8_0 != 0;
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
