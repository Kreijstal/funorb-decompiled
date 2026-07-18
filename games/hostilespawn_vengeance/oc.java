/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int field_e;
    static bd field_d;
    static byte[][][] field_h;
    private int field_f;
    int field_g;
    private int field_a;
    static bd field_c;
    private int field_b;

    public final boolean equals(Object param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!(param0 instanceof oc)) {
                  break L2;
                } else {
                  if (!((oc) this).a((oc) param0, -124)) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("oc.equals(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              if (param0 == -9575) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            field_h = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "oc.D(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((oc) this).field_g = param2;
              if (param1 == 8360) {
                break L1;
              } else {
                ((oc) this).field_f = -3;
                break L1;
              }
            }
            ((oc) this).field_e = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var4, "oc.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        en var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        vb var5 = null;
        String var5_ref = null;
        String var6 = null;
        vb var6_ref = null;
        String var7 = null;
        vb var7_ref = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        vb stackIn_58_0 = null;
        vb stackIn_65_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        vb stackOut_57_0 = null;
        vb stackOut_63_0 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = sc.field_g;
              if (param0 > 25) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var2 = var1_ref.l(32270);
            if (var2 == 0) {
              L2: {
                if (null != n.field_t) {
                  break L2;
                } else {
                  n.field_t = new cb(128);
                  vd.field_A = 0;
                  break L2;
                }
              }
              L3: {
                if (var1_ref.l(32270) != 1) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_14_0;
                var4_ref_String = var1_ref.o(32);
                if (var3_int != 0) {
                  String discarded$3 = var1_ref.o(32);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var5 = oa.a((byte) 117, var4_ref_String);
                var6 = var1_ref.o(32);
                var7 = mf.a(false, (CharSequence) (Object) var4_ref_String);
                if (null != var7) {
                  break L5;
                } else {
                  var7 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (null == var5) {
                  var5 = oa.a((byte) 90, var6);
                  if (null == var5) {
                    break L6;
                  } else {
                    n.field_t.a((long)var7.hashCode(), (dk) (Object) var5, 320);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (var5 == null) {
                  var5 = new vb();
                  n.field_t.a((long)var7.hashCode(), (dk) (Object) var5, 320);
                  int fieldTemp$4 = vd.field_A;
                  vd.field_A = vd.field_A + 1;
                  var5.field_Gb = fieldTemp$4;
                  uj.field_o.a((am) (Object) var5, 121);
                  break L7;
                } else {
                  break L7;
                }
              }
              var5.field_Ib = var4_ref_String;
              return;
            } else {
              if (var2 != 1) {
                if (2 != var2) {
                  if (var2 == 3) {
                    L8: {
                      if (2 != bj.field_b) {
                        break L8;
                      } else {
                        bj.field_b = 1;
                        break L8;
                      }
                    }
                    return;
                  } else {
                    if (var2 == 4) {
                      bj.field_b = 1;
                      var3 = var1_ref.o(32);
                      eg.field_w = var3.intern();
                      var4 = var1_ref.l(32270);
                      jf.a(-1631279870, var4);
                      return;
                    } else {
                      ic.a((byte) -122, "F1: " + gf.a((byte) -123), (Throwable) null);
                      le.c((byte) 51);
                      break L0;
                    }
                  }
                } else {
                  L9: {
                    if (bj.field_b != 1) {
                      break L9;
                    } else {
                      bj.field_b = 2;
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  if (null != kj.field_g) {
                    break L10;
                  } else {
                    kj.field_g = new cb(128);
                    rc.field_d = 0;
                    break L10;
                  }
                }
                L11: {
                  var3 = var1_ref.o(32);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1_ref.o(32);
                  var5_ref = var1_ref.o(32);
                  var6_ref = pb.b(var4_ref_String, (byte) -122);
                  if (var6_ref == null) {
                    var6_ref = pb.b(var5_ref, (byte) -120);
                    if (var6_ref != null) {
                      kj.field_g.a((long)mf.a(false, (CharSequence) (Object) var4_ref_String).hashCode(), (dk) (Object) var6_ref, 320);
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (null != var6_ref) {
                    break L13;
                  } else {
                    var6_ref = new vb();
                    kj.field_g.a((long)mf.a(false, (CharSequence) (Object) var4_ref_String).hashCode(), (dk) (Object) var6_ref, 320);
                    int fieldTemp$5 = rc.field_d;
                    rc.field_d = rc.field_d + 1;
                    var6_ref.field_Gb = fieldTemp$5;
                    gm.field_d.a((am) (Object) var6_ref, 103);
                    break L13;
                  }
                }
                L14: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var6_ref.field_Ib = var4_ref_String;
                var6_ref.field_Mb = var3;
                var6_ref.b(-23);
                var7_ref = (vb) (Object) gm.field_d.g(-97);
                L15: while (true) {
                  L16: {
                    L17: {
                      L18: {
                        L19: {
                          if (var7_ref == null) {
                            break L19;
                          } else {
                            stackOut_57_0 = (vb) var7_ref;
                            stackIn_65_0 = stackOut_57_0;
                            stackIn_58_0 = stackOut_57_0;
                            if (var8 != 0) {
                              break L18;
                            } else {
                              if (!td.a(stackIn_58_0, true, var6_ref)) {
                                break L19;
                              } else {
                                var7_ref = (vb) (Object) gm.field_d.a(12684);
                                if (var8 == 0) {
                                  continue L15;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7_ref) {
                          break L17;
                        } else {
                          stackOut_63_0 = (vb) var6_ref;
                          stackIn_65_0 = stackOut_63_0;
                          break L18;
                        }
                      }
                      uf.a((am) (Object) stackIn_65_0, (am) (Object) var7_ref, (byte) -59);
                      if (var8 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                    gm.field_d.a((am) (Object) var6_ref, 115);
                    break L16;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "oc.I(" + param0 + ')');
        }
    }

    final void a(byte param0, oc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((oc) this).field_e = param1.field_e;
              if (param0 == 46) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            ((oc) this).field_g = param1.field_g;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oc.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackOut_3_0 = pf.a(param0, 127, false);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("oc.J(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -4) {
              L1: {
                L2: {
                  if (((oc) this).field_e != ((oc) this).field_b) {
                    break L2;
                  } else {
                    if (((oc) this).field_g == ((oc) this).field_f) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  ((oc) this).field_a = ((oc) this).field_e + ln.field_a.field_d * ((oc) this).field_g;
                  if (((oc) this).field_a >= 0) {
                    break L3;
                  } else {
                    ((oc) this).field_a = 0;
                    break L3;
                  }
                }
                L4: {
                  if (~((oc) this).field_a > ~ln.field_a.field_n) {
                    break L4;
                  } else {
                    ((oc) this).field_a = ln.field_a.field_n + -1;
                    break L4;
                  }
                }
                ((oc) this).field_b = ((oc) this).field_e;
                ((oc) this).field_f = ((oc) this).field_g;
                break L1;
              }
              stackOut_16_0 = ((oc) this).field_a;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_1_0 = -11;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "oc.F(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final static String a(int param0, double param1) {
        RuntimeException var3 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (ul.field_E == null) {
                ul.field_E = new java.text.DecimalFormat("0.00");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                String discarded$2 = oc.a(47, -0.5022005601801744);
                break L2;
              }
            }
            stackOut_7_0 = ul.field_E.format(param1);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "oc.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final double a(int param0) {
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        double stackOut_3_0 = 0.0;
        try {
          L0: {
            L1: {
              var2_double = Math.atan2((double)(-((oc) this).field_e), (double)(-((oc) this).field_g));
              if (param0 == 25124) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            var2_double = var2_double * 128.0 / 3.141592653589793;
            stackOut_3_0 = var2_double;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "oc.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(oc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 65 / ((-64 - param1) / 55);
                if (((oc) this).field_e != param0.field_e) {
                  break L2;
                } else {
                  if (((oc) this).field_g != param0.field_g) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("oc.B(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final String toString() {
        RuntimeException var1 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = "(" + ((oc) this).field_e + "," + ((oc) this).field_g + ")";
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "oc.toString()");
        }
        return stackIn_1_0;
    }

    public oc() {
        ((oc) this).field_b = -1;
        ((oc) this).field_f = -1;
        try {
            ((oc) this).field_e = 0;
            ((oc) this).field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "oc.<init>()");
        }
    }

    final void b(oc param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 24161) {
              ((oc) this).field_g = ((oc) this).field_g - param0.field_g;
              ((oc) this).field_e = ((oc) this).field_e - param0.field_e;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("oc.C(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    oc(oc param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((oc) this).field_b = -1;
        ((oc) this).field_f = -1;
        try {
          L0: {
            ((oc) this).field_g = param0.field_g;
            ((oc) this).field_e = param0.field_e;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oc.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    oc(int param0, int param1) {
        ((oc) this).field_b = -1;
        ((oc) this).field_f = -1;
        try {
            ((oc) this).field_g = param1;
            ((oc) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "oc.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new byte[][][]{new byte[10][], new byte[10][]};
    }
}
