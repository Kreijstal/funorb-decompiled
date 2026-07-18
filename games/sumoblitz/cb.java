/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static ri field_e;
    private ms field_f;
    static boolean field_b;
    static wc[] field_a;
    private jn field_d;
    static int field_c;

    final ms b(byte param0) {
        ms var2 = null;
        var2 = ((cb) this).field_d.field_e.field_b;
        if (((cb) this).field_d.field_e != var2) {
          ((cb) this).field_f = var2.field_b;
          if (param0 != -80) {
            ms discarded$2 = ((cb) this).b((byte) -128);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((cb) this).field_f = null;
          return null;
        }
    }

    final ms a(byte param0) {
        ms var2 = null;
        var2 = ((cb) this).field_d.field_e.field_g;
        if (((cb) this).field_d.field_e != var2) {
          ((cb) this).field_f = var2.field_g;
          if (param0 >= -13) {
            ms discarded$2 = ((cb) this).a((byte) -67);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((cb) this).field_f = null;
          return null;
        }
    }

    final ms c(byte param0) {
        ms var2 = null;
        var2 = ((cb) this).field_f;
        if (((cb) this).field_d.field_e != var2) {
          ((cb) this).field_f = var2.field_g;
          if (param0 != 87) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((cb) this).field_f = null;
          return null;
        }
    }

    final ms b(int param0) {
        ms var2 = null;
        if (param0 == 0) {
          var2 = ((cb) this).field_f;
          if (((cb) this).field_d.field_e == var2) {
            ((cb) this).field_f = null;
            return null;
          } else {
            ((cb) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = td.field_u;
        if (var3 >= 5) {
          L0: {
            if (var3 < 105) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 >= 120) {
                break L0;
              } else {
                L1: {
                  var3 = -var3 + 120;
                  var2 = -(var3 * var3 * 8192 / 3300) + 8192;
                  var4 = 1;
                  var5 = 0;
                  if (param1 == 3) {
                    var4 = -1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 != 1) {
                    break L2;
                  } else {
                    var5 = 1;
                    break L2;
                  }
                }
                L3: {
                  if (param1 == 4) {
                    var5 = 1;
                    var4 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (5 == param1) {
                    var4 = -1;
                    var5 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1 == 6) {
                    var4 = 1;
                    var5 = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (param1 == 7) {
                      break L7;
                    } else {
                      if (8 == param1) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L6;
                }
                L8: {
                  if (param1 == 11) {
                    var4 = -1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param1 == 13) {
                    var4 = 1;
                    var5 = -1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1 == 14) {
                    var5 = 1;
                    var4 = -1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param1 != 15) {
                    break L12;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L12;
                  }
                }
                uc.field_b = pm.a(83, var2 * var5, var4 * var2);
                return;
              }
            }
          }
          L13: {
            var4 = 1;
            var5 = 0;
            if (param1 == 3) {
              var4 = -1;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (param1 != 1) {
              break L14;
            } else {
              var5 = 1;
              break L14;
            }
          }
          L15: {
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (5 == param1) {
              var4 = -1;
              var5 = 1;
              break L16;
            } else {
              break L16;
            }
          }
          L17: {
            if (param1 == 6) {
              var4 = 1;
              var5 = -1;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            L19: {
              if (param1 == 7) {
                break L19;
              } else {
                if (8 == param1) {
                  break L19;
                } else {
                  break L18;
                }
              }
            }
            var5 = -1;
            var4 = -1;
            break L18;
          }
          L20: {
            if (param1 == 11) {
              var4 = -1;
              break L20;
            } else {
              break L20;
            }
          }
          L21: {
            if (param1 == 12) {
              var4 = -1;
              var5 = -1;
              break L21;
            } else {
              break L21;
            }
          }
          L22: {
            if (param1 == 13) {
              var4 = 1;
              var5 = -1;
              break L22;
            } else {
              break L22;
            }
          }
          L23: {
            if (param1 == 14) {
              var5 = 1;
              var4 = -1;
              break L23;
            } else {
              break L23;
            }
          }
          L24: {
            if (param1 != 15) {
              break L24;
            } else {
              var5 = 1;
              var4 = 1;
              break L24;
            }
          }
          uc.field_b = pm.a(83, var2 * var5, var4 * var2);
          return;
        } else {
          L25: {
            var2 = var3 * var3 * 8192 / 1100;
            var4 = 1;
            var5 = 0;
            if (param1 == 3) {
              var4 = -1;
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            if (param1 != 1) {
              break L26;
            } else {
              var5 = 1;
              break L26;
            }
          }
          L27: {
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
              break L27;
            } else {
              break L27;
            }
          }
          L28: {
            if (5 == param1) {
              var4 = -1;
              var5 = 1;
              break L28;
            } else {
              break L28;
            }
          }
          L29: {
            if (param1 == 6) {
              var4 = 1;
              var5 = -1;
              break L29;
            } else {
              break L29;
            }
          }
          if (param1 != 7) {
            if (8 != param1) {
              L30: {
                if (param1 == 11) {
                  var4 = -1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                if (param1 == 13) {
                  var4 = 1;
                  var5 = -1;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (param1 == 14) {
                  var5 = 1;
                  var4 = -1;
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (param1 != 15) {
                  break L34;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L34;
                }
              }
              uc.field_b = pm.a(83, var2 * var5, var4 * var2);
              return;
            } else {
              L35: {
                var5 = -1;
                var4 = -1;
                if (param1 == 11) {
                  var4 = -1;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (param1 == 13) {
                  var4 = 1;
                  var5 = -1;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (param1 == 14) {
                  var5 = 1;
                  var4 = -1;
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (param1 != 15) {
                  break L39;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L39;
                }
              }
              uc.field_b = pm.a(83, var2 * var5, var4 * var2);
              return;
            }
          } else {
            L40: {
              var5 = -1;
              var4 = -1;
              if (param1 == 11) {
                var4 = -1;
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              if (param1 == 13) {
                var4 = 1;
                var5 = -1;
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              if (param1 == 14) {
                var5 = 1;
                var4 = -1;
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              if (param1 != 15) {
                break L44;
              } else {
                var5 = 1;
                var4 = 1;
                break L44;
              }
            }
            uc.field_b = pm.a(83, var2 * var5, var4 * var2);
            return;
          }
        }
    }

    final static void a(cd[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cd var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            var3 = 1;
            L1: while (true) {
              if (var2_int <= var3) {
                break L0;
              } else {
                var4 = param0[var3];
                var5 = var3 + -1;
                L2: while (true) {
                  L3: {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (!da.a(param0[var5], -114, var4)) {
                        break L3;
                      } else {
                        param0[var5 - -1] = param0[var5];
                        var5--;
                        continue L2;
                      }
                    }
                  }
                  param0[1 + var5] = var4;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("cb.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + true + ')');
        }
    }

    final ms a(int param0, ms param1) {
        ms var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        ms stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ms stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4 = 2 / ((57 - param0) / 41);
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((cb) this).field_d.field_e.field_b;
                break L1;
              }
            }
            if (var3 == ((cb) this).field_d.field_e) {
              ((cb) this).field_f = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (ms) (Object) stackIn_6_0;
            } else {
              ((cb) this).field_f = var3.field_b;
              stackOut_7_0 = (ms) var3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("cb.K(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final ms a(byte param0, ms param1) {
        ms var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ms stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        ms stackOut_10_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((cb) this).field_d.field_e.field_g;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (param0 == -70) {
              if (var3 == ((cb) this).field_d.field_e) {
                ((cb) this).field_f = null;
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (ms) (Object) stackIn_9_0;
              } else {
                ((cb) this).field_f = var3.field_g;
                stackOut_10_0 = (ms) var3;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ms) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, int param1) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        int var2 = in.field_z;
        te.field_c = te.field_c + param0;
        in.field_z = in.field_z + param0;
        if (gj.a((byte) -84, 10) < 5) {
            if (5 <= gj.a((byte) -84, 10)) {
                kn.field_b = kn.field_b + param0;
                if (var2 >= 50000) {
                    return;
                }
                if (in.field_z < 50000) {
                    return;
                }
                if (!(gt.field_bb)) {
                    th.b(24753, 241, 14);
                }
                return;
            }
            ts.field_a = ts.field_a + param0;
            if (var2 < 50000) {
                if (in.field_z >= 50000) {
                    if (gt.field_bb) {
                        return;
                    }
                    th.b(24753, 241, 14);
                }
            }
            return;
        }
        if (gj.a((byte) -84, 10) < 5) {
            fb.field_a = fb.field_a - param0;
            if (var2 < 50000) {
                if (in.field_z >= 50000) {
                    if (gt.field_bb) {
                        return;
                    }
                    th.b(24753, 241, 14);
                }
            }
            return;
        }
        ha.field_f = ha.field_f - param0;
        if (var2 < 50000) {
            if (in.field_z >= 50000) {
                if (gt.field_bb) {
                    return;
                }
                th.b(24753, 241, 14);
            }
        }
    }

    final static int b(int param0, int param1) {
        if (65536L <= (long)param1) {
          if (16777216L > (long)param1) {
            if ((long)param1 >= 1048576L) {
              if ((long)param1 < 4194304L) {
                return hu.field_f[param1 >> 14] >> 5;
              } else {
                return hu.field_f[param1 >> 16] >> 4;
              }
            } else {
              if (262144L > (long)param1) {
                return hu.field_f[param1 >> 10] >> 7;
              } else {
                return hu.field_f[param1 >> 12] >> 6;
              }
            }
          } else {
            if ((long)param1 >= 268435456L) {
              if (1073741824L > (long)param1) {
                return hu.field_f[param1 >> 22] >> 1;
              } else {
                return hu.field_f[param1 >> 24];
              }
            } else {
              if ((long)param1 < 67108864L) {
                return hu.field_f[param1 >> 18] >> 3;
              } else {
                return hu.field_f[param1 >> 20] >> 2;
              }
            }
          }
        } else {
          if ((long)param1 >= 256L) {
            if ((long)param1 >= 4096L) {
              if ((long)param1 >= 16384L) {
                return hu.field_f[param1 >> 8] >> 8;
              } else {
                return hu.field_f[param1 >> 6] >> 9;
              }
            } else {
              if ((long)param1 >= 1024L) {
                return hu.field_f[param1 >> 4] >> 10;
              } else {
                return hu.field_f[param1 >> 2] >> 11;
              }
            }
          } else {
            if (0 <= param1) {
              return hu.field_f[param1] >> 12;
            } else {
              return -1;
            }
          }
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
    }

    cb(jn param0) {
        try {
            ((cb) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
