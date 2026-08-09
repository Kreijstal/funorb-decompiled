/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends cg {
    private hf field_l;
    private hf field_j;
    static String field_k;

    mk(hf param0, hf param1, hf param2) {
        super(param0);
        try {
            this.field_j = param2;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static te c(byte param0) {
        try {
            Throwable var1 = null;
            te stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 100) {
                break L0;
              } else {
                mk.h(-40);
                break L0;
              }
            }
            try {
              L1: {
                stackIn_3_0 = (te) (Class.forName("bh").newInstance());
                break L1;
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

    public static void b(byte param0) {
        int var1 = -52 / ((param0 - 43) / 36);
        field_k = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_l.field_r.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              var5 = var4;
              if (te.a(param1, var5)) {
                stackIn_6_0 = s.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (hi.a(var5, 0)) {
                  stackIn_10_0 = hl.field_C;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!lc.a((byte) -33, var5)) {
                    if (!this.b(param0, 0)) {
                      L1: {
                        if (!param1) {
                          break L1;
                        } else {
                          this.field_l = (hf) null;
                          break L1;
                        }
                      }
                      if (var6.length() <= 0) {
                        stackIn_34_0 = ll.field_g;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if (gi.a(var5, -123, var6)) {
                          stackIn_23_0 = qi.field_F;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (la.a(var6, (byte) -115, var5)) {
                            stackIn_27_0 = i.field_b;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (!g.a(var6, var5, -1)) {
                              stackIn_32_0 = s.field_b;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_30_0 = qi.field_F;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = bj.field_u;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = ta.field_fb;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("mk.I(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L2;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          return stackIn_34_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static java.applet.Applet g(int param0) {
        if (!(uh.field_i == null)) {
            return uh.field_i;
        }
        if (param0 >= -116) {
            mk.a(-119, false, true, false);
            return (java.applet.Applet) ((Object) jj.field_a);
        }
        return (java.applet.Applet) ((Object) jj.field_a);
    }

    final static int h(int param0) {
        if (param0 != -1) {
            mk.b((byte) -72);
            return mh.field_b;
        }
        return mh.field_b;
    }

    final sg a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        sg stackIn_4_0 = null;
        sg stackIn_8_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -58) {
                break L1;
              } else {
                this.field_l = (hf) null;
                break L1;
              }
            }
            var3 = this.field_l.field_r.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              if (!f.a(var4, 125, var3)) {
                stackIn_8_0 = pe.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.b(param0, 0)) {
                  stackIn_13_0 = ii.field_e;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = pe.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = pe.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("mk.M(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_j = (hf) null;
                break L1;
              }
            }
            L2: {
              var3 = this.field_j.field_r.toLowerCase();
              var4 = param0.toLowerCase();
              if (-1 <= (var3.length() ^ -1)) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (0 > var4.indexOf(var6)) {
                        if ((var4.indexOf(var7) ^ -1) > -1) {
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_14_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("mk.N(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        if (param0 >= 106) {
          var4 = 0;
          if (!param2) {
            if (param1) {
              L0: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return bf.field_d[var4];
            } else {
              L1: {
                if (param3) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return bf.field_d[var4];
            }
          } else {
            var4 += 4;
            if (param1) {
              L2: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return bf.field_d[var4];
            } else {
              L3: {
                if (param3) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return bf.field_d[var4];
            }
          }
        } else {
          mk.c((byte) -75);
          var4 = 0;
          if (param2) {
            var4 += 4;
            if (!param1) {
              L4: {
                if (param3) {
                  var4++;
                  break L4;
                } else {
                  break L4;
                }
              }
              return bf.field_d[var4];
            } else {
              L5: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L5;
                } else {
                  break L5;
                }
              }
              return bf.field_d[var4];
            }
          } else {
            if (param1) {
              L6: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L6;
                } else {
                  break L6;
                }
              }
              return bf.field_d[var4];
            } else {
              L7: {
                if (param3) {
                  var4++;
                  break L7;
                } else {
                  break L7;
                }
              }
              return bf.field_d[var4];
            }
          }
        }
    }

    static {
    }
}
