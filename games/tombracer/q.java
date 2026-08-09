/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends ql {
    static boolean field_r;
    private int field_p;
    private int field_q;
    static String field_o;
    private ffa field_n;

    final static void a(byte param0, int param1, int param2) {
        kh var3;
        var3 = ql.field_k;
        var3.k(param1, -2988);
        var3.i(3, 0);
        var3.i(8, 0);
        if (param0 >= -100) {
          field_r = true;
          var3.f(-1477662136, param2);
          return;
        } else {
          var3.f(-1477662136, param2);
          return;
        }
    }

    public final int hashCode() {
        return ira.a(this.field_q, this.field_p, (byte) -93);
    }

    final ffa a(byte param0) {
        if (param0 >= -67) {
            this.field_q = 19;
            return this.field_n;
        }
        return this.field_n;
    }

    final void a(int param0, ffa param1, byte param2, int param3) {
        try {
            this.field_p = param3;
            this.field_n = param1;
            this.field_q = param0;
            if (param2 != 116) {
                ffa var6 = (ffa) null;
                this.a(92, (ffa) null, (byte) -51, 63);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "q.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        if (param1 == 11955) {
          if (48 > param0) {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 <= 90) {
                stackIn_67_0 = 1;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_o = (String) null;
          if (48 <= param0) {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == -98) {
          if (param3 < this.field_q) {
            if (param1 >= this.field_q) {
              if (this.field_p > param2) {
                if (param0 < this.field_p) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0, int param1, ffa param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 57) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_n != param2) {
                  break L3;
                } else {
                  if (param1 != this.field_q) {
                    break L3;
                  } else {
                    if (param0 != this.field_p) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("q.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 8) {
            field_r = false;
        }
    }

    final boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          if (this.field_q == param0) {
            if (param1 != this.field_p) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = false;
          if (this.field_q == param0) {
            if (param1 != this.field_p) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    q(ffa param0, int param1, int param2) {
        try {
            this.field_q = param1;
            this.field_n = param0;
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "q.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Loading graphics";
    }
}
