/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npb {
    private boolean field_b;
    private int field_f;
    private int field_d;
    private int field_e;
    private int field_a;
    private boolean field_g;
    private boolean field_c;

    final void a(int param0, int param1, rsb param2, sg param3) {
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sg[] var9 = null;
        sg[] var10_ref_sg__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sg var12_ref_sg = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sg var16 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 84) {
                break L1;
              } else {
                var16 = (sg) null;
                this.a(-99, (rsb) null, (byte) -13, (sg) null);
                break L1;
              }
            }
            if (param3 != null) {
              L2: {
                L3: {
                  var5_int = param3.s((byte) -90) ? 1 : 0;
                  if (!this.field_g) {
                    break L3;
                  } else {
                    if (var5_int != 0) {
                      break L3;
                    } else {
                      lha.a(-112, fa.field_d[18]);
                      break L2;
                    }
                  }
                }
                if (var5_int == 0) {
                  break L2;
                } else {
                  if (!this.field_g) {
                    lha.a(-86, fa.field_d[10]);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                stackIn_14_0 = this;

                if (var5_int == 0) {
                  stackIn_15_0 = this;
                  stackIn_15_1 = 0;
                  break L4;
                } else {
                  stackIn_15_0 = this;
                  stackIn_15_1 = 1;
                  break L4;
                }
              }
              L5: {
                ((npb) (this)).field_g = stackIn_15_1 != 0;
                var6 = param3.o(-55);
                var7 = 64;
                if (var6 >= var7) {
                  break L5;
                } else {
                  if (var7 >= this.field_d) {
                    break L5;
                  } else {
                    if ((this.field_f ^ -1) < -1) {
                      break L5;
                    } else {
                      lha.a(-87, fa.field_d[16]);
                      this.field_f = oq.field_l;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (this.field_f > 0) {
                  this.field_f = this.field_f - 1;
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_d = var6;
              var8 = 0;
              var9 = param2.field_g.d(1000);
              var10_ref_sg__ = var9;
              var11 = 0;
              L7: while (true) {
                if (var10_ref_sg__.length <= var11) {
                  L8: {
                    if (this.field_e >= var8) {
                      break L8;
                    } else {
                      lha.a(param1 + -186, fa.field_d[9]);
                      break L8;
                    }
                  }
                  L9: {
                    this.field_e = var8;
                    var10 = param3.r((byte) -86) ? 1 : 0;
                    if (var10 == 0) {
                      break L9;
                    } else {
                      if (!this.field_b) {
                        lha.a(-90, fa.field_d[83]);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    stackIn_57_0 = this;

                    if (var10 == 0) {
                      stackIn_58_0 = this;
                      stackIn_58_1 = 0;
                      break L10;
                    } else {
                      stackIn_58_0 = this;
                      stackIn_58_1 = 1;
                      break L10;
                    }
                  }
                  L11: {
                    ((npb) (this)).field_b = stackIn_58_1 != 0;
                    if (!param3.d(9, 47)) {
                      stackIn_61_0 = 0;
                      break L11;
                    } else {
                      stackIn_61_0 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = stackIn_61_0;
                    if (var11 == 0) {
                      break L12;
                    } else {
                      if (!this.field_c) {
                        lha.a(-103, fa.field_d[84]);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    stackIn_67_0 = this;

                    if (var11 == 0) {
                      stackIn_68_0 = this;
                      stackIn_68_1 = 0;
                      break L13;
                    } else {
                      stackIn_68_0 = this;
                      stackIn_68_1 = 1;
                      break L13;
                    }
                  }
                  ((npb) (this)).field_c = stackIn_68_1 != 0;
                  if (var11 != 0) {
                    L14: {
                      var12 = param3.y(8) / oq.field_l;
                      if (var12 < 0) {
                        var12 = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (this.field_a <= var12) {
                        break L15;
                      } else {
                        lha.a(-98, fa.field_d[85]);
                        break L15;
                      }
                    }
                    this.field_a = var12;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  L16: {
                    var12_ref_sg = var10_ref_sg__[var11];
                    if (var12_ref_sg != null) {
                      L17: {
                        if (!var12_ref_sg.b(2, (byte) -3)) {
                          if (!var12_ref_sg.b(1, (byte) 69)) {
                            stackIn_32_0 = 1;
                            break L17;
                          } else {
                            stackIn_32_0 = 0;
                            break L17;
                          }
                        } else {
                          stackIn_32_0 = 0;
                          break L17;
                        }
                      }
                      L18: {
                        var13 = stackIn_32_0;
                        if (var12_ref_sg.q((byte) 98) == param3.q((byte) 65)) {
                          if (!qab.a(param1 ^ 57, param2.field_g.d(false))) {
                            if (var12_ref_sg.o((byte) -117) != param3.o((byte) -117)) {
                              if (null != var12_ref_sg.k((byte) -108)) {
                                if (var12_ref_sg.k((byte) -108).a((byte) 127) != param0) {
                                  stackIn_44_0 = 1;
                                  break L18;
                                } else {
                                  stackIn_44_0 = 0;
                                  break L18;
                                }
                              } else {
                                stackIn_44_0 = 1;
                                break L18;
                              }
                            } else {
                              stackIn_44_0 = 0;
                              break L18;
                            }
                          } else {
                            stackIn_44_0 = 0;
                            break L18;
                          }
                        } else {
                          stackIn_44_0 = 1;
                          break L18;
                        }
                      }
                      var14 = stackIn_44_0;
                      if (var13 == 0) {
                        break L16;
                      } else {
                        if (var14 == 0) {
                          break L16;
                        } else {
                          var8++;
                          break L16;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                  var11++;
                  continue L7;
                }
              }
            } else {
              this.field_g = false;
              this.field_d = 0;
              this.field_a = 0;
              this.field_e = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("npb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L19;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');

            if (param3 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L20;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L20;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_80_0), stackIn_83_2 + ')');
        }
    }

    final void a(int param0, rsb param1, byte param2, sg param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        sg var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                L2: {
                  var5_int = param3.t(0);
                  if ((var5_int ^ -1) > -65) {
                    ioa.a(15, 0, (byte) -53);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1.field_g.b(param3.c(false), -71)) {
                  ioa.a(86, 0, (byte) -109);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param2 == 70) {
              break L0;
            } else {
              var6 = (sg) null;
              this.a(29, (rsb) null, (byte) -95, (sg) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("npb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    static {
    }
}
