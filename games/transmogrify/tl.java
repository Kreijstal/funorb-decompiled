/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_a;
    static int field_c;
    private wf field_b;
    private qj field_e;
    static int field_d;

    final wf a(wf param0, boolean param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        wf stackIn_9_0 = null;
        wf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != null) {
                  break L2;
                } else {
                  var3 = this.field_e.field_d.field_f;
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param0;
              break L1;
            }
            if (this.field_e.field_d == var3) {
              this.field_b = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_b = var3.field_f;
              if (param1) {
                stackIn_11_0 = (wf) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = (wf) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("tl.I(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wf) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final wf a(byte param0) {
        wf var2;
        var2 = this.field_e.field_d.field_f;
        if (var2 == this.field_e.field_d) {
          this.field_b = null;
          return null;
        } else {
          this.field_b = var2.field_f;
          if (param0 != 62) {
            field_d = 49;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var4 = qa.field_u;
                        if (param0 == 196077633) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        tl.a(-62, -114L);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3_int >= qb.field_f.length) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = ce.field_a[var3_int];
                        stackIn_13_0 = var5 ^ -1;
                        stackIn_5_0 = stackIn_13_0;
                        if (var8 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 > -1) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = uc.a(qb.field_f[var3_int], false, true);
                        var7 = -(var6 >> 169624193) + wd.field_j;
                        var4 = var4 + ee.field_D;
                        if (!q.a(param2, (byte) 12, var4, (jl.field_o << 315628225) + hi.field_c, param1, var7 + -vh.field_m, var6 - -(vh.field_m << 196077633))) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var5;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var4 = var4 + (ee.field_D + ((jl.field_o << 405142401) - -hi.field_c));
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = var4 + fi.field_x;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = -1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var3), "tl.A(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final wf c(int param0) {
        wf var2;
        var2 = this.field_e.field_d.field_b;
        if (var2 != this.field_e.field_d) {
          if (param0 >= -86) {
            this.b(116);
            this.field_b = var2.field_b;
            return var2;
          } else {
            this.field_b = var2.field_b;
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_6_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != null) {
                  break L2;
                } else {
                  var3 = this.field_e.field_d.field_b;
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param0;
              break L1;
            }
            if (var3 == this.field_e.field_d) {
              this.field_b = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                this.field_b = var3.field_b;
                if (param1 == 95) {
                  break L3;
                } else {
                  var4 = (String) null;
                  tl.a((String) null, 56);
                  break L3;
                }
              }
              stackIn_10_0 = (wf) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("tl.H(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wf) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    final static String a(int param0, long param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var11 = Transmogrify.field_A ? 1 : 0;
        if (param1 > 0L) {
          if (6582952005840035281L > param1) {
            if ((param1 % 37L ^ -1L) != -1L) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                L1: {
                  if (var4 == 0L) {
                    break L1;
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = new StringBuilder(var3);
                L2: while (true) {
                  L3: {
                    if (-1L == (param1 ^ -1L)) {
                      break L3;
                    } else {
                      var7 = param1;
                      param1 = param1 / 37L;
                      var9 = cc.field_g[(int)(-(param1 * 37L) + var7)];
                      var13 = 95;
                      var12 = var9;
                      if (var11 != 0) {
                        if (var12 != var13) {
                          field_d = 39;
                          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                          return var6.toString();
                        } else {
                          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                          return var6.toString();
                        }
                      } else {
                        L4: {
                          if (var12 == var13) {
                            var10 = -1 + var6.length();
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        discarded$0 = var6.append((char) var9);
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6.reverse();
                  if (param0 != 11468) {
                    field_d = 39;
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                  } else {
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static q a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        q var5 = null;
        q stackIn_4_0 = null;
        q stackIn_8_0 = null;
        q stackIn_11_0 = null;
        q stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if ((var2_int ^ -1) == 0) {
                    stackIn_8_0 = ai.field_a;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    var5 = lb.a(var3, 5507);
                    if (param1 == 2993) {
                      if (var5 != null) {
                        stackIn_15_0 = (q) (var5);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return mh.a(var4, 46);
                      }
                    } else {
                      stackIn_11_0 = (q) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = cj.field_b;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("tl.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
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
              return stackIn_15_0;
            }
          }
        }
    }

    final static am a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        am var9 = null;
        RuntimeException var9_ref = null;
        am stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new am(param7, param6, param8, param0, param4, param5, param2);
              ec.field_b.a(var9, -104);
              ei.a(true, param3, var9);
              if (param1 > 31) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            stackIn_3_0 = (am) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9_ref);

            stackIn_6_1 = new StringBuilder().append("tl.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    final wf a(int param0) {
        wf var2;
        var2 = this.field_b;
        if (this.field_e.field_d != var2) {
          if (param0 != 405142401) {
            this.field_e = (qj) null;
            this.field_b = var2.field_b;
            return var2;
          } else {
            this.field_b = var2.field_b;
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final wf b(int param0) {
        wf var2;
        if (param0 == -29339) {
          var2 = this.field_b;
          if (var2 == this.field_e.field_d) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_f;
            return var2;
          }
        } else {
          return (wf) null;
        }
    }

    tl(qj param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = false;
    }
}
