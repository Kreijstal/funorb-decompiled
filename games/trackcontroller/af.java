/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends di {
    static String field_n;
    static kd field_o;
    private boolean field_p;
    private String field_m;

    public static void d(byte param0) {
        int var1 = -80 / ((0 - param0) / 46);
        field_n = null;
        field_o = null;
    }

    af(lb param0) {
        super(param0);
        this.field_p = false;
    }

    final ud a(int param0, String param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ud stackIn_3_0 = null;
        ud stackIn_6_0 = null;
        ud stackIn_13_0 = null;
        ud stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!pl.a(43, var4)) {
              stackIn_3_0 = ef.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 <= -106) {
                L1: {
                  if (!param1.equals(this.field_m)) {
                    L2: {
                      var3 = kj.a(param1, 63);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null == var3.field_c) {
                          this.field_m = param1;
                          this.field_p = var3.field_e;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = tk.field_t;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (this.field_p) {
                    stackIn_18_0 = TrackController.field_G;
                    break L3;
                  } else {
                    stackIn_18_0 = ef.field_b;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_6_0 = (ud) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("af.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                if (param1 == -9) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                      param0.getAppletContext().showDocument(of.a(param0, var2, false), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var2_ref.printStackTrace();
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("af.A(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              gh.field_k = false;
              u.field_i = false;
              if (kb.field_a == null) {
                break L1;
              } else {
                if (!kb.field_a.field_E) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 1;
                    if (-9 != (param1 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (vg.field_o) {
                          param2 = vi.field_e;
                          break L3;
                        } else {
                          param2 = ba.field_d;
                          break L3;
                        }
                      }
                      param1 = 2;
                      ra.field_y.a((byte) 114, qg.field_c);
                      break L2;
                    }
                  }
                  L4: {
                    if (-11 == (param1 ^ -1)) {
                      pl.a(0);
                      var3_int = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (!u.field_i) {
                          break L6;
                        } else {
                          param2 = dh.a((byte) -73, new String[]{param2}, od.field_b);
                          break L6;
                        }
                      }
                      L7: {
                        if (!pc.field_h) {
                          break L7;
                        } else {
                          param2 = cb.field_a;
                          break L7;
                        }
                      }
                      kb.field_a.a(param1, param2, -10);
                      break L5;
                    }
                  }
                  if (-257 == (param1 ^ -1)) {
                    break L1;
                  } else {
                    if (10 == param1) {
                      break L1;
                    } else {
                      if (vg.field_o) {
                        break L1;
                      } else {
                        ra.field_y.a((byte) 121);
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L8: {
              if (param0 < -60) {
                break L8;
              } else {
                field_n = (String) null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("af.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        nj var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            var3 = il.a(-67, var5);
            if (var3 == null) {
              L1: {
                if (!param0.equals(this.field_m)) {
                  var4 = kj.a(param0, 63);
                  if (var4 != null) {
                    if (var4.field_c == null) {
                      this.field_m = param0;
                      this.field_p = var4.field_e;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 426) {
                  break L2;
                } else {
                  this.field_m = (String) null;
                  break L2;
                }
              }
              if (this.field_p) {
                stackIn_17_0 = qk.field_K;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_15_0 = ga.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("af.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                if (wd.field_R) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  L1: {
                    if (param0 == 9819) {
                      break L1;
                    } else {
                      af.d((byte) 51);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      var2 = "tuhstatbut";
                      var3 = (String) (sj.a((byte) -29, "getcookies", param1));
                      var4 = te.a(var3, ';', (byte) -46);
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 0;
                          break L2;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L2;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_19_0 = 0;
                        break L6;
                      } else {
                        stackIn_19_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref2);

                stackIn_22_1 = new StringBuilder().append("af.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        if (param0) {
            this.a(true);
        }
        this.field_m = null;
    }

    static {
        field_n = "Highscores";
        field_o = null;
    }
}
