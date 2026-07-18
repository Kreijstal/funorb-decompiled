/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lob implements dja {
    static int field_b;
    static String field_a;
    static llb[] field_c;

    public final tv a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lua stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        lua stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 13 / ((-64 - param0) / 50);
            stackOut_0_0 = new lua();
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "lob.A(" + param0 + ')');
        }
        return (tv) (Object) stackIn_1_0;
    }

    final static void a() {
        RuntimeException var1 = null;
        faa var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        vu var6 = null;
        String var7 = null;
        vu var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_14_0 = 0;
        vu stackIn_56_0 = null;
        vu stackIn_66_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        vu stackOut_55_0 = null;
        vu stackOut_64_0 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var1_ref = qga.field_b;
            var2 = var1_ref.e((byte) -91);
            if (var2 == 0) {
              L1: {
                if (om.field_c != null) {
                  break L1;
                } else {
                  om.field_c = new pr(128);
                  mq.field_k = 0;
                  break L1;
                }
              }
              L2: {
                if (var1_ref.e((byte) -101) != 1) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1_ref.a(-1);
                  if (var3_int != 0) {
                    break L4;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var1_ref.a(-1);
                break L3;
              }
              L5: {
                int discarded$4 = 0;
                var6 = nf.a(var4_ref_String);
                var7 = var1_ref.a(-1);
                var8 = jwa.a(false, (CharSequence) (Object) var4_ref_String);
                if (null != var8) {
                  break L5;
                } else {
                  var8 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (null != var6) {
                  break L6;
                } else {
                  int discarded$5 = 0;
                  var6 = nf.a(var7);
                  if (null == var6) {
                    break L6;
                  } else {
                    om.field_c.a((fh) (Object) var6, (byte) -124, (long)var8.hashCode());
                    break L6;
                  }
                }
              }
              L7: {
                if (var6 == null) {
                  var6 = new vu();
                  om.field_c.a((fh) (Object) var6, (byte) -106, (long)var8.hashCode());
                  int fieldTemp$6 = mq.field_k;
                  mq.field_k = mq.field_k + 1;
                  var6.field_yb = fieldTemp$6;
                  st.field_o.b(-10258, (ksa) (Object) var6);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_vb = var7;
              var6.field_Fb = var4_ref_String;
              var6.field_Cb = var5;
              return;
            } else {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (var2 == 3) {
                    L8: {
                      if (iwa.field_b != 2) {
                        break L8;
                      } else {
                        iwa.field_b = 1;
                        break L8;
                      }
                    }
                    return;
                  } else {
                    if (var2 != 4) {
                      gna.a((Throwable) null, "F1: " + hm.e(-13514), 0);
                      ifb.l(-125);
                      break L0;
                    } else {
                      iwa.field_b = 1;
                      var3 = var1_ref.a(-1);
                      kbb.field_q = var3.intern();
                      var4 = var1_ref.e((byte) -126);
                      rma.b(var4, (byte) 71);
                      return;
                    }
                  }
                } else {
                  L9: {
                    if (iwa.field_b != 1) {
                      break L9;
                    } else {
                      iwa.field_b = 2;
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  if (ae.field_f == null) {
                    ae.field_f = new pr(128);
                    vob.field_p = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var3 = var1_ref.a(-1);
                  if (!var3.equals((Object) (Object) "")) {
                    break L11;
                  } else {
                    var3 = null;
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1_ref.a(-1);
                  var5 = var1_ref.a(-1);
                  var6 = di.a(var4_ref_String, 0);
                  if (var6 == null) {
                    var6 = di.a(var5, 0);
                    if (null != var6) {
                      ae.field_f.a((fh) (Object) var6, (byte) -31, (long)jwa.a(false, (CharSequence) (Object) var4_ref_String).hashCode());
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var6 == null) {
                    var6 = new vu();
                    ae.field_f.a((fh) (Object) var6, (byte) -112, (long)jwa.a(false, (CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$7 = vob.field_p;
                    vob.field_p = vob.field_p + 1;
                    var6.field_yb = fieldTemp$7;
                    mr.field_M.b(-10258, (ksa) (Object) var6);
                    break L13;
                  } else {
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
                var6.field_Fb = var4_ref_String;
                var6.field_vb = var5;
                var6.field_Ab = var3;
                var6.b(-3846);
                var7_ref = (vu) (Object) mr.field_M.d(0);
                L15: while (true) {
                  L16: {
                    L17: {
                      L18: {
                        if (var7_ref == null) {
                          break L18;
                        } else {
                          stackOut_55_0 = (vu) var7_ref;
                          stackIn_66_0 = stackOut_55_0;
                          stackIn_56_0 = stackOut_55_0;
                          if (var9 != 0) {
                            break L17;
                          } else {
                            if (!qob.a(stackIn_56_0, 7569, var6)) {
                              break L18;
                            } else {
                              var7_ref = (vu) (Object) mr.field_M.a((byte) 78);
                              if (var9 == 0) {
                                continue L15;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (null != var7_ref) {
                          break L19;
                        } else {
                          mr.field_M.b(-10258, (ksa) (Object) var6);
                          if (var9 == 0) {
                            break L16;
                          } else {
                            break L19;
                          }
                        }
                      }
                      stackOut_64_0 = (vu) var6;
                      stackIn_66_0 = stackOut_64_0;
                      break L17;
                    }
                    al.a((ksa) (Object) stackIn_66_0, (ksa) (Object) var7_ref, 2);
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
          throw rta.a((Throwable) (Object) var1, "lob.D(" + true + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (~hab.field_i > ~param4) {
                  break L2;
                } else {
                  if (param5 >= lua.field_c) {
                    L3: {
                      L4: {
                        if (ob.field_j <= param2) {
                          break L4;
                        } else {
                          param2 = ob.field_j;
                          var6_int = 0;
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (~param2 >= ~mt.field_o) {
                          break L5;
                        } else {
                          var6_int = 0;
                          param2 = mt.field_o;
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6_int = 1;
                      break L3;
                    }
                    L6: {
                      L7: {
                        if (ob.field_j <= param0) {
                          break L7;
                        } else {
                          param0 = ob.field_j;
                          var7 = 0;
                          if (var10 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (mt.field_o < param0) {
                          break L8;
                        } else {
                          var7 = 1;
                          if (var10 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param0 = mt.field_o;
                      var7 = 0;
                      break L6;
                    }
                    L9: {
                      L10: {
                        if (~param4 <= ~lua.field_c) {
                          break L10;
                        } else {
                          param4 = lua.field_c;
                          if (var10 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      int incrementValue$2 = param4;
                      param4++;
                      ww.a(param1, param0, rba.field_b[incrementValue$2], (byte) 75, param2);
                      break L9;
                    }
                    L11: {
                      L12: {
                        if (param5 <= hab.field_i) {
                          break L12;
                        } else {
                          param5 = hab.field_i;
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      int incrementValue$3 = param5;
                      param5--;
                      ww.a(param1, param0, rba.field_b[incrementValue$3], (byte) 75, param2);
                      break L11;
                    }
                    L13: {
                      if (var6_int == 0) {
                        break L13;
                      } else {
                        if (var7 == 0) {
                          break L13;
                        } else {
                          var8 = param4;
                          L14: while (true) {
                            L15: {
                              if (~param5 > ~var8) {
                                break L15;
                              } else {
                                var9 = rba.field_b[var8];
                                var9[param0] = param1;
                                var9[param2] = param1;
                                var8++;
                                if (var10 != 0) {
                                  break L2;
                                } else {
                                  if (var10 == 0) {
                                    continue L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (var6_int == 0) {
                        break L16;
                      } else {
                        var8 = param4;
                        L17: while (true) {
                          L18: {
                            if (~param5 > ~var8) {
                              break L18;
                            } else {
                              rba.field_b[var8][param2] = param1;
                              var8++;
                              if (var10 != 0) {
                                break L2;
                              } else {
                                if (var10 == 0) {
                                  continue L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (var7 != 0) {
                      var8 = param4;
                      L19: while (true) {
                        if (~var8 < ~param5) {
                          break L2;
                        } else {
                          rba.field_b[var8][param0] = param1;
                          var8++;
                          if (var10 != 0) {
                            break L1;
                          } else {
                            if (var10 == 0) {
                              continue L19;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6, "lob.F(" + param0 + ',' + param1 + ',' + param2 + ',' + 256 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -59 % ((param0 - -31) / 40);
            stackOut_0_0 = ua.a(true, param1, true, 10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lob.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
        return stackIn_1_0;
    }

    public final tv[] a(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        lua[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        lua[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 11995) {
              stackOut_3_0 = new lua[param1];
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tv[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "lob.B(" + param0 + ',' + param1 + ')');
        }
        return (tv[]) (Object) stackIn_4_0;
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_a = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "lob.E(" + 102 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 256;
    }
}
