/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends od {
    char[] field_k;
    int[] field_l;
    static long field_p;
    char[] field_o;
    int[] field_q;
    boolean field_m;
    String field_n;

    private final void a(int param0, int param1, uia param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        uia var8 = null;
        Object stackIn_8_0 = null;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_20_0 = null;
        char[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        char[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        char[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        char stackIn_23_2 = 0;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char stackOut_10_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_19_0 = null;
        char[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        char[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        char stackOut_22_2 = 0;
        char[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        char stackOut_21_2 = 0;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (1 != param0) {
                      break L4;
                    } else {
                      this.field_n = param2.e((byte) -76);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((param0 ^ -1) != -3) {
                      break L5;
                    } else {
                      var4_int = param2.h(255);
                      this.field_q = new int[var4_int];
                      this.field_k = new char[var4_int];
                      var5 = 0;
                      L6: while (true) {
                        L7: {
                          if (var4_int <= var5) {
                            break L7;
                          } else {
                            this.field_q[var5] = param2.d(126);
                            var6 = param2.c((byte) 99);
                            stackOut_7_0 = this;
                            stackIn_26_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var7 != 0) {
                              break L2;
                            } else {
                              L8: {
                                stackOut_8_0 = ((br) (this)).field_k;
                                stackOut_8_1 = var5;
                                stackIn_10_0 = stackOut_8_0;
                                stackIn_10_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (-1 != (var6 ^ -1)) {
                                  stackOut_10_0 = (char[]) ((Object) stackIn_10_0);
                                  stackOut_10_1 = stackIn_10_1;
                                  stackOut_10_2 = wpa.a((byte) 11, (byte) var6);
                                  stackIn_11_0 = stackOut_10_0;
                                  stackIn_11_1 = stackOut_10_1;
                                  stackIn_11_2 = stackOut_10_2;
                                  break L8;
                                } else {
                                  stackOut_9_0 = (char[]) ((Object) stackIn_9_0);
                                  stackOut_9_1 = stackIn_9_1;
                                  stackOut_9_2 = 0;
                                  stackIn_11_0 = stackOut_9_0;
                                  stackIn_11_1 = stackOut_9_1;
                                  stackIn_11_2 = stackOut_9_2;
                                  break L8;
                                }
                              }
                              stackIn_11_0[stackIn_11_1] = (char) stackIn_11_2;
                              var5++;
                              if (var7 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L9: {
                    if (param0 == 3) {
                      break L9;
                    } else {
                      if (-5 != (param0 ^ -1)) {
                        break L3;
                      } else {
                        this.field_m = true;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  var4_int = param2.h(255);
                  this.field_o = new char[var4_int];
                  this.field_l = new int[var4_int];
                  var5 = 0;
                  L10: while (true) {
                    if ((var5 ^ -1) <= (var4_int ^ -1)) {
                      break L3;
                    } else {
                      this.field_l[var5] = param2.d(126);
                      var6 = param2.c((byte) 71);
                      stackOut_19_0 = this;
                      stackIn_26_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L11: {
                          stackOut_20_0 = ((br) (this)).field_o;
                          stackOut_20_1 = var5;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          if ((var6 ^ -1) == -1) {
                            stackOut_22_0 = (char[]) ((Object) stackIn_22_0);
                            stackOut_22_1 = stackIn_22_1;
                            stackOut_22_2 = (char)0;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            stackIn_23_2 = stackOut_22_2;
                            break L11;
                          } else {
                            stackOut_21_0 = (char[]) ((Object) stackIn_21_0);
                            stackOut_21_1 = stackIn_21_1;
                            stackOut_21_2 = wpa.a((byte) 11, (byte) var6);
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            stackIn_23_2 = stackOut_21_2;
                            break L11;
                          }
                        }
                        stackIn_23_0[stackIn_23_1] = stackIn_23_2;
                        var5++;
                        if (var7 == 0) {
                          continue L10;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (param1 <= -67) {
                  break L1;
                } else {
                  stackOut_25_0 = this;
                  stackIn_26_0 = stackOut_25_0;
                  break L2;
                }
              }
              var8 = (uia) null;
              this.a((uia) null, -82);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("br.B(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_l != null) {
          var2 = 0;
          L0: while (true) {
            if (this.field_l.length > var2) {
              this.field_l[var2] = fh.a(this.field_l[var2], 32768);
              var2++;
              if (var3 != 0) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_q.length) {
                    if (param0 == 10211) {
                      return;
                    } else {
                      this.field_n = (String) null;
                      return;
                    }
                  } else {
                    this.field_q[var2] = fh.a(this.field_q[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        if (param0 == 10211) {
                          return;
                        } else {
                          this.field_n = (String) null;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (var3 == 0) {
                  continue L0;
                } else {
                  if (null != this.field_q) {
                    var2 = 0;
                    L2: while (true) {
                      if (var2 >= this.field_q.length) {
                        if (param0 == 10211) {
                          return;
                        } else {
                          this.field_n = (String) null;
                          return;
                        }
                      } else {
                        this.field_q[var2] = fh.a(this.field_q[var2], 32768);
                        var2++;
                        if (var3 == 0) {
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            if (param0 == 10211) {
                              return;
                            } else {
                              this.field_n = (String) null;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (param0 == 10211) {
                      return;
                    } else {
                      this.field_n = (String) null;
                      return;
                    }
                  }
                }
              }
            } else {
              if (null != this.field_q) {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= this.field_q.length) {
                    if (param0 == 10211) {
                      return;
                    } else {
                      this.field_n = (String) null;
                      return;
                    }
                  } else {
                    this.field_q[var2] = fh.a(this.field_q[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        L4: {
                          if (param0 == 10211) {
                            break L4;
                          } else {
                            this.field_n = (String) null;
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L5: {
                  if (param0 == 10211) {
                    break L5;
                  } else {
                    this.field_n = (String) null;
                    break L5;
                  }
                }
                return;
              }
            }
          }
        } else {
          if (null != this.field_q) {
            var2 = 0;
            L6: while (true) {
              if (var2 >= this.field_q.length) {
                if (param0 == 10211) {
                  return;
                } else {
                  this.field_n = (String) null;
                  return;
                }
              } else {
                this.field_q[var2] = fh.a(this.field_q[var2], 32768);
                var2++;
                if (var3 == 0) {
                  if (var3 == 0) {
                    continue L6;
                  } else {
                    if (param0 == 10211) {
                      return;
                    } else {
                      this.field_n = (String) null;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 == 10211) {
              return;
            } else {
              this.field_n = (String) null;
              return;
            }
          }
        }
    }

    final void a(uia param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        uia var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -26706) {
                break L1;
              } else {
                var5 = (uia) null;
                this.a((uia) null, -59);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    var3_int = param0.h(255);
                    if (var3_int != 0) {
                      break L5;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  this.a(var3_int, -90, param0);
                  break L4;
                }
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("br.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    br() {
        this.field_m = false;
    }

    static {
    }
}
