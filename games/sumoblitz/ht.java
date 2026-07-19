/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ht implements ft {
    int field_j;
    private boolean field_f;
    fr field_d;
    int field_a;
    private int field_g;
    int field_c;
    static volatile int field_h;
    static String field_b;
    private boolean field_i;
    static hr[] field_e;

    final int c(int param0) {
        if (param0 > -97) {
            field_e = (hr[]) null;
            return this.field_j;
        }
        return this.field_j;
    }

    private final int b(boolean param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = this.field_d.d(this.field_a, -120) * this.field_g;
        if (param0) {
          return -30;
        } else {
          L0: {
            if (!this.field_f) {
              stackOut_3_0 = var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var2 * 4 / 3;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (!param0) {
          if (!this.field_d.field_xc) {
            return false;
          } else {
            var2 = this.b(false);
            this.field_d.a(92, (ht) (this));
            jaggl.OpenGL.glGenerateMipmapEXT(this.field_c);
            this.field_f = true;
            this.b(-71);
            this.a((byte) 86, var2);
            return true;
          }
        } else {
          return false;
        }
    }

    final void b(byte param0) {
        L0: {
          if (0 < this.field_j) {
            this.field_d.a(this.field_j, this.b(false), (byte) -10);
            this.field_j = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 84) {
          field_h = -53;
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -81) {
            ht.a((byte) 94);
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    final void a(boolean param0, int param1) {
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (param1 != 0) {
          L0: {
            this.field_a = 22;
            stackOut_11_0 = param0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (this.field_i) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          L1: {
            if ((stackIn_14_0 ? 1 : 0) == stackIn_14_1) {
              L2: {
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (!param0) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L2;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L2;
                }
              }
              ((ht) (this)).field_i = stackIn_19_1 != 0;
              this.b(param1 ^ -112);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L3: {
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (this.field_i) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L3;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L3;
            }
          }
          L4: {
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              L5: {
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (!param0) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L5;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L5;
                }
              }
              ((ht) (this)).field_i = stackIn_9_1 != 0;
              this.b(param1 ^ -112);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static oh a(qj[] param0, on param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var10 = null;
        Object stackIn_31_0 = null;
        oh stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_30_0 = null;
        oh stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (param0.length <= var3_int) {
                  break L2;
                } else {
                  if (param0[var3_int] != null) {
                    if (param0[var3_int].field_a > 0L) {
                      var3_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              var4 = 12 % ((param2 - 40) / 55);
              var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (param0.length <= var5) {
                      break L5;
                    } else {
                      jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_a);
                      var5++;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  jaggl.OpenGL.glLinkProgramARB(var3_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, kh.field_b, 0);
                  break L4;
                }
                L6: {
                  if (kh.field_b[0] == 0) {
                    L7: {
                      if (kh.field_b[0] != 0) {
                        break L7;
                      } else {
                        System.out.println("Shader linking failed:");
                        break L7;
                      }
                    }
                    L8: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, kh.field_b, 1);
                      if (kh.field_b[1] > 1) {
                        var10 = new byte[kh.field_b[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3_long, kh.field_b[1], kh.field_b, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (-1 == (kh.field_b[0] ^ -1)) {
                      var5 = 0;
                      L9: while (true) {
                        if (param0.length <= var5) {
                          jaggl.OpenGL.glDeleteObjectARB(var3_long);
                          stackOut_30_0 = null;
                          stackIn_31_0 = stackOut_30_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var5].field_a);
                          var5++;
                          if (var6 == 0) {
                            continue L9;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                stackOut_32_0 = new oh(param1, var3_long, param0);
                stackIn_33_0 = stackOut_32_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("ht.P(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          L11: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh) ((Object) stackIn_31_0);
        } else {
          return stackIn_33_0;
        }
    }

    private final void b(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        this.field_d.a(12, (ht) (this));
        if (param0 > -70) {
          L0: {
            L1: {
              this.field_d = (fr) null;
              if (this.field_i) {
                break L1;
              } else {
                L2: {
                  stackOut_12_0 = this.field_c;
                  stackOut_12_1 = 10241;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (!this.field_f) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = 9728;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L2;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 9984;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L2;
                  }
                }
                jaggl.OpenGL.glTexParameteri(stackIn_15_0, stackIn_15_1, stackIn_15_2);
                jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9728);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              stackOut_16_0 = this.field_c;
              stackOut_16_1 = 10241;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              if (this.field_f) {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = stackIn_18_1;
                stackOut_18_2 = 9987;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                break L3;
              } else {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = 9729;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                break L3;
              }
            }
            jaggl.OpenGL.glTexParameteri(stackIn_19_0, stackIn_19_1, stackIn_19_2);
            jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9729);
            break L0;
          }
          return;
        } else {
          L4: {
            L5: {
              if (this.field_i) {
                break L5;
              } else {
                L6: {
                  stackOut_2_0 = this.field_c;
                  stackOut_2_1 = 10241;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  if (!this.field_f) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 9728;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    break L6;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = 9984;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    break L6;
                  }
                }
                jaggl.OpenGL.glTexParameteri(stackIn_5_0, stackIn_5_1, stackIn_5_2);
                jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9728);
                if (!Sumoblitz.field_L) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              stackOut_6_0 = this.field_c;
              stackOut_6_1 = 10241;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              if (this.field_f) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 9987;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                break L7;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 9729;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                break L7;
              }
            }
            jaggl.OpenGL.glTexParameteri(stackIn_9_0, stackIn_9_1, stackIn_9_2);
            jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9729);
            break L4;
          }
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (!param0) {
          return;
        } else {
          L0: {
            if (param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (this.field_f) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          L2: {
            if (stackIn_7_0 != stackIn_7_1) {
              var3 = this.b(false);
              this.field_f = true;
              this.b(-119);
              this.a((byte) 45, var3);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    protected final void finalize() throws Throwable {
        this.b((byte) 112);
        super.finalize();
    }

    private final void a(byte param0, int param1) {
        this.field_d.field_p = this.field_d.field_p - param1;
        if (param0 <= 38) {
          return;
        } else {
          this.field_d.field_p = this.field_d.field_p + this.b(false);
          return;
        }
    }

    final static lj c(boolean param0) {
        if (!param0) {
            return (lj) null;
        }
        return new lj(of.c(100), bt.b(77));
    }

    ht(fr param0, int param1, int param2, int param3, boolean param4) {
        this.field_i = false;
        try {
            this.field_g = param3;
            this.field_a = param2;
            this.field_f = param4 ? true : false;
            this.field_d = param0;
            this.field_c = param1;
            jaggl.OpenGL.glGenTextures(1, hg.field_m, 0);
            this.field_j = hg.field_m[0];
            this.a((byte) 78, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ht.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_h = 0;
        field_b = "Confirm Password: ";
    }
}
