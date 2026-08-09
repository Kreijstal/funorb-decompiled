/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vaa {
    static sna field_a;
    static String field_c;
    static int field_d;
    private java.util.zip.Inflater field_e;
    static kv field_b;
    static int field_f;

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var15;
        String var16;
        String var17;
        String var23;
        String var24;
        String var25;
        String var26;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        Object var42;
        Object var43;
        Object var44;
        Object var45;
        Object var46;
        Object var47;
        Object var48;
        CharSequence var49;
        CharSequence var50;
        CharSequence var51;
        CharSequence var52;
        CharSequence var53;
        L0: {
          var42 = null;
          var43 = null;
          var44 = null;
          var45 = null;
          var46 = null;
          var47 = null;
          var48 = null;
          var11 = BachelorFridge.field_y;
          var3 = 1;
          if (qh.field_l) {
            break L0;
          } else {
            if (bi.field_h != null) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (0 != gk.field_d) {
            break L1;
          } else {
            if (null == rv.field_n) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (-3 != (gk.field_d ^ -1)) {
            break L2;
          } else {
            if (hv.a(-19229)) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (param1 == 1) {
          if (84 == gf.field_k) {
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (jm.field_g.length() <= 0) {
                    break L4;
                  } else {
                    L5: {
                      var4_ref_String = jm.field_g.toString();
                      var7 = var4_ref_String;
                      var7 = var4_ref_String;
                      if (!mw.a(var4_ref_String, -1)) {
                        break L5;
                      } else {
                        var13 = (String) null;
                        var12 = (String) null;
                        vf.a((String) null, 0, 125, (String) null, qo.field_b, 2);
                        vf.a((String) null, 0, param1 + 124, (String) null, mi.field_n, 2);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var5 = gk.field_d;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (pw.field_w == null) {
                          break L6;
                        } else {
                          var5 = 1;
                          break L6;
                        }
                      }
                    }
                    if ((af.a(var5, 26291) ^ -1) != -3) {
                      no.a(-1, gk.field_d, param1 + 108, var4_ref_String, bd.field_k, param0);
                      break L4;
                    } else {
                      fk.a(116, var5, param2, 1);
                      no.a(-1, gk.field_d, param1 + 108, var4_ref_String, bd.field_k, param0);
                      break L4;
                    }
                  }
                }
                bea.d(param1 ^ -128);
                if (var11 != 0) {
                  break L3;
                } else {
                  return true;
                }
              }
            }
            if (gk.field_d == 0) {
              return true;
            } else {
              bea.d(-111);
              return true;
            }
          } else {
            if (85 != gf.field_k) {
              var4 = dla.field_j;
              if (hs.a((char) var4, 376)) {
                if (var3 != 0) {
                  if (-81 < (jm.field_g.length() ^ -1)) {
                    L7: {
                      L8: {
                        discarded$0 = jm.field_g.append((char) var4);
                        var5 = 485;
                        var16 = cha.field_l;
                        var23 = var16;
                        var26 = var23;
                        var7 = var26;
                        var26 = var16;
                        var7 = var26;
                        var15 = kba.a(param1 + -128, var16);
                        var23 = var15;
                        var26 = var23;
                        var7 = var26;
                        var26 = var15;
                        var7 = var26;
                        var17 = var15;
                        var23 = var17;
                        var26 = var23;
                        var7 = var26;
                        var26 = var17;
                        var7 = var26;
                        if ((gk.field_d ^ -1) == -3) {
                          break L8;
                        } else {
                          var7 = "";
                          var26 = var7;
                          var23 = var26;
                          var26 = var23;
                          var7 = var26;
                          var7 = var26;
                          var23 = var7;
                          var26 = var23;
                          var7 = var26;
                          if (gk.field_d == 0) {
                            L9: {
                              if (null != pw.field_w) {
                                break L9;
                              } else {
                                if (am.field_O) {
                                  var7 = "[" + cja.field_r + "] ";
                                  break L9;
                                } else {
                                  if (pw.field_w != null) {
                                    L10: {
                                      L11: {
                                        if (!ada.field_k) {
                                          break L11;
                                        } else {
                                          if (null == jc.field_n) {
                                            break L11;
                                          } else {
                                            var7 = "[" + jc.field_n + "] ";
                                            if (var11 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      var7 = "[" + lga.a(true, new String[]{pw.field_w.field_Jb}, fq.field_r) + "] ";
                                      break L10;
                                    }
                                    L12: {
                                      var33 = var7 + var17 + ": ";
                                      var5 = var5 - dc.field_r.a(var33);
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        L13: {
                                          var51 = (CharSequence) ((Object) bd.field_k);
                                          var34 = lga.a(true, new String[]{lu.a(var51, 7995)}, iia.field_q);
                                          var35 = lga.a(true, new String[]{var15}, wla.field_n);
                                          var9 = dc.field_r.a(var34);
                                          var10 = dc.field_r.a(var35);
                                          if (var10 < var9) {
                                            break L13;
                                          } else {
                                            var5 = var5 - var10;
                                            break L13;
                                          }
                                        }
                                        var5 = var5 - var9;
                                        break L12;
                                      }
                                    }
                                    if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                      sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                                      return true;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L14: {
                                      var30 = var7 + var17 + ": ";
                                      var7 = var30;
                                      var7 = var30;
                                      var5 = var5 - dc.field_r.a(var30);
                                      if (var11 == 0) {
                                        break L14;
                                      } else {
                                        L15: {
                                          var50 = (CharSequence) ((Object) bd.field_k);
                                          var31 = lga.a(true, new String[]{lu.a(var50, 7995)}, iia.field_q);
                                          var7 = var31;
                                          var7 = var31;
                                          var32 = lga.a(true, new String[]{var15}, wla.field_n);
                                          var7 = var32;
                                          var7 = var32;
                                          var9 = dc.field_r.a(var31);
                                          var10 = dc.field_r.a(var32);
                                          if (var10 < var9) {
                                            break L15;
                                          } else {
                                            var5 = var5 - var10;
                                            break L15;
                                          }
                                        }
                                        var5 = var5 - var9;
                                        break L14;
                                      }
                                    }
                                    L16: {
                                      if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                                        break L16;
                                      } else {
                                        sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                                        break L16;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                            }
                            if (pw.field_w != null) {
                              L17: {
                                L18: {
                                  if (!ada.field_k) {
                                    break L18;
                                  } else {
                                    if (null == jc.field_n) {
                                      break L18;
                                    } else {
                                      var7 = "[" + jc.field_n + "] ";
                                      if (var11 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                var7 = "[" + lga.a(true, new String[]{pw.field_w.field_Jb}, fq.field_r) + "] ";
                                break L17;
                              }
                              var39 = var7 + var17 + ": ";
                              var5 = var5 - dc.field_r.a(var39);
                              if (var11 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              L19: {
                                var36 = var7 + var17 + ": ";
                                var7 = var36;
                                var7 = var36;
                                var5 = var5 - dc.field_r.a(var36);
                                if (var11 == 0) {
                                  break L19;
                                } else {
                                  L20: {
                                    var52 = (CharSequence) ((Object) bd.field_k);
                                    var37 = lga.a(true, new String[]{lu.a(var52, 7995)}, iia.field_q);
                                    var7 = var37;
                                    var7 = var37;
                                    var38 = lga.a(true, new String[]{var15}, wla.field_n);
                                    var7 = var38;
                                    var7 = var38;
                                    var9 = dc.field_r.a(var37);
                                    var10 = dc.field_r.a(var38);
                                    if (var10 < var9) {
                                      break L20;
                                    } else {
                                      var5 = var5 - var10;
                                      break L20;
                                    }
                                  }
                                  var5 = var5 - var9;
                                  break L19;
                                }
                              }
                              if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                                return true;
                              } else {
                                return true;
                              }
                            }
                          } else {
                            L21: {
                              var23 = var7 + var17 + ": ";
                              var26 = var23;
                              var7 = var26;
                              var26 = var23;
                              var7 = var26;
                              var5 = var5 - dc.field_r.a(var23);
                              if (var11 == 0) {
                                break L21;
                              } else {
                                L22: {
                                  var49 = (CharSequence) ((Object) bd.field_k);
                                  var24 = lga.a(true, new String[]{lu.a(var49, 7995)}, iia.field_q);
                                  var26 = var24;
                                  var7 = var26;
                                  var26 = var24;
                                  var7 = var26;
                                  var25 = lga.a(true, new String[]{var15}, wla.field_n);
                                  var26 = var25;
                                  var7 = var26;
                                  var26 = var25;
                                  var7 = var26;
                                  var26 = var7;
                                  var7 = var26;
                                  var9 = dc.field_r.a(var24);
                                  var10 = dc.field_r.a(var25);
                                  if (var10 < var9) {
                                    break L22;
                                  } else {
                                    var5 = var5 - var10;
                                    break L22;
                                  }
                                }
                                var5 = var5 - var9;
                                break L21;
                              }
                            }
                            if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                              return true;
                            } else {
                              sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                              return true;
                            }
                          }
                        }
                      }
                      L23: {
                        var53 = (CharSequence) ((Object) bd.field_k);
                        var40 = lga.a(true, new String[]{lu.a(var53, 7995)}, iia.field_q);
                        var41 = lga.a(true, new String[]{var15}, wla.field_n);
                        var9 = dc.field_r.a(var40);
                        var10 = dc.field_r.a(var41);
                        if (var10 < var9) {
                          break L23;
                        } else {
                          var5 = var5 - var10;
                          if (var11 == 0) {
                            break L7;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var5 = var5 - var9;
                      break L7;
                    }
                    if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                      return true;
                    } else {
                      sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (var3 != 0) {
                if (0 >= jm.field_g.length()) {
                  return true;
                } else {
                  sw.a(jm.field_g, param1 ^ 5, jm.field_g.length() - 1, ' ');
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    public vaa() {
        this(-1, 1000000, 1000000);
    }

    private vaa(int param0, int param1, int param2) {
    }

    final static String a(String param0, int param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackIn_3_0 = lga.a(true, new String[]{param0}, lca.field_r);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 2) {
                stackIn_7_0 = lga.a(true, new String[]{param0}, il.field_e);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != 3) {
                  if (param1 != 4) {
                    if ((param1 ^ -1) != -6) {
                      L1: {
                        if (param2 == -1) {
                          break L1;
                        } else {
                          field_a = (sna) null;
                          break L1;
                        }
                      }
                      if (param1 == 6) {
                        stackIn_22_0 = lga.a(true, new String[]{param0}, fr.field_s);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param1 != 7) {
                          if (param1 != 8) {
                            if (-12 != (param1 ^ -1)) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackIn_38_0 = lga.a(true, new String[]{param0}, kc.field_a);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackIn_34_0 = lga.a(true, new String[]{param0}, rr.field_x);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_31_0 = lga.a(true, new String[]{param0}, ek.field_o);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_28_0 = lga.a(true, new String[]{param0}, ru.field_j);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_25_0 = lga.a(true, new String[]{param0}, hia.field_i);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_16_0 = lga.a(true, new String[]{param0}, gw.field_c);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = lga.a(true, new String[]{param0}, tn.field_b);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = lga.a(true, new String[]{param0}, wia.field_c);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("vaa.A(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L2;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
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
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_31_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_34_0;
                          } else {
                            return stackIn_38_0;
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
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
    }

    final void a(lu param0, byte[] param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (31 != param0.field_h[param0.field_g]) {
                    break L1;
                  } else {
                    if ((param0.field_h[param0.field_g - -1] ^ -1) != 116) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_e == null) {
                          this.field_e = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_e.setInput(param0.field_h, 10 + param0.field_g, param0.field_h.length + -8 + (-param0.field_g + param2));
                          this.field_e.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_e.reset();
                        throw new RuntimeException("");
                      }
                      this.field_e.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (runtimeException);

                stackIn_14_1 = new StringBuilder().append("vaa.C(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Solicitation";
        field_f = -1;
    }
}
