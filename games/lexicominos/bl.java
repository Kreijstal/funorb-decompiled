/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bl {
    static int field_b;
    static String field_a;

    final static boolean a(byte param0, hc param1, hc param2) {
        ee discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -param1.field_hb + param2.field_hb;
                if (ji.field_b != param2.field_jb) {
                  break L2;
                } else {
                  var3_int -= 200;
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param2.field_jb == null) {
                var3_int += 200;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              L4: {
                if (ji.field_b != param1.field_jb) {
                  break L4;
                } else {
                  var3_int += 200;
                  if (var4 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (param1.field_jb == null) {
                var3_int -= 200;
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (param0 > 108) {
                break L5;
              } else {
                discarded$2 = bl.a(75);
                break L5;
              }
            }
            L6: {
              if (0 >= var3_int) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L6;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    public static void a(byte param0) {
        if (param0 <= 106) {
            field_b = -126;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 2) {
          L0: {
            L1: {
              if (-1 > (jd.field_c ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (ki.a((byte) -116)) {
                    break L2;
                  } else {
                    var2 = 1;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = 0;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (da.field_a == null) {
              L3: {
                L4: {
                  ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                  if (null == ff.field_b) {
                    break L4;
                  } else {
                    var2 = 2;
                    ha.a(ff.field_b, (byte) 65);
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var2 = 3;
                break L3;
              }
              L5: {
                if (null != da.field_a) {
                  break L5;
                } else {
                  if (!ne.field_c) {
                    break L5;
                  } else {
                    id.a(var2, param0, (byte) 116);
                    return;
                  }
                }
              }
              return;
            } else {
              ff.field_b = da.field_a.b((byte) -74);
              ka.a(2, -27844);
              if (var3 == 0) {
                L6: {
                  if (null == ff.field_b) {
                    break L6;
                  } else {
                    var2 = 2;
                    ha.a(ff.field_b, (byte) 65);
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L6;
                    }
                  }
                }
                var2 = 3;
                break L0;
              } else {
                L7: {
                  L8: {
                    ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                    if (null == ff.field_b) {
                      break L8;
                    } else {
                      var2 = 2;
                      ha.a(ff.field_b, (byte) 65);
                      if (var3 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var2 = 3;
                  break L7;
                }
                L9: {
                  if (null != da.field_a) {
                    break L9;
                  } else {
                    if (!ne.field_c) {
                      break L9;
                    } else {
                      id.a(var2, param0, (byte) 116);
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          L10: {
            if (null != da.field_a) {
              break L10;
            } else {
              if (!ne.field_c) {
                break L10;
              } else {
                id.a(var2, param0, (byte) 116);
                return;
              }
            }
          }
          return;
        } else {
          field_a = (String) null;
          if (-1 <= (jd.field_c ^ -1)) {
            L11: {
              if (ki.a((byte) -116)) {
                break L11;
              } else {
                var2 = 1;
                if (var3 != 0) {
                  break L11;
                } else {
                  L12: {
                    if (null != da.field_a) {
                      break L12;
                    } else {
                      if (!ne.field_c) {
                        break L12;
                      } else {
                        id.a(var2, param0, (byte) 116);
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
            var2 = 0;
            if (var3 == 0) {
              if (null == da.field_a) {
                if (ne.field_c) {
                  id.a(var2, param0, (byte) 116);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (da.field_a == null) {
                L13: {
                  L14: {
                    ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                    if (null == ff.field_b) {
                      break L14;
                    } else {
                      var2 = 2;
                      ha.a(ff.field_b, (byte) 65);
                      if (var3 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var2 = 3;
                  break L13;
                }
                L15: {
                  if (null != da.field_a) {
                    break L15;
                  } else {
                    if (!ne.field_c) {
                      break L15;
                    } else {
                      id.a(var2, param0, (byte) 116);
                      return;
                    }
                  }
                }
                return;
              } else {
                ff.field_b = da.field_a.b((byte) -74);
                ka.a(2, -27844);
                if (var3 == 0) {
                  L16: {
                    L17: {
                      if (null == ff.field_b) {
                        break L17;
                      } else {
                        var2 = 2;
                        ha.a(ff.field_b, (byte) 65);
                        if (var3 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var2 = 3;
                    break L16;
                  }
                  L18: {
                    if (null != da.field_a) {
                      break L18;
                    } else {
                      if (!ne.field_c) {
                        break L18;
                      } else {
                        id.a(var2, param0, (byte) 116);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L19: {
                    L20: {
                      ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                      if (null == ff.field_b) {
                        break L20;
                      } else {
                        var2 = 2;
                        ha.a(ff.field_b, (byte) 65);
                        if (var3 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var2 = 3;
                    break L19;
                  }
                  L21: {
                    if (null != da.field_a) {
                      break L21;
                    } else {
                      if (!ne.field_c) {
                        break L21;
                      } else {
                        id.a(var2, param0, (byte) 116);
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if (da.field_a == null) {
              L22: {
                L23: {
                  ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                  if (null == ff.field_b) {
                    break L23;
                  } else {
                    var2 = 2;
                    ha.a(ff.field_b, (byte) 65);
                    if (var3 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                var2 = 3;
                break L22;
              }
              L24: {
                if (null != da.field_a) {
                  break L24;
                } else {
                  if (!ne.field_c) {
                    break L24;
                  } else {
                    id.a(var2, param0, (byte) 116);
                    return;
                  }
                }
              }
              return;
            } else {
              ff.field_b = da.field_a.b((byte) -74);
              ka.a(2, -27844);
              if (var3 == 0) {
                L25: {
                  L26: {
                    if (null == ff.field_b) {
                      break L26;
                    } else {
                      var2 = 2;
                      ha.a(ff.field_b, (byte) 65);
                      if (var3 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var2 = 3;
                  break L25;
                }
                L27: {
                  if (null != da.field_a) {
                    break L27;
                  } else {
                    if (!ne.field_c) {
                      break L27;
                    } else {
                      id.a(var2, param0, (byte) 116);
                      return;
                    }
                  }
                }
                return;
              } else {
                L28: {
                  L29: {
                    ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                    if (null == ff.field_b) {
                      break L29;
                    } else {
                      var2 = 2;
                      ha.a(ff.field_b, (byte) 65);
                      if (var3 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  var2 = 3;
                  break L28;
                }
                L30: {
                  if (null != da.field_a) {
                    break L30;
                  } else {
                    if (!ne.field_c) {
                      break L30;
                    } else {
                      id.a(var2, param0, (byte) 116);
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static ee a(int param0) {
        try {
            ee discarded$2 = null;
            Throwable var1 = null;
            ee stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ee stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 >= 87) {
                    break L1;
                  } else {
                    discarded$2 = bl.a(65);
                    break L1;
                  }
                }
                stackOut_2_0 = (ee) (Class.forName("ie").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "3 of 4";
    }
}
