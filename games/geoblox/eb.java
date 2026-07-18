/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    float field_j;
    static dm[] field_g;
    private int field_c;
    private ii[] field_a;
    String field_e;
    static String field_f;
    private int field_d;
    static long field_b;
    static int field_i;
    private int field_h;

    private final void a(int param0, ii param1, int param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(((eb) this).field_h + 1) + (float)param0 / 100.0f;
            if (param2 > -90) {
                Object var5 = null;
                eb.a((java.applet.Applet) null, (byte) 114, (String) null);
            }
            if (param0 == 0) {
                ((eb) this).field_e = param1.field_g;
            } else {
                ((eb) this).field_e = param1.field_m + " - " + param0 + "%";
            }
            ((eb) this).field_j = var4_float * (float)((eb) this).field_c / (float)(1 + ((eb) this).field_d);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "eb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_f = null;
        field_g = null;
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        Object var4 = null;
        ii var6 = null;
        ii var7 = null;
        var3 = Geoblox.field_C;
        if (!param0) {
          var4 = null;
          eb.a((java.applet.Applet) null, (byte) -56, (String) null);
          L0: while (true) {
            if (((eb) this).field_h < ((eb) this).field_d) {
              var7 = ((eb) this).field_a[((eb) this).field_h];
              if (var7.field_i.a(0)) {
                L1: {
                  if (var7.field_l < 0) {
                    break L1;
                  } else {
                    if (var7.field_i.a((byte) 102, var7.field_l)) {
                      break L1;
                    } else {
                      this.a(var7.field_i.b((byte) 36, var7.field_l), var7, -119);
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var7.field_f) {
                    break L2;
                  } else {
                    if (!var7.field_i.a(var7.field_f, (byte) -126)) {
                      this.a(var7.field_i.a(0, var7.field_f), var7, -123);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var7.field_l >= 0) {
                    break L3;
                  } else {
                    if (var7.field_f != null) {
                      break L3;
                    } else {
                      if (null == var7.field_m) {
                        break L3;
                      } else {
                        if (!var7.field_i.b(true)) {
                          this.a(var7.field_i.b((byte) 106), var7, -108);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((eb) this).field_h = ((eb) this).field_h + 1;
                continue L0;
              } else {
                this.a(0, var7, -123);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((eb) this).field_h < ((eb) this).field_d) {
              var6 = ((eb) this).field_a[((eb) this).field_h];
              if (var6.field_i.a(0)) {
                L5: {
                  if (var6.field_l < 0) {
                    break L5;
                  } else {
                    if (var6.field_i.a((byte) 102, var6.field_l)) {
                      break L5;
                    } else {
                      this.a(var6.field_i.b((byte) 36, var6.field_l), var6, -119);
                      return false;
                    }
                  }
                }
                L6: {
                  if (null == var6.field_f) {
                    break L6;
                  } else {
                    if (!var6.field_i.a(var6.field_f, (byte) -126)) {
                      this.a(var6.field_i.a(0, var6.field_f), var6, -123);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var6.field_l >= 0) {
                    break L7;
                  } else {
                    if (var6.field_f != null) {
                      break L7;
                    } else {
                      if (null == var6.field_m) {
                        break L7;
                      } else {
                        if (!var6.field_i.b(true)) {
                          this.a(var6.field_i.b((byte) 106), var6, -108);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((eb) this).field_h = ((eb) this).field_h + 1;
                continue L4;
              } else {
                this.a(0, var6, -123);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        gj.field_s = null;
        qh.field_J = 0;
        li.field_a = null;
        var2 = vg.field_a;
        vg.field_a = ij.field_W;
        ij.field_W = var2;
        if (param0 != 51) {
          if (50 == param0) {
            wg.field_i.field_q = 5;
            wg.field_i.field_b = wg.field_i.field_b + 1;
            if (wg.field_i.field_b < 2) {
              L0: {
                if (wg.field_i.field_b < 2) {
                  break L0;
                } else {
                  if (50 != param0) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (wg.field_i.field_b >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (param0 == 51) {
                return 2;
              } else {
                L1: {
                  if (wg.field_i.field_b < 2) {
                    break L1;
                  } else {
                    if (50 != param0) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (wg.field_i.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            wg.field_i.field_q = 1;
            wg.field_i.field_b = wg.field_i.field_b + 1;
            if (wg.field_i.field_b < 2) {
              L2: {
                if (wg.field_i.field_b < 2) {
                  break L2;
                } else {
                  if (50 != param0) {
                    break L2;
                  } else {
                    return 5;
                  }
                }
              }
              if (wg.field_i.field_b >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (param0 == 51) {
                return 2;
              } else {
                L3: {
                  if (wg.field_i.field_b < 2) {
                    break L3;
                  } else {
                    if (50 != param0) {
                      break L3;
                    } else {
                      return 5;
                    }
                  }
                }
                if (wg.field_i.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        } else {
          wg.field_i.field_q = 2;
          wg.field_i.field_b = wg.field_i.field_b + 1;
          if (wg.field_i.field_b >= 2) {
            if (param0 == 51) {
              return 2;
            } else {
              if (wg.field_i.field_b >= 2) {
                if (50 != param0) {
                  if (wg.field_i.field_b >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              } else {
                if (wg.field_i.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            L4: {
              if (wg.field_i.field_b < 2) {
                break L4;
              } else {
                if (50 != param0) {
                  break L4;
                } else {
                  return 5;
                }
              }
            }
            if (wg.field_i.field_b >= 4) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                try {
                  L1: {
                    L2: {
                      if (param1 > 109) {
                        break L2;
                      } else {
                        field_f = null;
                        break L2;
                      }
                    }
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = wf.a(var3, 59, param0);
                    pa.a(var3.toString(), (byte) 64, true, param0);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("eb.C(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Fetching highscores.";
        field_i = 2;
    }
}
