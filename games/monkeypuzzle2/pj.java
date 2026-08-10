/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static md field_g;
    static vd field_a;
    static kc field_b;
    static ta field_c;
    ug field_f;
    static float field_h;
    static String field_d;
    private ug field_e;

    final void b(byte param0) {
        ug var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        L0: while (true) {
          var2 = this.field_f.field_d;
          if (this.field_f != var2) {
            var2.c(param0 + -19943);
            continue L0;
          } else {
            if (param0 != 121) {
              field_b = (kc) null;
              this.field_e = null;
              return;
            } else {
              this.field_e = null;
              return;
            }
          }
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              var4 = 0;
              if (param0 == 3231) {
                break L1;
              } else {
                field_a = (vd) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_68_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (0 >= var5) {
                        break L5;
                      } else {
                        if (128 > var5) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 == 8218) {
                        var3[var4] = (byte)-126;
                        break L3;
                      } else {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte)-124;
                            break L3;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (8224 != var5) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (381 != var5) {
                                              if (8216 != var5) {
                                                if (var5 != 8217) {
                                                  if (8220 != var5) {
                                                    if (var5 != 8221) {
                                                      if (8226 != var5) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (353 == var5) {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (8250 != var5) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-122;
                                break L3;
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
                      }
                    } else {
                      var3[var4] = (byte)-128;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var2);

            stackIn_71_1 = new StringBuilder().append("pj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L7;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
        }
        return stackIn_68_0;
    }

    final static void a(int param0, d param1, boolean param2) {
        hb var7 = null;
        hb var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            var7 = gf.field_c;
            var8 = var7;
            var8.b(param2, param0);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.b(1, -49152);
            var8.c(param1.field_n, 121);
            var8.c(param1.field_m, 88);
            var8.c(param1.field_p, 62);
            var8.a(-803539344, param1.field_o);
            var8.a(-803539344, param1.field_i);
            var8.a(-803539344, param1.field_j);
            var8.a(-803539344, param1.field_l);
            var8.b(param1.field_f.length, -49152);
            for (var5 = 0; param1.field_f.length > var5; var5++) {
                var7.a(-803539344, param1.field_f[var5]);
            }
            var8.a((byte) -108, var4);
            var8.a(var8.field_h + -var4, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(ug param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_c) {
                param0.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_d = this.field_f.field_d;
            param0.field_c = this.field_f;
            param0.field_c.field_d = param0;
            param0.field_d.field_c = param0;
            if (param1 == 13) {
              break L0;
            } else {
              this.a((byte) -120);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pj.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final ug c(byte param0) {
        ug var2;
        var2 = this.field_f.field_c;
        if (var2 != this.field_f) {
          var2.c(-19822);
          if (param0 != -66) {
            field_h = -1.0866156816482544f;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final ug d(int param0) {
        ug var2;
        if (param0 == 4011) {
          var2 = this.field_f.field_d;
          if (var2 == this.field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        } else {
          field_c = (ta) null;
          var2 = this.field_f.field_d;
          if (var2 == this.field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        }
    }

    final static vk a(byte param0, byte[] param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vk stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (param0 > 9) {
                var2 = new vk(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, cb.field_b);
                gb.a(-63);
                stackIn_7_0 = (vk) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (vk) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("pj.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vk) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 < 37) {
          field_h = 1.3061877489089966f;
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final int b(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = 0;
        ug var3 = this.field_f.field_d;
        while (this.field_f != var3) {
            var3 = var3.field_d;
            var2++;
        }
        int var4 = 61 / ((param0 - 78) / 46);
        return var2;
    }

    final ug a(boolean param0) {
        ug var2;
        var2 = this.field_e;
        if (this.field_f != var2) {
          this.field_e = var2.field_c;
          if (!param0) {
            field_h = -0.11541689187288284f;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final ug d(byte param0) {
        ug var2;
        var2 = this.field_e;
        if (this.field_f == var2) {
          this.field_e = null;
          return null;
        } else {
          if (param0 != 63) {
            return (ug) null;
          } else {
            this.field_e = var2.field_d;
            return var2;
          }
        }
    }

    final ug c(int param0) {
        ug var2;
        var2 = this.field_f.field_c;
        if (var2 != this.field_f) {
          if (param0 != -1) {
            return (ug) null;
          } else {
            this.field_e = var2.field_c;
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 11253) {
          L0: {
            this.field_f = (ug) null;
            if (this.field_f != this.field_f.field_d) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_f != this.field_f.field_d) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final ug a(byte param0) {
        ug var2 = null;
        if (param0 != -117) {
            pj.a(false, 11);
            var2 = this.field_f.field_d;
            if (!(this.field_f != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_d;
            return var2;
        }
        var2 = this.field_f.field_d;
        if (!(this.field_f != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_d;
        return var2;
    }

    private final void a(int param0, pj param1, ug param2) {
        ug var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -16293) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var4 = this.field_f.field_c;
            this.field_f.field_c = param2.field_c;
            param2.field_c.field_d = this.field_f;
            if (param2 != this.field_f) {
              param2.field_c = param1.field_f.field_c;
              param2.field_c.field_d = param2;
              param1.field_f.field_c = var4;
              var4.field_d = param1.field_f;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("pj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final void a(pj param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            this.a(-16293, param0, this.field_f.field_d);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pj.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b(boolean param0) {
        if (!param0) {
            field_d = (String) null;
            return hf.field_b;
        }
        return hf.field_b;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = mk.a(sd.a(37, param1), 480);
              if (param0 >= 78) {
                break L1;
              } else {
                var3 = (byte[]) null;
                pj.a((byte) -73, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("pj.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(boolean param0, int param1) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 31645) {
                break L1;
              } else {
                field_b = (kc) null;
                break L1;
              }
            }
            L2: {
              jk.field_B = jk.field_B + 1;
              if (kc.field_d != 0) {
                L3: {
                  var2_int = -116 + qg.field_c;
                  var3 = ab.field_e + -90;
                  var4 = ee.field_F;
                  var5 = 0;
                  if (!param0) {
                    stackIn_8_0 = kg.field_c;
                    break L3;
                  } else {
                    stackIn_8_0 = fg.field_b;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_8_0;
                  var7 = 0;
                  if (!param0) {
                    break L4;
                  } else {
                    var8 = 9;
                    L5: while (true) {
                      if ((var8 ^ -1) > -1) {
                        break L4;
                      } else {
                        L6: {
                          if (0 == (var6 & 1 << var8)) {
                            var7 += 20;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8--;
                        continue L5;
                      }
                    }
                  }
                }
                var8 = var7 + 10;
                var9 = 0;
                L7: while (true) {
                  L8: {
                    if (-11 >= (var9 ^ -1)) {
                      break L8;
                    } else {
                      L9: {
                        L10: {
                          if (!param0) {
                            break L10;
                          } else {
                            if ((1 << var9 & var6) == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (lf.a(-19864, var2_int, var3, 40, 40, var8, 10)) {
                          ee.field_F = var9;
                          var5 = 1;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                      L11: {
                        L12: {
                          if (!param0) {
                            break L12;
                          } else {
                            if ((var6 & 1 << var9) != 0) {
                              break L12;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var8 += 40;
                        break L11;
                      }
                      var9++;
                      continue L7;
                    }
                  }
                  if (var5 == 0) {
                    break L2;
                  } else {
                    if (ee.field_F != var4) {
                      break L2;
                    } else {
                      jk.field_B = 0;
                      ee.field_F = -1;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L13: {
              if ((uk.field_r ^ -1) <= -1) {
                break L13;
              } else {
                if (fj.field_E == null) {
                  break L13;
                } else {
                  if (!fj.field_E.field_j) {
                    break L13;
                  } else {
                    uk.field_r = fj.field_E.field_e;
                    fg.field_b = fg.field_b & (uk.field_r ^ -1);
                    fj.field_E = null;
                    k.field_i = true;
                    kg.field_c = kg.field_c | uk.field_r;
                    break L13;
                  }
                }
              }
            }
            if (!ok.a(false)) {
              L14: while (true) {
                var11 = (vl) ((Object) em.field_C.d(4011));
                if (var11 == null) {
                  break L0;
                } else {
                  mh.a(var11, param1 + -31645, 4);
                  continue L14;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "pj.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ug param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_c) {
                param1.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_c = this.field_f.field_c;
            param1.field_d = this.field_f;
            param1.field_c.field_d = param1;
            param1.field_d.field_c = param1;
            if (param0 == -8212) {
              break L0;
            } else {
              field_b = (kc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pj.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public pj() {
        this.field_f = new ug();
        this.field_f.field_c = this.field_f;
        this.field_f.field_d = this.field_f;
    }

    static {
        field_b = null;
        field_d = "You have <%0> unread messages!";
    }
}
