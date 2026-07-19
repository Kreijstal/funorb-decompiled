/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private ca field_d;
    private ca field_c;
    static ng field_f;
    static int[] field_b;
    static sh field_e;
    static sh field_a;

    public static void b(byte param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != -127) {
            ci.b((byte) -96);
        }
    }

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new char[var2_int];
              if (param1 == -79) {
                break L1;
              } else {
                field_f = (ng) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  var3[-1 + (var2_int - var4)] = param0.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = new String(var3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("ci.B(");
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
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final ca a(byte param0) {
        ca var2 = null;
        var2 = this.field_d.field_l;
        if (this.field_d != var2) {
          if (param0 != 100) {
            return (ca) null;
          } else {
            var2.b(12);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, ca param1) {
        try {
            int var3_int = 110 / ((0 - param0) / 61);
            if (!(param1.field_m == null)) {
                param1.b(12);
            }
            param1.field_l = this.field_d;
            param1.field_m = this.field_d.field_m;
            param1.field_m.field_l = param1;
            param1.field_l.field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ci.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ca a(boolean param0) {
        ca var2 = null;
        if (param0) {
          var2 = this.field_d.field_l;
          if (var2 == this.field_d) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_l;
            return var2;
          }
        } else {
          return (ca) null;
        }
    }

    final int b(int param0) {
        int var2 = 0;
        ca var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_d.field_l;
        L0: while (true) {
          if (this.field_d == var3) {
            if (param0 < 22) {
              field_a = (sh) null;
              return var2;
            } else {
              return var2;
            }
          } else {
            var3 = var3.field_l;
            var2++;
            if (var4 == 0) {
              continue L0;
            } else {
              return var2;
            }
          }
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (param0) {
          L0: {
            if (param1 < 32) {
              break L0;
            } else {
              if (param1 > 126) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (param1 < 160) {
            L1: {
              if (param1 == 8364) {
                break L1;
              } else {
                if (param1 == 338) {
                  break L1;
                } else {
                  if (param1 == 8212) {
                    break L1;
                  } else {
                    if (param1 == 339) {
                      break L1;
                    } else {
                      if (param1 == 376) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
            }
            return true;
          } else {
            if (param1 > 255) {
              L2: {
                if (param1 == 8364) {
                  break L2;
                } else {
                  if (param1 == 338) {
                    break L2;
                  } else {
                    if (param1 == 8212) {
                      break L2;
                    } else {
                      if (param1 == 339) {
                        break L2;
                      } else {
                        if (param1 == 376) {
                          break L2;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          field_f = (ng) null;
          if (param1 >= 32) {
            if (param1 > 126) {
              if (param1 < 160) {
                L3: {
                  if (param1 == 8364) {
                    break L3;
                  } else {
                    if (param1 == 338) {
                      break L3;
                    } else {
                      if (param1 == 8212) {
                        break L3;
                      } else {
                        if (param1 == 339) {
                          break L3;
                        } else {
                          if (param1 == 376) {
                            break L3;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              } else {
                if (param1 > 255) {
                  L4: {
                    if (param1 == 8364) {
                      break L4;
                    } else {
                      if (param1 == 338) {
                        break L4;
                      } else {
                        if (param1 == 8212) {
                          break L4;
                        } else {
                          if (param1 == 339) {
                            break L4;
                          } else {
                            if (param1 == 376) {
                              break L4;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 160) {
              L5: {
                if (param1 == 8364) {
                  break L5;
                } else {
                  if (param1 == 338) {
                    break L5;
                  } else {
                    if (param1 == 8212) {
                      break L5;
                    } else {
                      if (param1 == 339) {
                        break L5;
                      } else {
                        if (param1 == 376) {
                          break L5;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              if (param1 > 255) {
                if (param1 != 8364) {
                  if (param1 != 338) {
                    if (param1 != 8212) {
                      if (param1 != 339) {
                        if (param1 != 376) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    public ci() {
        this.field_d = new ca();
        this.field_d.field_m = this.field_d;
        this.field_d.field_l = this.field_d;
    }

    final ca a(int param0) {
        ca var2 = null;
        if (param0 == -256) {
          var2 = this.field_c;
          if (this.field_d == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_l;
            return var2;
          }
        } else {
          this.field_d = (ca) null;
          var2 = this.field_c;
          if (this.field_d == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_l;
            return var2;
          }
        }
    }

    static {
        field_f = new ng();
    }
}
