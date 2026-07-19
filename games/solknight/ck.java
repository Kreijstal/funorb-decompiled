/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private nc field_b;
    private gg field_a;

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param1 == 66) {
          L0: {
            L1: {
              if (0 >= ob.field_l) {
                break L1;
              } else {
                if (null == fc.field_l) {
                  L2: {
                    L3: {
                      dj.field_k = g.a(480, 0, wh.field_c, 640, (byte) -81, 0);
                      if (null != dj.field_k) {
                        break L3;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2 = 2;
                    th.a((byte) -50, dj.field_k);
                    if (var3 == 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!il.b(507)) {
                          break L4;
                        } else {
                          var2 = 0;
                          break L4;
                        }
                      }
                      var2 = 1;
                      break L2;
                    }
                  }
                  if (null != fc.field_l) {
                    return;
                  } else {
                    L5: {
                      if (sf.field_j) {
                        hc.a(param0, true, var2);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  dj.field_k = fc.field_l.b(false);
                  jh.a(2, param1 + 1);
                  if (var3 == 0) {
                    L6: {
                      if (null != dj.field_k) {
                        break L6;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var2 = 2;
                    th.a((byte) -50, dj.field_k);
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    L7: {
                      L8: {
                        dj.field_k = g.a(480, 0, wh.field_c, 640, (byte) -81, 0);
                        if (null != dj.field_k) {
                          break L8;
                        } else {
                          var2 = 3;
                          if (var3 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var2 = 2;
                      th.a((byte) -50, dj.field_k);
                      if (var3 == 0) {
                        break L7;
                      } else {
                        L9: {
                          if (!il.b(507)) {
                            break L9;
                          } else {
                            var2 = 0;
                            break L9;
                          }
                        }
                        var2 = 1;
                        break L7;
                      }
                    }
                    if (null != fc.field_l) {
                      return;
                    } else {
                      L10: {
                        if (sf.field_j) {
                          hc.a(param0, true, var2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
            L11: {
              if (!il.b(507)) {
                break L11;
              } else {
                var2 = 0;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L11;
                }
              }
            }
            var2 = 1;
            break L0;
          }
          if (null == fc.field_l) {
            if (!sf.field_j) {
              return;
            } else {
              hc.a(param0, true, var2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final gg a(gg param0, int param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        gg stackOut_9_0 = null;
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
            L1: {
              if (param1 > 108) {
                break L1;
              } else {
                ck.a(false, (byte) -115);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  break L3;
                } else {
                  var3 = this.field_b.field_e.field_a;
                  if (!SolKnight.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = param0;
              break L2;
            }
            if (this.field_b.field_e == var3) {
              this.field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_a;
              stackOut_9_0 = (gg) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("ck.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gg) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final gg a(byte param0) {
        int var2 = 0;
        gg var3 = null;
        var2 = -121 % ((param0 - 30) / 44);
        var3 = this.field_b.field_e.field_d;
        if (var3 == this.field_b.field_e) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var3.field_d;
          return var3;
        }
    }

    final gg b(int param0) {
        gg discarded$2 = null;
        gg var2 = null;
        var2 = this.field_a;
        if (var2 != this.field_b.field_e) {
          this.field_a = var2.field_a;
          if (param0 != 640) {
            discarded$2 = this.c(19);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        gg stackOut_9_0 = null;
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
            L1: {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  var3 = param1;
                  if (!SolKnight.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.field_b.field_e.field_d;
              break L1;
            }
            if (var3 == this.field_b.field_e) {
              this.field_a = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                this.field_a = var3.field_d;
                if (param0 == 26229) {
                  break L3;
                } else {
                  this.field_a = (gg) null;
                  break L3;
                }
              }
              stackOut_9_0 = (gg) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("ck.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gg) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    final gg a(int param0) {
        gg var2 = null;
        if (param0 != -25119) {
            this.field_b = (nc) null;
            var2 = this.field_b.field_e.field_a;
            if (!(this.field_b.field_e != var2)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_a;
            return var2;
        }
        var2 = this.field_b.field_e.field_a;
        if (!(this.field_b.field_e != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_a;
        return var2;
    }

    final static boolean a(char param0, boolean param1) {
        boolean discarded$6 = false;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param1) {
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$6 = ck.a('=', true);
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    ck(nc param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final gg c(int param0) {
        gg var2 = null;
        var2 = this.field_a;
        if (this.field_b.field_e == var2) {
          this.field_a = null;
          return null;
        } else {
          if (param0 <= 111) {
            return (gg) null;
          } else {
            this.field_a = var2.field_d;
            return var2;
          }
        }
    }

    static {
    }
}
