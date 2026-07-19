/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ro implements he {
    private boolean field_Ab;
    private kd field_xb;
    static at field_Bb;
    private boolean field_yb;
    static je field_Cb;
    static String field_zb;

    final boolean a(byte param0) {
        wd var2 = null;
        wd var3 = null;
        if (param0 == -1) {
          if (this.field_L) {
            if (!this.field_Ab) {
              var2 = ki.a(-61440);
              if (var2 == null) {
                return super.a((byte) -1);
              } else {
                this.a(false, (byte) -53, var2);
                return super.a((byte) -1);
              }
            } else {
              return super.a((byte) -1);
            }
          } else {
            return super.a((byte) -1);
          }
        } else {
          var3 = (wd) null;
          this.a(true, (byte) 54, (wd) null);
          if (this.field_L) {
            if (this.field_Ab) {
              return super.a((byte) -1);
            } else {
              L0: {
                var2 = ki.a(-61440);
                if (var2 != null) {
                  this.a(false, (byte) -53, var2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return super.a((byte) -1);
            }
          } else {
            return super.a((byte) -1);
          }
        }
    }

    public static void j(byte param0) {
        field_Cb = null;
        field_Bb = null;
        field_zb = null;
        int var1 = 18 / ((-35 - param0) / 35);
    }

    final void k(byte param0) {
        this.a(true, (byte) -103, il.a(-1, 248, bp.field_m));
        if (param0 >= -81) {
            this.field_Ab = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -6) {
          if (param6 < param4) {
            if (param2 <= param4) {
              if (param6 >= param2) {
                vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                if (var9 == 0) {
                  return;
                } else {
                  vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                  return;
                }
              } else {
                vp.a(param2, param6, param3, param4, param7, param5, qn.field_d, param1, (byte) 20);
                if (var9 == 0) {
                  return;
                } else {
                  vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                  vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                  return;
                }
              }
            } else {
              vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
              return;
            }
          } else {
            if (param2 > param6) {
              vp.a(param6, param4, param7, param2, param1, param5, qn.field_d, param3, (byte) 20);
              if (var9 != 0) {
                if (param2 <= param4) {
                  if (param6 >= param2) {
                    vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                    if (var9 != 0) {
                      vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    vp.a(param2, param6, param3, param4, param7, param5, qn.field_d, param1, (byte) 20);
                    vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                    vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                    return;
                  }
                } else {
                  vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (param4 >= param2) {
                vp.a(param4, param2, param1, param6, param3, param5, qn.field_d, param7, (byte) 20);
                if (var9 != 0) {
                  vp.a(param6, param4, param7, param2, param1, param5, qn.field_d, param3, (byte) 20);
                  if (var9 != 0) {
                    if (param2 <= param4) {
                      if (param6 >= param2) {
                        vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                        if (var9 != 0) {
                          vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        vp.a(param2, param6, param3, param4, param7, param5, qn.field_d, param1, (byte) 20);
                        if (var9 != 0) {
                          vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                          vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                vp.a(param2, param4, param1, param6, param7, param5, qn.field_d, param3, (byte) 20);
                if (var9 != 0) {
                  vp.a(param4, param2, param1, param6, param3, param5, qn.field_d, param7, (byte) 20);
                  if (var9 == 0) {
                    return;
                  } else {
                    L0: {
                      vp.a(param6, param4, param7, param2, param1, param5, qn.field_d, param3, (byte) 20);
                      if (param2 > param4) {
                        vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                        break L0;
                      } else {
                        L1: {
                          if (param6 >= param2) {
                            break L1;
                          } else {
                            vp.a(param2, param6, param3, param4, param7, param5, qn.field_d, param1, (byte) 20);
                            break L1;
                          }
                        }
                        vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                        if (var9 == 0) {
                          break L0;
                        } else {
                          vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
                          break L0;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (this.field_yb) {
            td.a(false, true, 21);
            return;
        }
        try {
            bt.b(param1 ^ param1);
            this.b(true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "oe.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, byte param1, wd param2) {
        fw discarded$2 = null;
        fw discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        ad var5 = null;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Ab = true;
                if (!param2.field_a) {
                  break L2;
                } else {
                  var4_ref = eq.field_i;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null == param2.field_c) {
                  break L3;
                } else {
                  var4_ref = oc.field_Ob;
                  if (null == this.field_xb) {
                    break L1;
                  } else {
                    this.field_xb.a((byte) -116);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var4_ref = param2.field_i;
              if (param2.field_d == 248) {
                L4: {
                  if (!param0) {
                    no.b(false);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_ref = bp.field_m;
                this.field_yb = true;
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              if (param1 < -2) {
                break L5;
              } else {
                this.field_xb = (kd) null;
                break L5;
              }
            }
            L6: {
              L7: {
                var5 = new ad((ro) (this), bv.field_t, var4_ref);
                if (param2.field_a) {
                  break L7;
                } else {
                  L8: {
                    L9: {
                      if (!this.field_yb) {
                        break L9;
                      } else {
                        discarded$2 = var5.a(ro.field_kb, (qo) (this), (byte) 110);
                        if (var6 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((param2.field_d ^ -1) != -6) {
                      var5.a(fj.field_a, -1, 1);
                      break L8;
                    } else {
                      var5.a(me.field_d, 11, 1);
                      var5.a(dt.field_c, 17, 1);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        var5.a(fj.field_a, -1, 1);
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (param2.field_d == 3) {
                      break L10;
                    } else {
                      if (6 != param2.field_d) {
                        break L6;
                      } else {
                        var5.a(ag.field_O, 9, 1);
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var5.a(te.field_m, 7, 1);
                  if (var6 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (param2.field_h) {
                this.a(new qd((oe) (this)), (byte) -81);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                discarded$3 = var5.a(ro.field_kb, (qo) (this), (byte) -61);
                break L6;
              }
            }
            this.a(var5, (byte) -110);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var4);
            stackOut_37_1 = new StringBuilder().append("oe.U(").append(param0).append(',').append(param1).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    oe(gk param0, kd param1) {
        super(param0, bv.field_t, wm.field_d, false, false);
        try {
            this.field_xb = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static int c(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(byte[] param0, int param1) {
        if (!(param1 <= param0[0])) {
            return;
        }
        try {
            wp.field_E = param0[1];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "oe.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_Bb = new at();
        field_zb = "Withdraw invitation to <%0> to join this game";
    }
}
