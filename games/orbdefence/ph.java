/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ph extends tf {
    static int[] field_x;
    private boolean field_z;
    private int field_y;
    private int field_p;
    private int field_A;
    private static boolean field_v;
    private boolean field_r;
    static int field_u;
    private int field_o;
    String field_n;
    private int field_s;
    private int field_q;
    private long field_w;
    private boolean field_t;

    private final void c(int param0, boolean param1) {
        vk.field_w[16] = true;
        vk.field_w[7] = true;
        vk.field_w[3] = true;
        vk.field_w[param0] = true;
        vk.field_w[8] = param1;
        vk.field_w[0] = true;
        vk.field_w[17] = true;
    }

    private final void i(int param0) {
        String var2 = fb.c(-128);
        lh.a(uj.b((byte) -120), var2, false);
        int var3 = -120 / ((54 - param0) / 43);
    }

    private final void k(int param0) {
        if (param0 != 3) {
            this.field_r = true;
        }
        vk.field_w[2] = true;
    }

    final void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        if (param1 <= 41) {
            String var10 = (String) null;
            this.a(114, (String) null, (byte) 126);
        }
        wj.field_m = this.field_A;
        wg.a(wj.field_m, (byte) -108);
        ec.a(this.field_n, 5000, this.field_t, this.field_s, param0, param7, this.field_q, 5000, this.field_p, this.field_w, wj.field_m, wc.field_c, this.field_y, 49);
        nc.a(wj.field_m, this.field_y, param7, this.field_n, (byte) 93, this.field_q, this.field_s, wc.field_c, this.field_p);
        k.a(0);
        mj.field_i = de.a((byte) -112);
        l.a(tf.field_f, 59);
        pj.field_p = param3;
        cb.field_e = param5;
        ve.field_Q = param6;
        oc.field_V = param4;
        nl.field_b = param2;
        this.f((byte) 56);
        tl.b(103);
    }

    private final void l(int param0) {
        int var2 = cd.field_t.b((byte) 90);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        if (param0 >= -108) {
            this.i(-72);
        }
        int var4 = tf.field_c + -1;
        byte[] var5 = new byte[var4];
        cd.field_t.a(-29, 0, var5, var4);
        ke.a(bk.a(var5, -12465), var3 != 0, (byte) -94, uj.b((byte) -120));
    }

    final void a(int param0, String param1, byte param2) {
        try {
            int var4_int = 68 % ((-44 - param2) / 62);
            this.a(480, 73, 640, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ph.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            Boolean var11 = null;
            mg var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = OrbDefence.field_D ? 1 : 0;
            var4 = tl.a(of.field_K, wj.field_m, param2, (byte) -67);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (-2 != (var4 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var5_int = ik.a(lm.c(32018), fb.b((byte) -128), param1 ^ -1);
                    if ((var5_int ^ -1) == 0) {
                      break L1;
                    } else {
                      i.a(-35, kk.field_Y, vd.field_e, var5_int);
                      vd.field_e = null;
                      kk.field_Y = null;
                      break L1;
                    }
                  }
                  var11 = k.b((byte) 126);
                  if (var11 != null) {
                    sd.a(var11.booleanValue(), 63);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if ((var4 ^ -1) != -3) {
                  break L2;
                } else {
                  var5_int = kg.a(am.b(-28), uh.b(param1 ^ -5), this.field_o, na.a((byte) -105), qh.a(-42), 200, jf.j(989270945));
                  if (-1 == var5_int) {
                    break L2;
                  } else {
                    fa.a(-111, var5_int, vd.field_e, kk.field_Y);
                    kk.field_Y = null;
                    vd.field_e = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 == -1) {
                  break L3;
                } else {
                  this.field_w = 13L;
                  break L3;
                }
              }
              L4: {
                if (-4 != (var4 ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if (o.field_j == -1) {
                      break L5;
                    } else {
                      if (-1 == (o.field_j ^ -1)) {
                        break L5;
                      } else {
                        o.field_j = -1;
                        hh.c(param1 ^ -24061);
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (param0) {
                      break L6;
                    } else {
                      L7: {
                        var5_int = vc.a(this.field_z, this.field_o, param1 ^ 77, am.b(param1 ^ 60), false, uh.b(4));
                        if ((var5_int ^ -1) != 0) {
                          L8: {
                            if (var5_int != 0) {
                              break L8;
                            } else {
                              el.field_F = p.field_c;
                              id.a(false);
                              d.field_k = false;
                              hi.field_k = 10;
                              if (var8 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          se.a(kk.field_Y, (byte) -115, var5_int);
                          kk.field_Y = null;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  fa.field_a = false;
                  break L4;
                }
              }
              L9: {
                if ((var4 ^ -1) == -5) {
                  L10: {
                    if (jc.field_b) {
                      break L10;
                    } else {
                      hi.field_k = 10;
                      d.field_k = true;
                      if (var8 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ad.a(0, uj.b((byte) -120));
                  break L9;
                } else {
                  break L9;
                }
              }
              L11: {
                if (-6 != (var4 ^ -1)) {
                  break L11;
                } else {
                  ja.a(param1 ^ 104, uj.b((byte) -120));
                  break L11;
                }
              }
              L12: {
                if (6 != var4) {
                  break L12;
                } else {
                  if (!pa.field_b) {
                    break L12;
                  } else {
                    hi.field_k = 10;
                    break L12;
                  }
                }
              }
              L13: {
                if ((var4 ^ -1) != -8) {
                  break L13;
                } else {
                  tf.a(uj.b((byte) -120), -6407);
                  break L13;
                }
              }
              L14: {
                if ((var4 ^ -1) != -9) {
                  break L14;
                } else {
                  ad.a(param1 ^ -1, uj.b((byte) -120));
                  break L14;
                }
              }
              L15: {
                if ((var4 ^ -1) != -10) {
                  break L15;
                } else {
                  ka.a(uj.b((byte) -120), 1);
                  break L15;
                }
              }
              L16: {
                if (var4 == 10) {
                  uk.field_b.i(17, 89);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var4 != 11) {
                  break L17;
                } else {
                  bm.a(param1 + 12980, uj.b((byte) -120));
                  break L17;
                }
              }
              L18: {
                if (var4 != 12) {
                  break L18;
                } else {
                  jj.a(da.a(-103), (byte) 53, uj.b((byte) -120));
                  break L18;
                }
              }
              L19: {
                if (-14 == (var4 ^ -1)) {
                  try {
                    L20: {
                      L21: {
                        if (null == ml.field_e) {
                          ml.field_e = new uj(wc.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (!ml.field_e.b(param1 + -3)) {
                          break L22;
                        } else {
                          L23: {
                            L24: {
                              var12 = ml.field_e.a(5);
                              if (var12 == null) {
                                break L24;
                              } else {
                                var7 = tj.a(var12.field_i, 0, 0, var12.field_j);
                                li.a(param1 + 0, var7);
                                if (var8 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var9 = (String) null;
                            li.a(-1, (String) null);
                            break L23;
                          }
                          ml.field_e = null;
                          break L22;
                        }
                      }
                      break L20;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L25: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      pe.a((byte) -13, (Throwable) ((Object) var5), "S1");
                      li.a(param1 + 0, (String) null);
                      ml.field_e = null;
                      break L25;
                    }
                  }
                  break L19;
                } else {
                  break L19;
                }
              }
              L26: {
                if (var4 != 15) {
                  break L26;
                } else {
                  hi.field_k = 10;
                  break L26;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 != 17) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void n(int param0) {
        vk.field_w[4] = true;
        if (param0 != 18495) {
            this.field_z = false;
        }
    }

    private final void m(int param0) {
        if (param0 > -61) {
            this.field_y = 25;
        }
        vk.field_w[1] = true;
    }

    final static void b(boolean param0) {
        int var1 = 0;
        L0: {
          L1: {
            if (ck.field_f < 224) {
              break L1;
            } else {
              ce.a(256, (byte) -118);
              if (!OrbDefence.field_D) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var1 = ck.field_f % 32;
          ce.a(-var1 + ck.field_f + 32, (byte) -127);
          break L0;
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            field_x = (int[]) null;
            break L2;
          }
        }
    }

    final void e(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        og var3 = null;
        int var4 = 0;
        int stackIn_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          var2 = ab.field_l;
          if ((var2 ^ -1) <= -65) {
            break L0;
          } else {
            if (vk.field_w[var2]) {
              L1: {
                if (param0 <= -108) {
                  break L1;
                } else {
                  discarded$1 = this.a(false, 60, true);
                  break L1;
                }
              }
              if (var2 != 0) {
                L2: {
                  if (1 != var2) {
                    break L2;
                  } else {
                    tc.a(-51);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
                L3: {
                  if (2 == var2) {
                    break L3;
                  } else {
                    L4: {
                      if (-4 == (var2 ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          if (var2 != 4) {
                            break L5;
                          } else {
                            hb.b(554553416);
                            if (var4 != 0) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        L6: {
                          if ((var2 ^ -1) != -6) {
                            break L6;
                          } else {
                            pc.f(false);
                            if (var4 != 0) {
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                        L7: {
                          if ((var2 ^ -1) == -7) {
                            break L7;
                          } else {
                            L8: {
                              if ((var2 ^ -1) != -8) {
                                break L8;
                              } else {
                                this.i(-22);
                                if (var4 != 0) {
                                  break L8;
                                } else {
                                  return;
                                }
                              }
                            }
                            L9: {
                              if (-9 != (var2 ^ -1)) {
                                break L9;
                              } else {
                                fb.a(cd.field_t, tf.field_c, -31, wc.field_c);
                                if (var4 != 0) {
                                  break L9;
                                } else {
                                  return;
                                }
                              }
                            }
                            L10: {
                              if (16 != var2) {
                                break L10;
                              } else {
                                gb.b(-122);
                                if (var4 != 0) {
                                  break L10;
                                } else {
                                  return;
                                }
                              }
                            }
                            L11: {
                              if (11 == var2) {
                                break L11;
                              } else {
                                if (12 == var2) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (-14 == (var2 ^ -1)) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if ((var2 ^ -1) == -18) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (var2 != 18) {
                                              break L14;
                                            } else {
                                              ek.c(117);
                                              if (var4 != 0) {
                                                break L14;
                                              } else {
                                                return;
                                              }
                                            }
                                          }
                                          pe.a((byte) -13, (Throwable) null, "MGS1: " + sj.b(true));
                                          th.a(104);
                                          if (var4 != 0) {
                                            break L13;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      this.l(-119);
                                      if (var4 != 0) {
                                        break L12;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                  vc.b(-48);
                                  if (var4 != 0) {
                                    break L11;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                            L15: {
                              if (-13 != (var2 ^ -1)) {
                                stackOut_54_0 = 0;
                                stackIn_55_0 = stackOut_54_0;
                                break L15;
                              } else {
                                stackOut_53_0 = 1;
                                stackIn_55_0 = stackOut_53_0;
                                break L15;
                              }
                            }
                            var3 = oe.a(stackIn_55_0 != 0, (byte) -53);
                            fm.a(var3, (byte) 126);
                            if (var4 != 0) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        ad.a(90);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    lb.c(122);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                uk.a((byte) 68);
                if (var4 == 0) {
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        pe.a((byte) -13, (Throwable) null, "MGS2: " + sj.b(true));
        th.a(102);
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (!this.c(1)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_n = this.getCodeBase().getHost();
                      var6_ref2 = this.field_n.toLowerCase();
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_7_0 = this;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L2;
                        } else {
                          stackOut_5_0 = this;
                          stackIn_6_0 = stackOut_5_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                  L4: {
                    ((ph) (this)).field_z = stackIn_8_1 != 0;
                    this.field_q = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_p = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_y = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_s = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_w = Long.parseLong(this.getParameter("instanceid"));
                    this.field_t = this.getParameter("member").equals("yes");
                    var9 = 66 % ((param1 - -49) / 55);
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_A = Integer.parseInt(var8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_A ^ -1) > -6) {
                      break L6;
                    } else {
                      this.field_A = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.getParameter("affid");
                    if (var10 == null) {
                      break L7;
                    } else {
                      this.field_o = Integer.parseInt(var10);
                      break L7;
                    }
                  }
                  field_v = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(-10291, this.field_s, param4, param2, param0, param3, 32);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var11 = (String) null;
                pe.a((byte) -13, (Throwable) ((Object) var6), (String) null);
                this.a(110, "crash");
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6_ref);
            stackOut_21_1 = new StringBuilder().append("ph.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final int j(int param0) {
        int var2 = 0;
        if (param0 != 7) {
          return -15;
        } else {
          L0: {
            L1: {
              var2 = this.h(-10125);
              if (-1 == (var2 ^ -1)) {
                break L1;
              } else {
                if (-2 != (var2 ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!vk.field_w[1]) {
                break L2;
              } else {
                ij.a((byte) -34, 2);
                break L2;
              }
            }
            L3: {
              if (!vk.field_w[2]) {
                break L3;
              } else {
                qj.a(3, 7287);
                break L3;
              }
            }
            L4: {
              if (vk.field_w[3]) {
                am.a(4, 113);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!vk.field_w[4]) {
                break L5;
              } else {
                ql.a(5, (byte) 21);
                break L5;
              }
            }
            L6: {
              if (!vk.field_w[5]) {
                break L6;
              } else {
                ik.a((byte) -74, 6);
                break L6;
              }
            }
            L7: {
              if (vk.field_w[6]) {
                nh.a(param0 + 15961, 7);
                break L7;
              } else {
                break L7;
              }
            }
            if (!vk.field_w[8]) {
              break L0;
            } else {
              vk.a(0);
              break L0;
            }
          }
          return var2;
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref_java_awt_Dimension = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        String stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        String stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        String stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        String stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        String stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        String stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_145_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        String stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        String stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        String stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        String stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        String stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (null != ne.field_b) {
            L1: {
              if (mg.field_k != null) {
                break L1;
              } else {
                var6 = ob.l(4);
                var4_ref_java_awt_Dimension = var6.getSize();
                ne.field_b.a(14592, var4_ref_java_awt_Dimension.height, var4_ref_java_awt_Dimension.width);
                break L1;
              }
            }
            ne.field_b.d((byte) 112);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          ab.a(-128);
          mg.d((byte) -107);
          if (eg.c((byte) -126)) {
            break L2;
          } else {
            if (11 == hi.field_k) {
              break L2;
            } else {
              cf.a((byte) 109);
              break L2;
            }
          }
        }
        L3: {
          if (null != mj.field_i) {
            of.field_K = mj.field_i.a(1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!p.a(23236)) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * ok.a((byte) 84);
              if (this.field_r) {
                break L5;
              } else {
                if ((var3 ^ -1) <= (f.c((byte) 8) ^ -1)) {
                  break L4;
                } else {
                  if (var3 >= pb.a(-16733)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_r = false;
            th.a(111);
            md.b((byte) 42);
            se.a(oe.field_m, (byte) -79, 2);
            ke.a(-92);
            fa.field_a = true;
            lm.field_c = 15000L + ji.b(-103);
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == o.field_j) {
              break L7;
            } else {
              if (o.field_j != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != o.field_j) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            o.field_j = bh.a((byte) 117);
            if (var3 == 0) {
              break L9;
            } else {
              if ((o.field_j ^ -1) != -1) {
                break L9;
              } else {
                if (-12 != (hi.field_k ^ -1)) {
                  break L9;
                } else {
                  if (!sg.c(true)) {
                    id.a(false);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == o.field_j) {
            break L6;
          } else {
            if (o.field_j != 0) {
              lm.field_c = ji.b(123) - -15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (-1 == o.field_j) {
            break L10;
          } else {
            if (o.field_j != 0) {
              L11: {
                if (10 <= vh.field_n) {
                  break L11;
                } else {
                  L12: {
                    if (-4 != (o.field_j ^ -1)) {
                      break L12;
                    } else {
                      this.a(101, "js5crc");
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (-5 != (o.field_j ^ -1)) {
                      break L13;
                    } else {
                      this.a(125, "js5io");
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if ((o.field_j ^ -1) != -3) {
                      break L14;
                    } else {
                      this.a(124, "js5connect_full");
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (5 != o.field_j) {
                      break L15;
                    } else {
                      this.a(99, "outofdate");
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L15;
                      }
                    }
                  }
                  this.a(119, "js5connect");
                  if (var5 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              if ((hi.field_k ^ -1) > -11) {
                break L10;
              } else {
                L16: {
                  L17: {
                    md.b((byte) -86);
                    if (o.field_j != 3) {
                      break L17;
                    } else {
                      se.a(o.field_i, (byte) -127, 256);
                      if (var5 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((o.field_j ^ -1) == -5) {
                      break L18;
                    } else {
                      L19: {
                        if (o.field_j == 2) {
                          break L19;
                        } else {
                          L20: {
                            if (-6 != (o.field_j ^ -1)) {
                              break L20;
                            } else {
                              se.a(nf.field_k, (byte) -82, 5);
                              if (var5 == 0) {
                                break L16;
                              } else {
                                break L20;
                              }
                            }
                          }
                          se.a(pl.field_h, (byte) 63, 256);
                          if (var5 == 0) {
                            break L16;
                          } else {
                            break L19;
                          }
                        }
                      }
                      se.a(ql.field_a, (byte) -118, 256);
                      if (var5 == 0) {
                        break L16;
                      } else {
                        break L18;
                      }
                    }
                  }
                  se.a(cg.field_h, (byte) 109, 256);
                  break L16;
                }
                fa.field_a = true;
                break L10;
              }
            } else {
              break L10;
            }
          }
        }
        L21: {
          L22: {
            L23: {
              if (-1 == o.field_j) {
                break L23;
              } else {
                if (o.field_j != 0) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
            if (sg.c(true)) {
              break L22;
            } else {
              break L21;
            }
          }
          if (ji.b(-125) >= lm.field_c) {
            fa.field_a = false;
            if ((o.field_j ^ -1) == 0) {
              break L21;
            } else {
              if (0 == o.field_j) {
                break L21;
              } else {
                o.field_j = -1;
                hh.c(24060);
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L24: {
          if (0 != o.field_j) {
            break L24;
          } else {
            if (!sg.c(true)) {
              mf.field_d = false;
              break L24;
            } else {
              break L24;
            }
          }
        }
        L25: {
          if (vh.field_n == 0) {
            if (!lg.a((byte) -2)) {
              break L25;
            } else {
              vh.field_n = 1;
              break L25;
            }
          } else {
            break L25;
          }
        }
        L26: {
          if (vh.field_n == 1) {
            L27: {
              if (-1 != (wj.field_m ^ -1)) {
                lf.field_a = qk.a(cb.field_e, -32585);
                break L27;
              } else {
                break L27;
              }
            }
            og.field_g = hm.a(48, true, false, oc.field_V, 1);
            am.field_b = hm.a(48, true, false, ve.field_Q, 1);
            wb.field_b = hm.a(48, true, false, nl.field_b, 1);
            j.field_b = og.field_g;
            vh.field_n = 2;
            tf.field_d = am.field_b;
            break L26;
          } else {
            break L26;
          }
        }
        L28: {
          if (vh.field_n == 2) {
            L29: {
              if (null != lf.field_a) {
                if (!lf.field_a.b(-1)) {
                  break L29;
                } else {
                  L30: {
                    if (!lf.field_a.c((byte) -84, "")) {
                      break L30;
                    } else {
                      if (lf.field_a.b((byte) -61, "")) {
                        lm.a((byte) 116, lf.field_a);
                        lf.field_a = null;
                        vd.a(42);
                        if (var5 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      } else {
                        break L29;
                      }
                    }
                  }
                  lf.field_a = null;
                  break L29;
                }
              } else {
                break L29;
              }
            }
            if (null == lf.field_a) {
              vh.field_n = 3;
              break L28;
            } else {
              break L28;
            }
          } else {
            break L28;
          }
        }
        L31: {
          if (vh.field_n != 3) {
            break L31;
          } else {
            if (!dk.a(1, og.field_g, wb.field_b, am.field_b)) {
              break L31;
            } else {
              if (tk.a(wb.field_b, 26810)) {
                L32: {
                  L33: {
                    ak.b(22176);
                    ek.a(-96);
                    tl.field_e = cj.field_c;
                    pa.field_b = false;
                    gj.a(am.field_b, (byte) 33, wb.field_b, jc.field_b, og.field_g);
                    if (gj.field_k) {
                      break L33;
                    } else {
                      if (null != lg.field_b) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L34: {
                    stackOut_110_0 = lg.field_b;
                    stackOut_110_1 = 33;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    if (gj.field_k) {
                      stackOut_112_0 = (String) ((Object) stackIn_112_0);
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      break L34;
                    } else {
                      stackOut_111_0 = (String) ((Object) stackIn_111_0);
                      stackOut_111_1 = stackIn_111_1;
                      stackOut_111_2 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      stackIn_113_2 = stackOut_111_2;
                      break L34;
                    }
                  }
                  L35: {
                    stackOut_113_0 = (String) ((Object) stackIn_113_0);
                    stackOut_113_1 = stackIn_113_1;
                    stackOut_113_2 = stackIn_113_2;
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    stackIn_115_2 = stackOut_113_2;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    stackIn_114_2 = stackOut_113_2;
                    if (gj.field_k) {
                      stackOut_115_0 = (String) ((Object) stackIn_115_0);
                      stackOut_115_1 = stackIn_115_1;
                      stackOut_115_2 = stackIn_115_2;
                      stackOut_115_3 = 0;
                      stackIn_116_0 = stackOut_115_0;
                      stackIn_116_1 = stackOut_115_1;
                      stackIn_116_2 = stackOut_115_2;
                      stackIn_116_3 = stackOut_115_3;
                      break L35;
                    } else {
                      stackOut_114_0 = (String) ((Object) stackIn_114_0);
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = stackIn_114_2;
                      stackOut_114_3 = 1;
                      stackIn_116_0 = stackOut_114_0;
                      stackIn_116_1 = stackOut_114_1;
                      stackIn_116_2 = stackOut_114_2;
                      stackIn_116_3 = stackOut_114_3;
                      break L35;
                    }
                  }
                  hm.a(stackIn_116_0, (byte) stackIn_116_1, stackIn_116_2 != 0, stackIn_116_3 != 0);
                  break L32;
                }
                L36: {
                  if (field_v) {
                    kj.j(4);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (null == de.field_a) {
                    de.field_a = fb.c(false);
                    cf.field_d = te.j(2);
                    break L37;
                  } else {
                    break L37;
                  }
                }
                hf.a(de.field_a, wb.field_b, cf.field_d, 1000);
                og.field_g = null;
                wb.field_b = null;
                am.field_b = null;
                pj.a(127, (java.applet.Applet) (this));
                vd.a(99);
                vh.field_n = 10;
                break L31;
              } else {
                break L31;
              }
            }
          }
        }
        L38: {
          if ((vh.field_n ^ -1) != -11) {
            break L38;
          } else {
            L39: {
              if (-1 == (wj.field_m ^ -1)) {
                break L39;
              } else {
                eg.field_x = qk.a(pj.field_p, -32585);
                break L39;
              }
            }
            vh.field_n = 11;
            break L38;
          }
        }
        L40: {
          if (vh.field_n != 11) {
            break L40;
          } else {
            L41: {
              L42: {
                if (null == eg.field_x) {
                  break L42;
                } else {
                  if (!eg.field_x.b(-1)) {
                    break L41;
                  } else {
                    if (!eg.field_x.c(7715)) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
              }
              gi.field_b = true;
              vh.field_n = 12;
              if (var5 == 0) {
                break L40;
              } else {
                break L41;
              }
            }
            j.a(0.0f, ql.a(eg.field_x, mi.field_e, de.field_b, (byte) 32), (byte) 105);
            break L40;
          }
        }
        L43: {
          if (-13 != (vh.field_n ^ -1)) {
            break L43;
          } else {
            if (gi.field_b) {
              break L43;
            } else {
              vh.field_n = 13;
              break L43;
            }
          }
        }
        L44: {
          var3 = 81 % ((55 - param0) / 43);
          if ((vh.field_n ^ -1) != -14) {
            break L44;
          } else {
            L45: {
              var4 = 1;
              if (sd.field_b != null) {
                L46: {
                  if (!sd.field_b.a(false)) {
                    stackOut_144_0 = 0;
                    stackIn_145_0 = stackOut_144_0;
                    break L46;
                  } else {
                    stackOut_143_0 = 1;
                    stackIn_145_0 = stackOut_143_0;
                    break L46;
                  }
                }
                var4 = stackIn_145_0;
                j.a(sd.field_b.field_h, sd.field_b.field_d, (byte) 106);
                break L45;
              } else {
                break L45;
              }
            }
            if (var4 == 0) {
              break L44;
            } else {
              vh.field_n = 20;
              break L44;
            }
          }
        }
        L47: {
          if (param1) {
            break L47;
          } else {
            if (!vc.field_a) {
              break L47;
            } else {
              hl.a(tf.field_f, 118);
              this.e(99);
              l.a(tf.field_f, -123);
              break L47;
            }
          }
        }
        L48: {
          if (vk.field_w[8]) {
            od.a(192);
            break L48;
          } else {
            break L48;
          }
        }
    }

    private final void f(int param0) {
        int discarded$0 = 0;
        if (param0 != -2) {
            discarded$0 = this.h(122);
        }
        vk.field_w[5] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(18, param3);
        if (param1) {
            this.m(-109);
        }
        if (param2) {
            this.k(3);
        }
        if (!(!param4)) {
            this.n(18495);
        }
        if (!(!param0)) {
            this.f(-2);
        }
    }

    private final void f(byte param0) {
        tg.field_b[13] = -1;
        tg.field_b[10] = -1;
        tg.field_b[8] = -2;
        tg.field_b[6] = -2;
        tg.field_b[1] = 16;
        tg.field_b[7] = -1;
        tg.field_b[5] = -1;
        tg.field_b[11] = -1;
        tg.field_b[17] = -1;
        if (param0 <= 26) {
            this.l(-120);
        }
        tg.field_b[2] = -2;
        tg.field_b[12] = -1;
        tg.field_b[3] = -1;
        tg.field_b[18] = 1;
        tg.field_b[9] = -1;
        tg.field_b[16] = -1;
        tg.field_b[4] = -1;
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
            return -18;
        }
        return this.a(true, -1, param0);
    }

    final void c(boolean param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.field_y = 12;
            break L0;
          }
        }
        L1: {
          L2: {
            if (fe.c((byte) -123)) {
              break L2;
            } else {
              if (10 > vh.field_n) {
                break L1;
              } else {
                L3: {
                  if (rf.l(-108)) {
                    break L3;
                  } else {
                    id.b(false);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (hi.field_k != 0) {
                    break L4;
                  } else {
                    discarded$4 = this.a(false, -1, false);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                vi.a(false, of.field_K);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L5: {
            stackOut_12_0 = this;
            stackOut_12_1 = 0;
            stackOut_12_2 = -1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_14_2 = stackOut_12_2;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            stackIn_13_2 = stackOut_12_2;
            if (mg.field_k == null) {
              stackOut_14_0 = this;
              stackOut_14_1 = stackIn_14_1;
              stackOut_14_2 = stackIn_14_2;
              stackOut_14_3 = 0;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              stackIn_15_3 = stackOut_14_3;
              break L5;
            } else {
              stackOut_13_0 = this;
              stackOut_13_1 = stackIn_13_1;
              stackOut_13_2 = stackIn_13_2;
              stackOut_13_3 = 1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              stackIn_15_3 = stackOut_13_3;
              break L5;
            }
          }
          discarded$5 = this.a(stackIn_15_1 != 0, stackIn_15_2, stackIn_15_3 != 0);
          break L1;
        }
    }

    private final int h(int param0) {
        int var2 = 0;
        if (this.field_h) {
          return -1;
        } else {
          if (sg.c(true)) {
            if (!fa.field_a) {
              var2 = vc.a(this.field_z, this.field_o, -114, am.b(-70), true, uh.b(4));
              if ((var2 ^ -1) != 0) {
                if (var2 != 0) {
                  if (1 == var2) {
                    L0: {
                      if (hi.field_k != 11) {
                        break L0;
                      } else {
                        if (-1 == (o.field_j ^ -1)) {
                          id.a(false);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return var2;
                  } else {
                    L1: {
                      if (!pc.field_Y) {
                        this.a(111, "reconnect");
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      md.b((byte) -111);
                      se.a(kk.field_Y, (byte) -81, var2);
                      fa.field_a = true;
                      if (param0 == -10125) {
                        break L2;
                      } else {
                        this.n(-13);
                        break L2;
                      }
                    }
                    lm.field_c = ji.b(param0 ^ 10203) + 15000L;
                    return var2;
                  }
                } else {
                  L3: {
                    if (hi.field_k != 11) {
                      break L3;
                    } else {
                      if (-1 == (o.field_j ^ -1)) {
                        id.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return var2;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    public static void g(int param0) {
        int var1 = -4 % ((param0 - 1) / 49);
        field_x = null;
    }

    protected ph() {
    }

    static {
        field_x = new int[8192];
    }
}
