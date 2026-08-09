/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    private l field_d;
    static String field_c;
    static String field_a;
    private l field_e;
    static km[] field_i;
    private l[] field_b;
    private int field_h;
    static int field_g;
    private int field_f;

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (param1 != 104) {
            jc var5 = (jc) null;
            ln.a(68, -61, (pd) null, (jc) null);
        }
        if (null != md.field_e && md.field_e.b(param1 ^ 21)) {
            ch.a(true);
            return true;
        }
        if (km.field_yb != null && km.field_yb.d(false)) {
            km.field_yb = null;
            ch.a(true);
            return true;
        }
        if (!(!s.b((byte) -109))) {
            return true;
        }
        if (cb.a(-13079, param2, param3, param0)) {
            return true;
        }
        return false;
    }

    final l a(byte param0) {
        this.field_h = 0;
        if (param0 != 19) {
            return (l) null;
        }
        return this.a(110);
    }

    final static boolean a(byte param0, eh param1, eh param2, eh param3) {
        RuntimeException var4 = null;
        cj var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2.c(0)) {
                break L1;
              } else {
                if (!param2.a((byte) -102, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 127) {
                      break L2;
                    } else {
                      var5 = (cj) null;
                      ln.a((cj) null, -22);
                      break L2;
                    }
                  }
                  if (!param1.c(0)) {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param1.a((byte) -102, "commonui")) {
                      L3: {
                        if (!param3.c(param0 ^ 127)) {
                          break L3;
                        } else {
                          if (!param3.a((byte) -102, "button.gif")) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ln.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final l a(long param0, int param1) {
        l var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        l var4 = this.field_b[(int)(param0 & (long)(this.field_f - 1))];
        this.field_d = var4.field_f;
        while (var4 != this.field_d) {
            if (param0 == this.field_d.field_d) {
                var5 = this.field_d;
                this.field_d = this.field_d.field_f;
                return var5;
            }
            this.field_d = this.field_d.field_f;
        }
        this.field_d = null;
        if (param1 == -14905) {
            return null;
        }
        return (l) null;
    }

    final static void a(cj param0, int param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= qh.field_K) {
                    dupTemp$0 = param0.b(-6761);
                    hf.field_D[dupTemp$0] = hf.field_D[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= qh.field_K) {
                        L4: {
                          if (param1 > 88) {
                            break L4;
                          } else {
                            field_a = (String) null;
                            break L4;
                          }
                        }
                        qh.field_K = var2_int;
                        fieldTemp$1 = qh.field_K;
                        qh.field_K = qh.field_K + 1;
                        el.field_s[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param0.field_n == el.field_s[var3].field_n) {
                              var4 = el.field_s[var3].b(-6761);
                              if (nb.field_s < hf.field_D[var4]) {
                                hf.field_D[var4] = hf.field_D[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          el.field_s[incrementValue$2] = el.field_s[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (param0.field_n != el.field_s[var2_int].field_n) {
                        break L7;
                      } else {
                        dupTemp$3 = el.field_s[var2_int].b(-6761);
                        hf.field_D[dupTemp$3] = hf.field_D[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                hf.field_D[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ln.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, pd param2, jc param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            StringBuilder stackIn_40_1 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            int var13_int = 0;
            Class[] var13 = null;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            bf var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            var15 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                var19 = new bf();
                var19.field_n = param3.g(11132);
                var19.field_h = param3.d((byte) 112);
                var19.field_g = new int[var19.field_n];
                var19.field_l = new int[var19.field_n];
                var19.field_j = new byte[var19.field_n][][];
                var19.field_r = new un[var19.field_n];
                var19.field_q = new un[var19.field_n];
                var19.field_u = new int[var19.field_n];
                var5 = 42 / ((-62 - param0) / 56);
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var19.field_n) {
                    l.field_c.a(var19, (byte) -84);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param3.g(11132);
                            if (0 == var7_int) {
                              break L4;
                            } else {
                              if (var7_int == 1) {
                                break L4;
                              } else {
                                if (var7_int != 2) {
                                  L5: {
                                    if (var7_int == 3) {
                                      break L5;
                                    } else {
                                      if ((var7_int ^ -1) == -5) {
                                        break L5;
                                      } else {
                                        var6++;
                                        decompiledRegionSelector0 = 1;
                                        break L2;
                                      }
                                    }
                                  }
                                  var21 = param3.h(-117);
                                  var22 = param3.h(-117);
                                  var10 = param3.g(11132);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var12_int >= var10) {
                                      L7: {
                                        var23 = new byte[var10][];
                                        var20 = var23;
                                        var12 = var20;
                                        if ((var7_int ^ -1) == -4) {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var10 <= var13_int) {
                                              break L7;
                                            } else {
                                              var14 = param3.d((byte) 124);
                                              array$0 = new byte[var14];
                                              var12[var13_int] = array$0;
                                              param3.a(0, var14, true, var23[var13_int]);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      var19.field_g[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          var19.field_r[var6] = param2.a(cj.a(-109, var21), var13, true, var22);
                                          var19.field_j[var6] = var23;
                                          break L3;
                                        } else {
                                          var13[var18] = cj.a(-99, var11[var18]);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param3.h(-117);
                                      var12_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param3.h(-122);
                            var8 = var16;
                            var17 = param3.h(-118);
                            var9 = var17;
                            var10 = 0;
                            if (1 != var7_int) {
                              break L10;
                            } else {
                              var10 = param3.d((byte) 95);
                              break L10;
                            }
                          }
                          var19.field_g[var6] = var7_int;
                          var19.field_u[var6] = var10;
                          var19.field_q[var6] = param2.a(cj.a(71, var16), var17, true);
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19.field_l[var6] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19.field_l[var6] = -2;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19.field_l[var6] = -3;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19.field_l[var6] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var19.field_l[var6] = -5;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var6++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_37_0 = (RuntimeException) (var4);

                stackIn_37_1 = new StringBuilder().append("ln.F(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "null";
                  break L16;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

                if (param3 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "null";
                  break L17;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "{...}";
                  break L17;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final l a(int param0) {
        int fieldTemp$2 = 0;
        l var2_ref_l;
        int var3;
        l var4;
        int var2;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (0 >= this.field_h) {
            break L0;
          } else {
            if (this.field_e != this.field_b[this.field_h + -1]) {
              var2_ref_l = this.field_e;
              this.field_e = var2_ref_l.field_f;
              return var2_ref_l;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (this.field_h >= this.field_f) {
            var2 = 49 / ((-32 - param0) / 46);
            return null;
          } else {
            fieldTemp$2 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_b[fieldTemp$2].field_f;
            var2_ref_l = var4;
            if (var4 != this.field_b[-1 + this.field_h]) {
              this.field_e = var2_ref_l.field_f;
              return var2_ref_l;
            } else {
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            ln.a(false);
        }
        field_i = null;
        field_a = null;
        field_c = null;
    }

    final void a(l param0, byte param1, long param2) {
        l var5 = null;
        try {
            if (param0.field_a != null) {
                param0.a(false);
            }
            var5 = this.field_b[(int)((long)(-1 + this.field_f) & param2)];
            param0.field_f = var5;
            param0.field_a = var5.field_a;
            if (param1 < 0) {
                jc var6 = (jc) null;
                ln.a(-57, -4, (pd) null, (jc) null);
            }
            param0.field_a.field_f = param0;
            param0.field_d = param2;
            param0.field_f.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ln.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ln(int param0) {
        int var2 = 0;
        l dupTemp$0 = null;
        l var3 = null;
        this.field_h = 0;
        this.field_b = new l[param0];
        this.field_f = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new l();
            var3 = dupTemp$0;
            this.field_b[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_f = var3;
        }
    }

    final static boolean b(int param0) {
        int var1 = -31 / ((param0 - 7) / 57);
        return null != ul.field_a ? true : false;
    }

    static {
        field_c = "<%0> must play <%1> more rated games before playing with the current options.";
        field_a = "Offline";
    }
}
