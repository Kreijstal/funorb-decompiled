/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q implements kg {
    private int field_c;
    private jb field_e;
    static String field_d;
    static String[] field_a;
    private int field_f;
    static ah field_b;

    final static void b(int param0) {
        hm.field_a = af.field_h;
        hd.field_v = param0;
        if (kb.field_t == ed.field_O) {
          return;
        } else {
          if (!qb.a(kb.field_t, (byte) 114)) {
            qe.field_b = nn.field_X;
            if (!tb.field_g) {
              kb.field_t = ed.field_O;
              if (qh.field_k) {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              } else {
                return;
              }
            } else {
              ud.field_Qb = null;
              aa.field_bc = null;
              tb.field_g = false;
              kb.field_t = ed.field_O;
              if (qh.field_k) {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              } else {
                return;
              }
            }
          } else {
            kk.field_X[kb.field_t].b(param0 ^ 4);
            qe.field_b = nn.field_X;
            if (tb.field_g) {
              ud.field_Qb = null;
              aa.field_bc = null;
              tb.field_g = false;
              kb.field_t = ed.field_O;
              if (!qh.field_k) {
                return;
              } else {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              }
            } else {
              kb.field_t = ed.field_O;
              if (qh.field_k) {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 <= 83) {
            field_a = (String[]) null;
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = (String[]) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param1.length() <= var2_int) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param1.charAt(var2_int);
                  if (ac.a((byte) -103, (char) var3)) {
                    break L3;
                  } else {
                    if (fd.a((char) var3, (byte) 81)) {
                      break L3;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("q.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void a(int param0, byte param1, long param2) {
        bc var4 = null;
        int var5 = 0;
        var4 = nd.field_Lb;
        var4.f(param0, (byte) -92);
        if (param1 != -118) {
          q.b(106);
          var4.field_t = var4.field_t + 1;
          var5 = var4.field_t;
          var4.a(6, false);
          var4.a(-1, param2);
          var4.b(var4.field_t - var5, param1 + 116);
          return;
        } else {
          var4.field_t = var4.field_t + 1;
          var5 = var4.field_t;
          var4.a(6, false);
          var4.a(-1, param2);
          var4.b(var4.field_t - var5, param1 + 116);
          return;
        }
    }

    public q() {
        this.field_c = 1;
        this.field_e = od.field_S;
        this.field_f = 1;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        java.applet.Applet var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            var4_int = -1;
            var5 = param3;
            L1: while (true) {
              if (param2 <= var5) {
                L2: {
                  if (param1 == 2) {
                    break L2;
                  } else {
                    var7 = (java.applet.Applet) null;
                    q.a((java.applet.Applet) null, -67);
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = var4_int >>> 1389959880 ^ bl.field_Ub[255 & (var4_int ^ param0[var5])];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("q.G(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    q(jb param0, int param1, int param2) {
        try {
            this.field_f = param2;
            this.field_e = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "q.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_r) {
                  break L2;
                } else {
                  if (!param0.c(3)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              discarded$1 = this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_A + "</u>", param0.field_t + param1, param2 - -param0.field_w, param0.field_F, param0.field_u, var6_int, -1, this.field_c, this.field_f, this.field_e.field_K + this.field_e.field_N);
              if (param3) {
                break L3;
              } else {
                field_a = (String[]) null;
                break L3;
              }
            }
            L4: {
              if (!param0.c(3)) {
                break L4;
              } else {
                L5: {
                  var7 = this.field_e.b(param0.field_A);
                  var8 = this.field_e.field_N - -this.field_e.field_K;
                  var9 = param0.field_t + param1;
                  var10 = param0.field_w + param2;
                  if (this.field_c != 2) {
                    if (-2 != (this.field_c ^ -1)) {
                      break L5;
                    } else {
                      var9 = var9 + (-var7 + param0.field_F >> 282912449);
                      break L5;
                    }
                  } else {
                    var9 = var9 + (-var7 + param0.field_F);
                    break L5;
                  }
                }
                L6: {
                  if (this.field_f == 2) {
                    var10 = var10 + (param0.field_u + -var8);
                    break L6;
                  } else {
                    if (-2 != (this.field_f ^ -1)) {
                      break L6;
                    } else {
                      var10 = var10 + (-var8 + param0.field_u >> 415632929);
                      break L6;
                    }
                  }
                }
                id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("q.L(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 53 / ((-77 - param0) / 34);
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                stackOut_66_0 = (byte[]) (var3);
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var6 = param1.charAt(var5);
                      if (var6 <= 0) {
                        break L4;
                      } else {
                        if (var6 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 160) {
                        break L5;
                      } else {
                        if (var6 > 255) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var6 != 8364) {
                      if (var6 != 8218) {
                        if (var6 != 402) {
                          if (var6 != 8222) {
                            if (var6 != 8230) {
                              if (8224 == var6) {
                                var3[var5] = (byte)-122;
                                break L2;
                              } else {
                                if (var6 != 8225) {
                                  if (710 != var6) {
                                    if (8240 != var6) {
                                      if (var6 == 352) {
                                        var3[var5] = (byte)-118;
                                        break L2;
                                      } else {
                                        if (var6 == 8249) {
                                          var3[var5] = (byte)-117;
                                          break L2;
                                        } else {
                                          if (338 == var6) {
                                            var3[var5] = (byte)-116;
                                            break L2;
                                          } else {
                                            if (var6 == 381) {
                                              var3[var5] = (byte)-114;
                                              break L2;
                                            } else {
                                              if (var6 != 8216) {
                                                if (var6 == 8217) {
                                                  var3[var5] = (byte)-110;
                                                  break L2;
                                                } else {
                                                  if (8220 == var6) {
                                                    var3[var5] = (byte)-109;
                                                    break L2;
                                                  } else {
                                                    if (var6 != 8221) {
                                                      if (var6 != 8226) {
                                                        if (var6 != 8211) {
                                                          if (8212 != var6) {
                                                            if (var6 != 732) {
                                                              if (var6 != 8482) {
                                                                if (var6 == 353) {
                                                                  var3[var5] = (byte)-102;
                                                                  break L2;
                                                                } else {
                                                                  if (var6 != 8250) {
                                                                    if (var6 != 339) {
                                                                      if (var6 == 382) {
                                                                        var3[var5] = (byte)-98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var6 == 376) {
                                                                          var3[var5] = (byte)-97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var5] = (byte)63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var5] = (byte)-100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var5] = (byte)-101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var5] = (byte)-103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var5] = (byte)-104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var5] = (byte)-105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var5] = (byte)-106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var5] = (byte)-107;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var5] = (byte)-108;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var5] = (byte)-111;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var5] = (byte)-119;
                                      break L2;
                                    }
                                  } else {
                                    var3[var5] = (byte)-120;
                                    break L2;
                                  }
                                } else {
                                  var3[var5] = (byte)-121;
                                  break L2;
                                }
                              }
                            } else {
                              var3[var5] = (byte)-123;
                              break L2;
                            }
                          } else {
                            var3[var5] = (byte)-124;
                            break L2;
                          }
                        } else {
                          var3[var5] = (byte)-125;
                          break L2;
                        }
                      } else {
                        var3[var5] = (byte)-126;
                        break L2;
                      }
                    } else {
                      var3[var5] = (byte)-128;
                      break L2;
                    }
                  }
                  var3[var5] = (byte)var6;
                  break L2;
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var2);
            stackOut_68_1 = new StringBuilder().append("q.A(").append(param0).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
        }
        return stackIn_67_0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param0.getCodeBase();
                    if (param1 > 60) {
                      var3 = ai.a(var4, (byte) -120, param0).getFile();
                      discarded$6 = ii.a(new Object[]{"home", var3 + "home.ws"}, 6760, "updatelinks", param0);
                      discarded$7 = ii.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, 6760, "updatelinks", param0);
                      discarded$8 = ii.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, 6760, "updatelinks", param0);
                      discarded$9 = ii.a(new Object[]{"options", var3 + "options.ws"}, 6760, "updatelinks", param0);
                      discarded$10 = ii.a(new Object[]{"terms", var3 + "terms.ws"}, 6760, "updatelinks", param0);
                      discarded$11 = ii.a(new Object[]{"privacy", var3 + "privacy.ws"}, 6760, "updatelinks", param0);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("q.F(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = "No";
    }
}
