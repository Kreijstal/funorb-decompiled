/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lob implements dja {
    static int field_b;
    static String field_a;
    static llb[] field_c;

    public final tv a(byte param0) {
        lua stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 13 / ((-64 - param0) / 50);
            stackIn_1_0 = new lua();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "lob.A(" + param0 + ')');
        }
        return (tv) ((Object) stackIn_1_0);
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        vu stackIn_66_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        faa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        vu var6 = null;
        String var7 = null;
        vu var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var1 = qga.field_b;
              if (param0) {
                break L1;
              } else {
                field_b = -108;
                break L1;
              }
            }
            var2 = var1.e((byte) -91);
            if (var2 == 0) {
              L2: {
                if (om.field_c != null) {
                  break L2;
                } else {
                  om.field_c = new pr(128);
                  mq.field_k = 0;
                  break L2;
                }
              }
              L3: {
                if (-2 != (var1.e((byte) -101) ^ -1)) {
                  stackIn_14_0 = 0;
                  break L3;
                } else {
                  stackIn_14_0 = 1;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1.a(-1);
                  if (var3_int != 0) {
                    break L5;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var1.a(-1);
                break L4;
              }
              L6: {
                var6 = nf.a(var4_ref_String, false);
                var7 = var1.a(-1);
                var8 = jwa.a(false, (CharSequence) ((Object) var4_ref_String));
                if (null != var8) {
                  break L6;
                } else {
                  var8 = var4_ref_String;
                  break L6;
                }
              }
              L7: {
                if (null != var6) {
                  break L7;
                } else {
                  var6 = nf.a(var7, false);
                  if (null == var6) {
                    break L7;
                  } else {
                    om.field_c.a(var6, (byte) -124, (long)var8.hashCode());
                    break L7;
                  }
                }
              }
              L8: {
                if (var6 == null) {
                  var6 = new vu();
                  om.field_c.a(var6, (byte) -106, (long)var8.hashCode());
                  fieldTemp$0 = mq.field_k;
                  mq.field_k = mq.field_k + 1;
                  var6.field_yb = fieldTemp$0;
                  st.field_o.b(-10258, var6);
                  break L8;
                } else {
                  break L8;
                }
              }
              var6.field_vb = var7;
              var6.field_Fb = var4_ref_String;
              var6.field_Cb = var5;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (-3 != (var2 ^ -1)) {
                  if (-4 == (var2 ^ -1)) {
                    L9: {
                      if (iwa.field_b != 2) {
                        break L9;
                      } else {
                        iwa.field_b = 1;
                        break L9;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var2 != 4) {
                      gna.a((Throwable) null, "F1: " + hm.e(-13514), 0);
                      ifb.l(-125);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      iwa.field_b = 1;
                      var3 = var1.a(-1);
                      kbb.field_q = ((String) (var3)).intern();
                      var4 = var1.e((byte) -126);
                      rma.b(var4, (byte) 71);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L10: {
                    if (-2 != (iwa.field_b ^ -1)) {
                      break L10;
                    } else {
                      iwa.field_b = 2;
                      break L10;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L11: {
                  if (ae.field_f == null) {
                    ae.field_f = new pr(128);
                    vob.field_p = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var3 = var1.a(-1);
                  if (!((String) (var3)).equals("")) {
                    break L12;
                  } else {
                    var3 = null;
                    break L12;
                  }
                }
                L13: {
                  var4_ref_String = var1.a(-1);
                  var5 = var1.a(-1);
                  var6 = di.a(var4_ref_String, 0);
                  if (var6 == null) {
                    var6 = di.a(var5, 0);
                    if (null != var6) {
                      ae.field_f.a(var6, (byte) -31, (long)jwa.a(false, (CharSequence) ((Object) var4_ref_String)).hashCode());
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var6 == null) {
                    var6 = new vu();
                    ae.field_f.a(var6, (byte) -112, (long)jwa.a(false, (CharSequence) ((Object) var4_ref_String)).hashCode());
                    fieldTemp$1 = vob.field_p;
                    vob.field_p = vob.field_p + 1;
                    var6.field_yb = fieldTemp$1;
                    mr.field_M.b(-10258, var6);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var3 != null) {
                    var3 = ((String) (var3)).intern();
                    break L15;
                  } else {
                    break L15;
                  }
                }
                var6.field_Fb = var4_ref_String;
                var6.field_vb = var5;
                var6.field_Ab = (String) (var3);
                var6.b(-3846);
                var7_ref = (vu) ((Object) mr.field_M.d(0));
                L16: while (true) {
                  L17: {
                    L18: {
                      L19: {
                        if (var7_ref == null) {
                          break L19;
                        } else {
                          stackIn_66_0 = (vu) (var7_ref);

                          if (var9 != 0) {
                            break L18;
                          } else {
                            if (!qob.a(stackIn_66_0, 7569, var6)) {
                              break L19;
                            } else {
                              var7_ref = (vu) ((Object) mr.field_M.a((byte) 78));
                              if (var9 == 0) {
                                continue L16;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (null != var7_ref) {
                          break L20;
                        } else {
                          mr.field_M.b(-10258, var6);
                          if (var9 == 0) {
                            break L17;
                          } else {
                            break L20;
                          }
                        }
                      }
                      stackIn_66_0 = (vu) (var6);
                      break L18;
                    }
                    al.a(stackIn_66_0, var7_ref, 2);
                    break L17;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "lob.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((hab.field_i ^ -1) > (param4 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param5 >= lua.field_c) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (ob.field_j <= param2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param2 = ob.field_j;
                        var6_int = 0;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param2 ^ -1) >= (mt.field_o ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_int = 0;
                        param2 = mt.field_o;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6_int = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (ob.field_j <= param0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param0 = ob.field_j;
                        var7 = 0;
                        if (var10 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (mt.field_o < param0) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = 1;
                        if (var10 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param0 = mt.field_o;
                        var7 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param4 ^ -1) <= (lua.field_c ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param4 = lua.field_c;
                        if (var10 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        incrementValue$0 = param4;
                        param4++;
                        ww.a(param1, param0, rba.field_b[incrementValue$0], (byte) 75, param2);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param5 <= hab.field_i) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param5 = hab.field_i;
                        if (var10 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        incrementValue$1 = param5;
                        param5--;
                        ww.a(param1, param0, rba.field_b[incrementValue$1], (byte) 75, param2);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var6_int == 0) {
                            statePc = 40;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var7 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8 = param4;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((param5 ^ -1) > (var8 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = rba.field_b[var8];
                        var9[param0] = param1;
                        var9[param2] = param1;
                        var8++;
                        if (var10 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var10 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var10 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6_int == 0) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8 = param4;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((param5 ^ -1) > (var8 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        rba.field_b[var8][param2] = param1;
                        var8++;
                        if (var10 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var10 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var10 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var7 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8 = param4;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((var8 ^ -1) < (param5 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        rba.field_b[var8][param0] = param1;
                        var8++;
                        if (var10 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var10 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param3 == 256) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        field_a = (String) null;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw rta.a((Throwable) ((Object) var6), "lob.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -59 % ((param0 - -31) / 40);
            stackIn_1_0 = ua.a(true, param1, true, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("lob.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
        return stackIn_1_0;
    }

    public final tv[] a(int param0, int param1) {
        RuntimeException var3 = null;
        tv[] stackIn_2_0 = null;
        lua[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 11995) {
              stackIn_4_0 = new lua[param1];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (tv[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "lob.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (tv[]) ((Object) stackIn_4_0);
        }
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_a = null;
              if (param0 > 88) {
                break L1;
              } else {
                lob.a(-76, (CharSequence) null);
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "lob.E(" + param0 + ')');
        }
    }

    static {
        field_b = 256;
    }
}
