/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends af {
    private boolean field_Q;
    private kp field_R;
    private kp field_T;
    static String field_S;
    private kp field_N;
    static tj field_O;
    static String field_U;
    static int field_P;
    static ke field_M;

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, param2, param3, param4);
        var6 = -130 + param4 >> -1014539679;
        if (!((ko) this).field_Q) {
          ((ko) this).field_N.a(param0, var6, 0, param3, 25);
          ((ko) this).field_T.a(param0, var6 - -45, 0, param3, 25);
          ((ko) this).field_R.a(param0, var6 + 90, 0, param3, 40);
          return;
        } else {
          ((ko) this).field_T.a(false, var6, 0, param3, 25);
          ((ko) this).field_N.a(false, 45 + var6, 0, param3, 25);
          ((ko) this).field_R.a(param0, var6 + 90, 0, param3, 40);
          return;
        }
    }

    final int a(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -32410) {
          try {
            stackOut_2_0 = Integer.parseInt(((ko) this).field_N.field_w);
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -117;
        }
        return 0;
    }

    final boolean e(boolean param0) {
        if (null == ((ko) this).field_N.field_w) {
            return true;
        }
        if (0 == ((ko) this).field_N.field_w.length()) {
            return true;
        }
        if (null == ((ko) this).field_T.field_w) {
            return true;
        }
        if (((ko) this).field_T.field_w.length() == 0) {
            return true;
        }
        if (param0) {
            boolean discarded$9 = ((ko) this).e(false);
            if (null != ((ko) this).field_R.field_w) {
                // ifeq L98
            } else {
                return true;
            }
            return false;
        }
        if (null != ((ko) this).field_R.field_w) {
            // ifeq L129
        } else {
            return true;
        }
        return false;
    }

    final void a(int param0, df param1) {
        super.a(param0 + 0, param1);
        if (param0 != -11808) {
          boolean discarded$2 = ((ko) this).e(true);
          ((ko) this).field_N.field_v = (uf) (Object) param1;
          ((ko) this).field_T.field_v = (uf) (Object) param1;
          ((ko) this).field_R.field_v = (uf) (Object) param1;
          return;
        } else {
          ((ko) this).field_N.field_v = (uf) (Object) param1;
          ((ko) this).field_T.field_v = (uf) (Object) param1;
          ((ko) this).field_R.field_v = (uf) (Object) param1;
          return;
        }
    }

    final static boolean e(byte param0) {
        if (param0 > -88) {
            field_M = null;
            return pp.a(ob.e((byte) -124), 0);
        }
        return pp.a(ob.e((byte) -124), 0);
    }

    final static boolean b(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -27) {
          L0: {
            field_P = 61;
            if (param1 != (-param1 & param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1 != (-param1 & param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            boolean discarded$2 = ko.b((byte) 90, -57);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((ko) this).field_R.field_w);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    public static void f(boolean param0) {
        field_U = null;
        field_O = null;
        field_M = null;
        if (param0) {
            field_O = null;
            field_S = null;
            return;
        }
        field_S = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        cr var10 = null;
        tn var11 = null;
        cr var12 = null;
        cr var12_ref = null;
        tn var13 = null;
        cr var14 = null;
        cr var14_ref = null;
        tn var15 = null;
        tn var16 = null;
        cr var17 = null;
        cr var17_ref = null;
        tn var18 = null;
        cr var19 = null;
        cr var21 = null;
        cr var24 = null;
        tn var29 = null;
        cr var35 = null;
        tn var36 = null;
        cr var37 = null;
        cr var37_ref = null;
        tn var38 = null;
        tn var39 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (ce.field_b != ro.field_g.field_d) {
          L0: {
            tc.field_b = tc.field_b + (ro.field_g.field_d + -ce.field_b);
            ce.field_b = ro.field_g.field_d;
            if (ld.field_b > da.field_i) {
              da.field_i = da.field_i + 1;
              break L0;
            } else {
              break L0;
            }
          }
          if (-1 > (da.field_i ^ -1)) {
            kg.c((byte) 77);
            td.field_c.a(0, param0);
            if (lq.field_a == null) {
              var4 = 0;
              L1: while (true) {
                if (-6 >= var4) {
                  if (ea.field_c.field_tb == 0) {
                    var39 = qr.a(ia.field_G, 55, param1, r.field_f);
                    if (var39 == null) {
                      if (param3) {
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          return;
                        } else {
                          field_S = var8;
                          return;
                        }
                      } else {
                        ko.f(true);
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          return;
                        } else {
                          field_S = var8;
                          return;
                        }
                      }
                    } else {
                      nd.a(var39, 32192);
                      if (param3) {
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          return;
                        } else {
                          field_S = var8;
                          return;
                        }
                      } else {
                        ko.f(true);
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          return;
                        } else {
                          field_S = var8;
                          return;
                        }
                      }
                    }
                  } else {
                    up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                    var38 = qr.a(ia.field_G, 55, param1, r.field_f);
                    if (var38 == null) {
                      if (param3) {
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          return;
                        } else {
                          field_S = var8;
                          return;
                        }
                      } else {
                        ko.f(true);
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          return;
                        } else {
                          field_S = var8;
                          return;
                        }
                      }
                    } else {
                      L2: {
                        nd.a(var38, 32192);
                        if (param3) {
                          break L2;
                        } else {
                          ko.f(true);
                          break L2;
                        }
                      }
                      L3: {
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          break L3;
                        } else {
                          field_S = var8;
                          break L3;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var37 = hl.field_q[var4];
                  if (var37 != null) {
                    L4: {
                      if (-1 == var37.field_tb) {
                        break L4;
                      } else {
                        gh.a(var37, (byte) 42, var4);
                        break L4;
                      }
                    }
                    var6 = ab.a(0, var4);
                    w.field_C[var4].field_Db = kb.field_d[var6];
                    mg.field_M[var4].field_S = ba.field_f[var6];
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (!pe.field_r) {
                L5: {
                  lq.field_a = null;
                  var4 = 0;
                  if (-6 >= (var4 ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      var17_ref = hl.field_q[var4];
                      var19 = var17_ref;
                      var21 = var19;
                      var24 = var21;
                      var19 = var17_ref;
                      if (var17_ref != null) {
                        L7: {
                          if (-1 == (var17_ref.field_tb ^ -1)) {
                            break L7;
                          } else {
                            gh.a(var17_ref, (byte) 42, var4);
                            break L7;
                          }
                        }
                        var6 = ab.a(0, var4);
                        w.field_C[var4].field_Db = kb.field_d[var6];
                        mg.field_M[var4].field_S = ba.field_f[var6];
                        break L6;
                      } else {
                        var4++;
                        break L6;
                      }
                    }
                    var4++;
                    var4++;
                    break L5;
                  }
                }
                if (ea.field_c.field_tb != 0) {
                  up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                  var29 = qr.a(ia.field_G, 55, param1, r.field_f);
                  if (var29 != null) {
                    nd.a(var29, 32192);
                    if (!param3) {
                      L8: {
                        ko.f(true);
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          break L8;
                        } else {
                          field_S = var8;
                          break L8;
                        }
                      }
                      return;
                    } else {
                      L9: {
                        var8 = ui.b(-485);
                        if (var8 == null) {
                          break L9;
                        } else {
                          field_S = var8;
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      if (param3) {
                        break L10;
                      } else {
                        ko.f(true);
                        break L10;
                      }
                    }
                    L11: {
                      var8 = ui.b(-485);
                      if (var8 == null) {
                        break L11;
                      } else {
                        field_S = var8;
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    var18 = qr.a(ia.field_G, 55, param1, r.field_f);
                    if (var18 == null) {
                      break L12;
                    } else {
                      nd.a(var18, 32192);
                      break L12;
                    }
                  }
                  L13: {
                    if (param3) {
                      break L13;
                    } else {
                      ko.f(true);
                      break L13;
                    }
                  }
                  L14: {
                    var8 = ui.b(-485);
                    if (var8 == null) {
                      break L14;
                    } else {
                      field_S = var8;
                      break L14;
                    }
                  }
                  return;
                }
              } else {
                boolean discarded$2 = lq.field_a.a(td.field_c.field_C, param0, (byte) 82, td.field_c.field_ob);
                var4 = 0;
                L15: while (true) {
                  if (-6 >= var4) {
                    L16: {
                      if (ea.field_c.field_tb == 0) {
                        break L16;
                      } else {
                        up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                        break L16;
                      }
                    }
                    L17: {
                      var36 = qr.a(ia.field_G, 55, param1, r.field_f);
                      if (var36 == null) {
                        break L17;
                      } else {
                        nd.a(var36, 32192);
                        break L17;
                      }
                    }
                    L18: {
                      if (param3) {
                        break L18;
                      } else {
                        ko.f(true);
                        break L18;
                      }
                    }
                    L19: {
                      var8 = ui.b(-485);
                      if (var8 == null) {
                        break L19;
                      } else {
                        field_S = var8;
                        break L19;
                      }
                    }
                    return;
                  } else {
                    var35 = hl.field_q[var4];
                    var37_ref = var35;
                    var37_ref = var35;
                    if (var35 != null) {
                      L20: {
                        if (-1 == var35.field_tb) {
                          break L20;
                        } else {
                          gh.a(var35, (byte) 42, var4);
                          break L20;
                        }
                      }
                      var6 = ab.a(0, var4);
                      w.field_C[var4].field_Db = kb.field_d[var6];
                      mg.field_M[var4].field_S = ba.field_f[var6];
                      var4++;
                      continue L15;
                    } else {
                      var4++;
                      continue L15;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          L21: {
            if (ld.field_b > da.field_i) {
              da.field_i = da.field_i + 1;
              break L21;
            } else {
              break L21;
            }
          }
          if (-1 > (da.field_i ^ -1)) {
            kg.c((byte) 77);
            td.field_c.a(0, param0);
            if (lq.field_a == null) {
              L22: {
                var4 = 0;
                if (-6 >= (var4 ^ -1)) {
                  break L22;
                } else {
                  L23: {
                    var14 = hl.field_q[var4];
                    var17 = var14;
                    var19 = var17;
                    var21 = var19;
                    var17 = var14;
                    if (var14 != null) {
                      L24: {
                        if (-1 == (var14.field_tb ^ -1)) {
                          break L24;
                        } else {
                          gh.a(var14, (byte) 42, var4);
                          break L24;
                        }
                      }
                      var6 = ab.a(0, var4);
                      w.field_C[var4].field_Db = kb.field_d[var6];
                      mg.field_M[var4].field_S = ba.field_f[var6];
                      break L23;
                    } else {
                      var4++;
                      break L23;
                    }
                  }
                  var4++;
                  var4++;
                  break L22;
                }
              }
              if (ea.field_c.field_tb == 0) {
                var16 = qr.a(ia.field_G, 55, param1, r.field_f);
                if (var16 == null) {
                  if (param3) {
                    var8 = ui.b(-485);
                    if (var8 != null) {
                      field_S = var8;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L25: {
                      ko.f(true);
                      var8 = ui.b(-485);
                      if (var8 == null) {
                        break L25;
                      } else {
                        field_S = var8;
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  L26: {
                    nd.a(var16, 32192);
                    if (param3) {
                      break L26;
                    } else {
                      ko.f(true);
                      break L26;
                    }
                  }
                  L27: {
                    var8 = ui.b(-485);
                    if (var8 == null) {
                      break L27;
                    } else {
                      field_S = var8;
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                L28: {
                  up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                  var15 = qr.a(ia.field_G, 55, param1, r.field_f);
                  if (var15 == null) {
                    break L28;
                  } else {
                    nd.a(var15, 32192);
                    break L28;
                  }
                }
                L29: {
                  if (param3) {
                    break L29;
                  } else {
                    ko.f(true);
                    break L29;
                  }
                }
                L30: {
                  var8 = ui.b(-485);
                  if (var8 == null) {
                    break L30;
                  } else {
                    field_S = var8;
                    break L30;
                  }
                }
                return;
              }
            } else {
              if (!pe.field_r) {
                L31: {
                  lq.field_a = null;
                  var4 = 0;
                  if (-6 >= (var4 ^ -1)) {
                    break L31;
                  } else {
                    L32: {
                      var10 = hl.field_q[var4];
                      var12 = var10;
                      var14_ref = var12;
                      var17 = var14_ref;
                      var12 = var10;
                      if (var10 != null) {
                        L33: {
                          if (-1 == (var10.field_tb ^ -1)) {
                            break L33;
                          } else {
                            gh.a(var10, (byte) 42, var4);
                            break L33;
                          }
                        }
                        var6 = ab.a(0, var4);
                        w.field_C[var4].field_Db = kb.field_d[var6];
                        mg.field_M[var4].field_S = ba.field_f[var6];
                        break L32;
                      } else {
                        var4++;
                        break L32;
                      }
                    }
                    var4++;
                    var4++;
                    var4++;
                    break L31;
                  }
                }
                L34: {
                  if (ea.field_c.field_tb == 0) {
                    break L34;
                  } else {
                    up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                    break L34;
                  }
                }
                L35: {
                  var11 = qr.a(ia.field_G, 55, param1, r.field_f);
                  if (var11 == null) {
                    break L35;
                  } else {
                    nd.a(var11, 32192);
                    break L35;
                  }
                }
                L36: {
                  if (param3) {
                    break L36;
                  } else {
                    ko.f(true);
                    break L36;
                  }
                }
                L37: {
                  var8 = ui.b(-485);
                  if (var8 == null) {
                    break L37;
                  } else {
                    field_S = var8;
                    break L37;
                  }
                }
                return;
              } else {
                L38: {
                  boolean discarded$3 = lq.field_a.a(td.field_c.field_C, param0, (byte) 82, td.field_c.field_ob);
                  var4 = 0;
                  if (-6 >= (var4 ^ -1)) {
                    break L38;
                  } else {
                    L39: {
                      var12_ref = hl.field_q[var4];
                      var14_ref = var12_ref;
                      var17 = var14_ref;
                      var14_ref = var12_ref;
                      if (var12_ref != null) {
                        L40: {
                          if (-1 == (var12_ref.field_tb ^ -1)) {
                            break L40;
                          } else {
                            gh.a(var12_ref, (byte) 42, var4);
                            break L40;
                          }
                        }
                        var6 = ab.a(0, var4);
                        w.field_C[var4].field_Db = kb.field_d[var6];
                        mg.field_M[var4].field_S = ba.field_f[var6];
                        break L39;
                      } else {
                        var4++;
                        break L39;
                      }
                    }
                    var4++;
                    var4++;
                    var4++;
                    break L38;
                  }
                }
                L41: {
                  if (ea.field_c.field_tb == 0) {
                    break L41;
                  } else {
                    up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                    break L41;
                  }
                }
                L42: {
                  var13 = qr.a(ia.field_G, 55, param1, r.field_f);
                  if (var13 == null) {
                    break L42;
                  } else {
                    nd.a(var13, 32192);
                    break L42;
                  }
                }
                L43: {
                  if (param3) {
                    break L43;
                  } else {
                    ko.f(true);
                    break L43;
                  }
                }
                L44: {
                  var8 = ui.b(-485);
                  if (var8 == null) {
                    break L44;
                  } else {
                    field_S = var8;
                    break L44;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    ko(ur param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((ko) this).a(false, param2, param3, param5, param4);
    }

    private ko(ur param0, boolean param1) {
        super(0, 0, 0, 0, (ur) null);
        ((ko) this).field_N = (kp) (Object) new br("", (uf) null, 2);
        ((ko) this).field_T = (kp) (Object) new br("", (uf) null, 2);
        ((ko) this).field_R = (kp) (Object) new br("", (uf) null, 4);
        ((ko) this).field_Q = param1 ? true : false;
        ((ko) this).field_R.field_B = param0;
        ((ko) this).field_T.field_B = param0;
        ((ko) this).field_N.field_B = param0;
        if (!((ko) this).field_Q) {
            ((ko) this).c((byte) -91, (iq) (Object) ((ko) this).field_N);
            ((ko) this).c((byte) -27, (iq) (Object) ((ko) this).field_T);
        } else {
            ((ko) this).c((byte) 79, (iq) (Object) ((ko) this).field_T);
            ((ko) this).c((byte) 82, (iq) (Object) ((ko) this).field_N);
        }
        ((ko) this).c((byte) 77, (iq) (Object) ((ko) this).field_R);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          param2 = param2 + ((ko) this).field_o;
          param3 = param3 + ((ko) this).field_t;
          this.a(param3, -626, param2, (iq) (Object) ((ko) this).field_N, gl.field_m);
          this.a(param3, -626, param2, (iq) (Object) ((ko) this).field_T, ff.field_v);
          this.a(param3, -626, param2, (iq) (Object) ((ko) this).field_R, um.field_C);
          return;
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_P = 123;
            break L0;
          }
        }
        try {
          stackOut_2_0 = -1 + Integer.parseInt(((ko) this).field_T.field_w);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    private final void a(int param0, int param1, int param2, iq param3, String param4) {
        if (param1 != -626) {
          ((ko) this).a(true, -28, 21, -75, 109);
          bl.field_N.c(param4, (param3.field_n >> 481771937) + param2 - -param3.field_o, -5 + (param3.field_t + param0), 16777215, -1);
          return;
        } else {
          bl.field_N.c(param4, (param3.field_n >> 481771937) + param2 - -param3.field_o, -5 + (param3.field_t + param0), 16777215, -1);
          return;
        }
    }

    final String a(boolean param0) {
        String var2 = ((ko) this).field_T.a(param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!((ko) this).field_p)) {
            return ((ko) this).field_q != null ? ((ko) this).field_q : ((ko) this).field_w;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_O = new tj();
    }
}
