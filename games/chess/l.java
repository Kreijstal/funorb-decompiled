/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l extends o {
    l field_p;
    static int field_o;
    static int[] field_n;
    l field_m;
    static String field_k;
    static ci field_j;
    long field_l;

    final long a(int param0) {
        if (param0 != 0) {
            return -20L;
        }
        return this.field_l;
    }

    final static dm a(boolean param0, String param1, byte param2, String param3, long param4) {
        RuntimeException var6 = null;
        sk stackIn_5_0 = null;
        ec stackIn_7_0 = null;
        ph stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1L != (param4 ^ -1L)) {
                break L1;
              } else {
                if (param3 != null) {
                  stackIn_7_0 = new ec(param3, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              L2: {
                if (param2 > 32) {
                  break L2;
                } else {
                  l.a(true, -31, (byte) -69, false);
                  break L2;
                }
              }
              stackIn_11_0 = new ph(param4, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = new sk(param4, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("l.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dm) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (dm) ((Object) stackIn_7_0);
          } else {
            return (dm) ((Object) stackIn_11_0);
          }
        }
    }

    final void d(int param0) {
        if (null != this.field_m) {
          this.field_m.field_p = this.field_p;
          this.field_p.field_m = this.field_m;
          this.field_m = null;
          if (param0 != -1) {
            return;
          } else {
            this.field_p = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3) {
        int var4;
        int var5;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        var5 = Chess.field_G;
        if (param1 == -1) {
          ki.a(0, param3);
          if (param2 == -86) {
            return;
          } else {
            l.a(true, -111, (byte) 19, true);
            return;
          }
        } else {
          if (1 == (param1 ^ -1)) {
            wb.b();
            if (param2 == -86) {
              return;
            } else {
              l.a(true, -111, (byte) 19, true);
              return;
            }
          } else {
            if (!param0) {
              if (0 <= param1) {
                if (ae.field_e.length > param1) {
                  ae.field_e[param1].d((byte) 59);
                  if ((param1 ^ -1) != -4) {
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  } else {
                    L0: {
                      if (hj.field_i) {
                        if (!kn.field_L) {
                          stackIn_112_0 = 0;
                          break L0;
                        } else {
                          stackIn_112_0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_112_0 = 0;
                        break L0;
                      }
                    }
                    L1: {
                      L2: {
                        var4 = stackIn_112_0;
                        stackIn_116_0 = -7093;

                        if (!param3) {
                          break L2;
                        } else {

                          if (!ak.a(true)) {
                            break L2;
                          } else {

                            if (var4 != 0) {
                              break L2;
                            } else {
                              stackIn_117_0 = stackIn_116_0;
                              stackIn_117_1 = 1;
                              break L1;
                            }
                          }
                        }
                      }
                      stackIn_117_0 = stackIn_116_0;
                      stackIn_117_1 = 0;
                      break L1;
                    }
                    jb.a(stackIn_117_0, stackIn_117_1 != 0);
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  }
                } else {
                  if ((param1 ^ -1) != -4) {
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  } else {
                    L3: {
                      if (hj.field_i) {
                        if (!kn.field_L) {
                          stackIn_95_0 = 0;
                          break L3;
                        } else {
                          stackIn_95_0 = 1;
                          break L3;
                        }
                      } else {
                        stackIn_95_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var4 = stackIn_95_0;
                        stackIn_99_0 = -7093;

                        if (!param3) {
                          break L5;
                        } else {

                          if (!ak.a(true)) {
                            break L5;
                          } else {

                            if (var4 != 0) {
                              break L5;
                            } else {
                              stackIn_100_0 = stackIn_99_0;
                              stackIn_100_1 = 1;
                              break L4;
                            }
                          }
                        }
                      }
                      stackIn_100_0 = stackIn_99_0;
                      stackIn_100_1 = 0;
                      break L4;
                    }
                    jb.a(stackIn_100_0, stackIn_100_1 != 0);
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  }
                }
              } else {
                if ((param1 ^ -1) != -4) {
                  if (param2 == -86) {
                    return;
                  } else {
                    l.a(true, -111, (byte) 19, true);
                    return;
                  }
                } else {
                  L6: {
                    if (hj.field_i) {
                      if (!kn.field_L) {
                        stackIn_77_0 = 0;
                        break L6;
                      } else {
                        stackIn_77_0 = 1;
                        break L6;
                      }
                    } else {
                      stackIn_77_0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var4 = stackIn_77_0;
                      stackIn_81_0 = -7093;

                      if (!param3) {
                        break L8;
                      } else {

                        if (!ak.a(true)) {
                          break L8;
                        } else {

                          if (var4 != 0) {
                            break L8;
                          } else {
                            stackIn_82_0 = stackIn_81_0;
                            stackIn_82_1 = 1;
                            break L7;
                          }
                        }
                      }
                    }
                    stackIn_82_0 = stackIn_81_0;
                    stackIn_82_1 = 0;
                    break L7;
                  }
                  jb.a(stackIn_82_0, stackIn_82_1 != 0);
                  if (param2 == -86) {
                    return;
                  } else {
                    l.a(true, -111, (byte) 19, true);
                    return;
                  }
                }
              }
            } else {
              ki.a(0, false);
              wb.g(0, 0, 640, 480);
              if (0 <= param1) {
                if (ae.field_e.length > param1) {
                  ae.field_e[param1].d((byte) 59);
                  if ((param1 ^ -1) != -4) {
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  } else {
                    L9: {
                      if (hj.field_i) {
                        if (!kn.field_L) {
                          stackIn_58_0 = 0;
                          break L9;
                        } else {
                          stackIn_58_0 = 1;
                          break L9;
                        }
                      } else {
                        stackIn_58_0 = 0;
                        break L9;
                      }
                    }
                    L10: {
                      L11: {
                        var4 = stackIn_58_0;
                        stackIn_62_0 = -7093;

                        if (!param3) {
                          break L11;
                        } else {

                          if (!ak.a(true)) {
                            break L11;
                          } else {

                            if (var4 != 0) {
                              break L11;
                            } else {
                              stackIn_63_0 = stackIn_62_0;
                              stackIn_63_1 = 1;
                              break L10;
                            }
                          }
                        }
                      }
                      stackIn_63_0 = stackIn_62_0;
                      stackIn_63_1 = 0;
                      break L10;
                    }
                    jb.a(stackIn_63_0, stackIn_63_1 != 0);
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  }
                } else {
                  if ((param1 ^ -1) != -4) {
                    if (param2 != -86) {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L12: {
                      if (hj.field_i) {
                        if (kn.field_L) {
                          stackIn_39_0 = 1;
                          break L12;
                        } else {
                          stackIn_39_0 = 0;
                          break L12;
                        }
                      } else {
                        stackIn_39_0 = 0;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var4 = stackIn_39_0;
                        stackIn_43_0 = -7093;

                        if (!param3) {
                          break L14;
                        } else {

                          if (!ak.a(true)) {
                            break L14;
                          } else {

                            if (var4 != 0) {
                              break L14;
                            } else {
                              stackIn_44_0 = stackIn_43_0;
                              stackIn_44_1 = 1;
                              break L13;
                            }
                          }
                        }
                      }
                      stackIn_44_0 = stackIn_43_0;
                      stackIn_44_1 = 0;
                      break L13;
                    }
                    L15: {
                      jb.a(stackIn_44_0, stackIn_44_1 != 0);
                      if (param2 == -86) {
                        break L15;
                      } else {
                        l.a(true, -111, (byte) 19, true);
                        break L15;
                      }
                    }
                    return;
                  }
                }
              } else {
                if ((param1 ^ -1) == -4) {
                  if (hj.field_i) {
                    L16: {
                      if (!kn.field_L) {
                        stackIn_22_0 = 0;
                        break L16;
                      } else {
                        stackIn_22_0 = 1;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        var4 = stackIn_22_0;
                        stackIn_26_0 = -7093;

                        if (!param3) {
                          break L18;
                        } else {

                          if (!ak.a(true)) {
                            break L18;
                          } else {

                            if (var4 != 0) {
                              break L18;
                            } else {
                              stackIn_27_0 = stackIn_26_0;
                              stackIn_27_1 = 1;
                              break L17;
                            }
                          }
                        }
                      }
                      stackIn_27_0 = stackIn_26_0;
                      stackIn_27_1 = 0;
                      break L17;
                    }
                    jb.a(stackIn_27_0, stackIn_27_1 != 0);
                    if (param2 != -86) {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L19: {
                      L20: {
                        var4 = 0;
                        stackIn_14_0 = -7093;

                        if (!param3) {
                          break L20;
                        } else {

                          if (!ak.a(true)) {
                            break L20;
                          } else {

                            if (var4 != 0) {
                              break L20;
                            } else {
                              stackIn_15_0 = stackIn_14_0;
                              stackIn_15_1 = 1;
                              break L19;
                            }
                          }
                        }
                      }
                      stackIn_15_0 = stackIn_14_0;
                      stackIn_15_1 = 0;
                      break L19;
                    }
                    jb.a(stackIn_15_0, stackIn_15_1 != 0);
                    if (param2 != -86) {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param2 != -86) {
                    l.a(true, -111, (byte) 19, true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(long param0, byte param1) {
        if (null != this.field_m) {
          throw new RuntimeException();
        } else {
          this.field_l = param0;
          if (param1 != 71) {
            this.field_l = -17L;
            return;
          } else {
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_n = null;
        field_j = null;
        if (param0 > -24) {
            l.c((byte) 50);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final boolean e(int param0) {
        if (!(this.field_m != null)) {
            return false;
        }
        if (param0 != -4) {
            return false;
        }
        return true;
    }

    protected l() {
    }

    static {
        field_n = new int[8192];
        field_k = "White in check";
    }
}
