/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends nv {
    private boolean field_s;
    static String field_q;
    static int[] field_o;
    private int field_t;
    private jma field_n;
    static jea[] field_p;
    static long field_r;

    final static tn a(cn param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        tn stackIn_2_0 = null;
        tn stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tn stackOut_6_0 = null;
        tn stackOut_1_0 = null;
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
            if (param2 == 15) {
              var4 = param0.f(param1, 105);
              var3 = var4;
              if (var4 != null) {
                stackOut_6_0 = new tn(var4);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (tn) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("rb.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void k(int param0) {
        this.j((byte) 79);
        this.field_n.a((byte) -14, this.field_s);
        if (param0 != 5418) {
            this.c(false);
        }
    }

    rb(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_t = param1.b((byte) 44, 4);
            this.field_n = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 > -116) {
          rb.g((byte) 32);
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        if (param0) {
            return;
        }
        try {
            super.a(param0, param1);
            param1.a((byte) -127, this.field_t, 4);
            this.field_n.a(this.h((byte) 119), (byte) 88, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var3 = this.field_t;
          if (var3 != 0) {
            if ((var3 ^ -1) != -2) {
              L1: {
                if (var3 != 2) {
                  if (var3 == 3) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == 79) {
                        break L2;
                      } else {
                        this.g(91);
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  if (var4 == 0) {
                    L3: {
                      var2 = this.b(true).a(this.field_g.e(9648), this.field_g.c(-96), param0 ^ 79, 2, this.field_g.a((byte) 55), this.field_g.d(param0 + -76), this.e(6));
                      stackOut_77_0 = this;
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_78_0 = stackOut_77_0;
                      if (var2 < (this.field_g.c(param0 ^ -51) >> -82100400) * (this.field_g.a((byte) 55) >> 775746832)) {
                        stackOut_79_0 = this;
                        stackOut_79_1 = 0;
                        stackIn_80_0 = stackOut_79_0;
                        stackIn_80_1 = stackOut_79_1;
                        break L3;
                      } else {
                        stackOut_78_0 = this;
                        stackOut_78_1 = 1;
                        stackIn_80_0 = stackOut_78_0;
                        stackIn_80_1 = stackOut_78_1;
                        break L3;
                      }
                    }
                    ((rb) (this)).field_s = stackIn_80_1 != 0;
                    if (var4 == 0) {
                      if (param0 != 79) {
                        this.g(91);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L4: {
                      if (var3 == 3) {
                        this.field_s = this.i(12340).f(8, 10915);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (param0 != 79) {
                      this.g(91);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              this.field_s = this.i(12340).f(8, 10915);
              if (param0 != 79) {
                this.g(91);
                return;
              } else {
                return;
              }
            } else {
              if (var4 == 0) {
                break L0;
              } else {
                if (var3 == 2) {
                  if (var4 == 0) {
                    L5: {
                      var2 = this.b(true).a(this.field_g.e(9648), this.field_g.c(-96), param0 ^ 79, 2, this.field_g.a((byte) 55), this.field_g.d(param0 + -76), this.e(6));
                      stackOut_34_0 = this;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (var2 < (this.field_g.c(param0 ^ -51) >> -82100400) * (this.field_g.a((byte) 55) >> 775746832)) {
                        stackOut_36_0 = this;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L5;
                      } else {
                        stackOut_35_0 = this;
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L5;
                      }
                    }
                    L6: {
                      ((rb) (this)).field_s = stackIn_37_1 != 0;
                      if (var4 == 0) {
                        break L6;
                      } else {
                        this.field_s = this.i(12340).f(8, 10915);
                        break L6;
                      }
                    }
                    L7: {
                      if (param0 == 79) {
                        break L7;
                      } else {
                        this.g(91);
                        break L7;
                      }
                    }
                    return;
                  } else {
                    L8: {
                      if (var3 == 3) {
                        this.field_s = this.i(12340).f(8, 10915);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == 79) {
                        break L9;
                      } else {
                        this.g(91);
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    if (var3 == 3) {
                      this.field_s = this.i(12340).f(8, 10915);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param0 == 79) {
                      break L11;
                    } else {
                      this.g(91);
                      break L11;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if (var4 == 0) {
              this.field_s = this.a((byte) 87);
              if (var4 != 0) {
                break L0;
              } else {
                if (param0 != 79) {
                  this.g(91);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L12: {
                if ((var3 ^ -1) != -2) {
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                L14: {
                  L15: {
                    if (var3 != 2) {
                      break L15;
                    } else {
                      if (var4 == 0) {
                        L16: {
                          var2 = this.b(true).a(this.field_g.e(9648), this.field_g.c(-96), param0 ^ 79, 2, this.field_g.a((byte) 55), this.field_g.d(param0 + -76), this.e(6));
                          stackOut_10_0 = this;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var2 < (this.field_g.c(param0 ^ -51) >> -82100400) * (this.field_g.a((byte) 55) >> 775746832)) {
                            stackOut_12_0 = this;
                            stackOut_12_1 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L16;
                          } else {
                            stackOut_11_0 = this;
                            stackOut_11_1 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L16;
                          }
                        }
                        ((rb) (this)).field_s = stackIn_13_1 != 0;
                        if (var4 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (var3 == 3) {
                    break L14;
                  } else {
                    break L13;
                  }
                }
                this.field_s = this.i(12340).f(8, 10915);
                break L13;
              }
              L17: {
                if (param0 == 79) {
                  break L17;
                } else {
                  this.g(91);
                  break L17;
                }
              }
              return;
            }
          }
        }
        this.field_s = this.field_g.d(50, false);
        if (var4 != 0) {
          L18: {
            var2 = this.b(true).a(this.field_g.e(9648), this.field_g.c(-96), param0 ^ 79, 2, this.field_g.a((byte) 55), this.field_g.d(param0 + -76), this.e(6));
            stackOut_66_0 = this;
            stackIn_68_0 = stackOut_66_0;
            stackIn_67_0 = stackOut_66_0;
            if (var2 < (this.field_g.c(param0 ^ -51) >> -82100400) * (this.field_g.a((byte) 55) >> 775746832)) {
              stackOut_68_0 = this;
              stackOut_68_1 = 0;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              break L18;
            } else {
              stackOut_67_0 = this;
              stackOut_67_1 = 1;
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              break L18;
            }
          }
          ((rb) (this)).field_s = stackIn_69_1 != 0;
          if (var4 == 0) {
            if (param0 != 79) {
              this.g(91);
              return;
            } else {
              return;
            }
          } else {
            L19: {
              this.field_s = this.i(12340).f(8, 10915);
              if (param0 == 79) {
                break L19;
              } else {
                this.g(91);
                break L19;
              }
            }
            return;
          }
        } else {
          if (param0 != 79) {
            this.g(91);
            return;
          } else {
            return;
          }
        }
    }

    final void c(boolean param0) {
        super.c(param0);
        if (this.field_t == 0) {
            this.field_n.a((byte) -14, true);
        }
    }

    final int a(int param0, int param1) {
        kh var4 = null;
        if (param1 > -48) {
          var4 = (kh) null;
          this.a(false, (kh) null);
          param0 = upa.a(this.field_s, param0, (byte) -53);
          return param0;
        } else {
          param0 = upa.a(this.field_s, param0, (byte) -53);
          return param0;
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_n.a((byte) 48, this.h((byte) 116));
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_n = (jma) null;
            return 13;
        }
        return 13;
    }

    static {
        field_q = "Played";
        field_o = fqa.e(true);
    }
}
