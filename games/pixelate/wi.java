/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_c;
    static String field_n;
    static String field_g;
    private long field_l;
    ak field_o;
    pi field_b;
    String field_h;
    private String field_i;
    int field_m;
    static vj field_d;
    static bb field_a;
    static String field_e;
    private int field_k;
    private int[] field_j;
    static int[] field_f;

    public static void c(byte param0) {
        if (param0 <= 52) {
          return;
        } else {
          field_e = null;
          field_f = null;
          field_n = null;
          field_a = null;
          field_c = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    private final String a(byte param0) {
        String var2 = null;
        if (this.field_i != null) {
            var2 = this.field_i;
        } else {
            var2 = this.field_h;
        }
        if (param0 <= 7) {
            return (String) null;
        }
        return var2;
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        im var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (param2 == -3) {
              L1: {
                if (this.field_h == null) {
                  break L1;
                } else {
                  L2: {
                    if (hn.field_f != this.field_l) {
                      break L2;
                    } else {
                      if (2 != param0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (2 == gk.field_db) {
                    L3: {
                      var7 = this.a((byte) 114);
                      var4_ref = var7;
                      var5 = re.a(this.field_h, -1);
                      var6 = i.a(-640, this.field_h) ? 1 : 0;
                      if (var5 != null) {
                        break L3;
                      } else {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          this.field_b.a(sd.a(ji.field_d, 52, new String[]{var7}), (byte) -106, 4);
                          this.field_b.a(sd.a(ff.field_e, 18, new String[]{var7}), (byte) -53, 6);
                          if (param1 == null) {
                            break L3;
                          } else {
                            if ((param0 ^ -1) == -3) {
                              break L3;
                            } else {
                              if (!ln.field_q) {
                                this.field_j = param1;
                                this.field_b.a(sd.a(nl.field_d, 61, new String[]{var7}), (byte) -80, 19);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        L5: {
                          if (ul.a(57, this.field_h)) {
                            break L5;
                          } else {
                            if (ln.field_q) {
                              break L5;
                            } else {
                              L6: {
                                if (lh.field_g) {
                                  break L6;
                                } else {
                                  this.field_b.a(sd.a(nf.field_e, 105, new String[]{var7}), (byte) -119, 8);
                                  break L6;
                                }
                              }
                              this.field_b.a(sd.a(ho.field_f, 83, new String[]{var7}), (byte) -33, 18);
                              if (param1 == null) {
                                break L5;
                              } else {
                                this.field_j = param1;
                                this.field_b.a(sd.a(nl.field_d, 22, new String[]{var7}), (byte) -95, 19);
                                break L5;
                              }
                            }
                          }
                        }
                        this.field_b.a(sd.a(ni.field_p, 18, new String[]{var7}), (byte) -33, 5);
                        break L4;
                      }
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      this.field_b.a(sd.a(hk.field_a, param2 + 72, new String[]{var7}), (byte) -77, 7);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("wi.E(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        if (!hf.b((byte) 100)) {
            return;
        }
        bq.a(false, (byte) -110, 4);
        if (param0 != -53) {
            field_d = (vj) null;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param0 == 0) {
          bg.a(this.field_l, param1, param2 ^ -31541);
          if (param2 != 7490) {
            discarded$7 = this.a(67, true, 49);
            return true;
          } else {
            return true;
          }
        } else {
          if (-2 == (param0 ^ -1)) {
            pe.a(7, param1, this.field_l);
            if (param2 != 7490) {
              discarded$8 = this.a(67, true, 49);
              return true;
            } else {
              return true;
            }
          } else {
            if (-3 == (param0 ^ -1)) {
              wi.b(param1, param2 ^ -7903, this.field_m);
              if (param2 != 7490) {
                discarded$9 = this.a(67, true, 49);
                return true;
              } else {
                return true;
              }
            } else {
              if ((param0 ^ -1) == -4) {
                qg.a(this.field_m, param1, false);
                if (param2 == 7490) {
                  return true;
                } else {
                  discarded$10 = this.a(67, true, 49);
                  return true;
                }
              } else {
                if ((param0 ^ -1) == -11) {
                  qj.a(false, this.field_m, param1);
                  if (param2 == 7490) {
                    return true;
                  } else {
                    discarded$11 = this.a(67, true, 49);
                    return true;
                  }
                } else {
                  if ((param0 ^ -1) == -16) {
                    df.a(param2 ^ 7489, this.field_m, param1);
                    if (param2 != 7490) {
                      discarded$12 = this.a(67, true, 49);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if ((param0 ^ -1) == -17) {
                      df.a(3, 0, param1);
                      if (param2 != 7490) {
                        discarded$13 = this.a(67, true, 49);
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 != 20) {
            field_n = (String) null;
            this.field_b.a(param0, 0);
            return;
        }
        this.field_b.a(param0, 0);
    }

    final void b(boolean param0, byte param1) {
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        boolean discarded$22 = false;
        boolean discarded$23 = false;
        boolean discarded$24 = false;
        boolean discarded$25 = false;
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        uj var4 = null;
        String var5 = null;
        int var6 = 0;
        uj var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.field_h != null) {
          if (this.field_l != hn.field_f) {
            if (null != io.field_c) {
              if (pl.m(param1 + 197)) {
                var7 = gp.a(param1 + 100, this.field_l);
                var4 = ll.a(this.field_l, param1 + 14526);
                var5 = this.a((byte) 27);
                if (var4 != null) {
                  if (!io.field_c.field_dc) {
                    this.field_b.a(sd.a(vf.field_b, 123, new String[]{var5}), (byte) -112, 1);
                    if (param1 == -98) {
                      return;
                    } else {
                      discarded$14 = this.a(48, 58, -125);
                      return;
                    }
                  } else {
                    if ((io.field_c.field_nc ^ -1) > -1) {
                      if (param1 == -98) {
                        return;
                      } else {
                        discarded$15 = this.a(48, 58, -125);
                        return;
                      }
                    } else {
                      this.field_b.a(sd.a(vf.field_b, 123, new String[]{var5}), (byte) -112, 1);
                      if (param1 == -98) {
                        return;
                      } else {
                        discarded$16 = this.a(48, 58, -125);
                        return;
                      }
                    }
                  }
                } else {
                  if (var7 != null) {
                    if (io.field_c.field_Mb) {
                      if (io.field_c.field_mc < io.field_c.field_ec) {
                        if (var7.field_Vb) {
                          this.field_b.a(sd.a(fm.field_j, param1 + 180, new String[]{var5}), (byte) -111, 1);
                          if (param1 == -98) {
                            return;
                          } else {
                            discarded$17 = this.a(48, 58, -125);
                            return;
                          }
                        } else {
                          if (!param0) {
                            this.field_b.a(sd.a(i.field_m, 67, new String[]{var5}), (byte) -83, 0);
                            if (param1 == -98) {
                              return;
                            } else {
                              discarded$18 = this.a(48, 58, -125);
                              return;
                            }
                          } else {
                            if (var7.field_Jb) {
                              this.field_b.a(sd.a(md.field_V, 59, new String[]{var5}), (byte) -70, 0);
                              this.field_b.a(sd.a(po.field_f, 101, new String[]{var5}), (byte) -41, 1);
                              if (param1 == -98) {
                                return;
                              } else {
                                discarded$19 = this.a(48, 58, -125);
                                return;
                              }
                            } else {
                              this.field_b.a(sd.a(i.field_m, 67, new String[]{var5}), (byte) -83, 0);
                              if (param1 != -98) {
                                discarded$20 = this.a(48, 58, -125);
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        if (param1 != -98) {
                          discarded$21 = this.a(48, 58, -125);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1 != -98) {
                        discarded$22 = this.a(48, 58, -125);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1 != -98) {
                      discarded$23 = this.a(48, 58, -125);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param1 != -98) {
                  discarded$24 = this.a(48, 58, -125);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != -98) {
                discarded$25 = this.a(48, 58, -125);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 != -98) {
              discarded$26 = this.a(48, 58, -125);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != -98) {
            discarded$27 = this.a(48, 58, -125);
            return;
          } else {
            return;
          }
        }
    }

    final static void b(int param0, int param1, int param2) {
        pc var3 = null;
        if (param1 != -925) {
          field_e = (String) null;
          var3 = aa.field_f;
          var3.g(param0, 15514);
          var3.e(160, 3);
          var3.e(160, 8);
          var3.b(1276387944, param2);
          return;
        } else {
          var3 = aa.field_f;
          var3.g(param0, 15514);
          var3.e(160, 3);
          var3.e(160, 8);
          var3.b(1276387944, param2);
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        Object var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var4 = null;
        if (param2 != 4) {
          if (param2 != 5) {
            if (param2 != 6) {
              if (7 == param2) {
                var8 = aq.a(this.field_h, param0, this.field_i, -20867);
                if (var8 == null) {
                  if (param1 < -123) {
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  ti.a(0, (String) null, this.field_h, (byte) -50, 2, var8);
                  if (param1 >= -123) {
                    return true;
                  } else {
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              var7 = mj.a(85, this.field_h, param0);
              if (var7 == null) {
                if (param1 >= -123) {
                  return true;
                } else {
                  return true;
                }
              } else {
                ti.a(0, (String) null, this.field_h, (byte) -50, 2, var7);
                if (param1 >= -123) {
                  return true;
                } else {
                  return true;
                }
              }
            }
          } else {
            var6 = ff.a(param0, this.field_h, (byte) -106);
            if (var6 != null) {
              ti.a(0, (String) null, this.field_h, (byte) -50, 2, var6);
              if (param1 >= -123) {
                return true;
              } else {
                return true;
              }
            } else {
              if (param1 >= -123) {
                return true;
              } else {
                return true;
              }
            }
          }
        } else {
          var5 = jf.a(this.field_h, param0, (byte) 79);
          if (var5 != null) {
            ti.a(0, (String) null, this.field_h, (byte) -50, 2, var5);
            if (param1 >= -123) {
              return true;
            } else {
              return true;
            }
          } else {
            if (param1 >= -123) {
              return true;
            } else {
              return true;
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 < -94) {
          if (null != this.field_b) {
            if (!this.field_b.j(-52)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, aa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 66) {
                break L1;
              } else {
                this.field_l = 31L;
                break L1;
              }
            }
            if (param1.field_a) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                this.field_k = param1.field_j;
                if (-1 != (param1.field_j ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (-1 == (io.field_e ^ -1)) {
                      this.field_b.a(gd.field_j, (byte) -31, 12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_b.a(uo.field_d, (byte) -127, 13);
                  break L2;
                }
              }
              L4: {
                if (1 == param1.field_j) {
                  L5: {
                    if (0 != gh.field_v) {
                      break L5;
                    } else {
                      this.field_b.a(m.field_l, (byte) -97, 12);
                      break L5;
                    }
                  }
                  this.field_b.a(ec.field_n, (byte) -106, 13);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (2 != param1.field_j) {
                  break L6;
                } else {
                  L7: {
                    if (0 != ib.field_e) {
                      break L7;
                    } else {
                      this.field_b.a(gf.field_d, (byte) -78, 12);
                      break L7;
                    }
                  }
                  this.field_b.a(sf.field_a, (byte) -62, 13);
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (runtimeException);
            stackOut_20_1 = new StringBuilder().append("wi.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, boolean param4) {
        int var6 = this.field_b.b(-12487, param4);
        if (param2) {
            return true;
        }
        if (!(-2 != var6)) {
            return false;
        }
        boolean discarded$0 = this.a(var6, param1, 7490);
        boolean discarded$1 = this.a(param0, (byte) -128, var6);
        boolean discarded$2 = this.b(var6, (byte) 10, param0);
        boolean discarded$3 = this.a(var6, param2, param3);
        return true;
    }

    private final boolean b(int param0, byte param1, int param2) {
        boolean discarded$1 = false;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if ((param0 ^ -1) == -9) {
          pm.a((byte) 85, this.field_h, this.field_l);
          if (param1 != 10) {
            wi.b((byte) -113);
            return true;
          } else {
            return true;
          }
        } else {
          if (param0 == 18) {
            qj.a(this.field_h, this.field_l, (byte) 8);
            if (param1 != 10) {
              wi.b((byte) -113);
              return true;
            } else {
              return true;
            }
          } else {
            if (param0 != 11) {
              if (param0 == 12) {
                am.a(1, -26931, this.field_k, param2);
                if (param1 != 10) {
                  wi.b((byte) -113);
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((param0 ^ -1) == -14) {
                  am.a(2, -26931, this.field_k, param2);
                  if (param1 == 10) {
                    return true;
                  } else {
                    wi.b((byte) -113);
                    return true;
                  }
                } else {
                  if ((param0 ^ -1) != -15) {
                    if (20 != param0) {
                      if (-20 == (param0 ^ -1)) {
                        discarded$1 = tg.a(this.field_h, this.field_l, this.field_k, -2, this.field_j);
                        if (param1 == 10) {
                          return true;
                        } else {
                          wi.b((byte) -113);
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      ak.c(true);
                      if (param1 != 10) {
                        wi.b((byte) -113);
                        return true;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    kl.a(7500);
                    if (param1 != 10) {
                      wi.b((byte) -113);
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              am.a(0, -26931, this.field_k, param2);
              if (param1 != 10) {
                wi.b((byte) -113);
                return true;
              } else {
                return true;
              }
            }
          }
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        boolean discarded$2 = false;
        if (param0 == 17) {
          hc.field_M = new oe(this.field_o.field_tb, this.field_o.field_gb, this.field_o.field_K, this.field_o.field_nb, param2, cm.field_o, pj.field_i, ae.field_f, mg.field_h, um.field_q, dn.field_c, this.field_h, this.field_l);
          return true;
        } else {
          if (param1) {
            discarded$2 = this.a(-50, false, 11);
            return false;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        eq var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = -90 % ((42 - param0) / 62);
        if (io.field_c == null) {
          var3 = vm.a(this.field_m, (byte) -107);
          if (var3 != null) {
            var4 = var3.field_pc;
            if (!var3.field_cc) {
              if (!var3.field_hc) {
                if (!var3.field_Ob) {
                  if (var3.field_Mb) {
                    if (!var3.field_dc) {
                      this.field_b.a(sd.a(hd.field_o, 87, new String[]{var4}), (byte) -32, 2);
                      if (var3.field_Ob) {
                        this.field_b.a(sd.a(ve.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3.field_hc) {
                        this.field_b.a(sd.a(hd.field_o, 87, new String[]{var4}), (byte) -32, 2);
                        if (var3.field_Ob) {
                          this.field_b.a(sd.a(ve.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (var3.field_Ob) {
                          this.field_b.a(sd.a(ve.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var3.field_Ob) {
                      this.field_b.a(sd.a(ve.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (var3.field_Ob) {
                    this.field_b.a(sd.a(ve.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.field_b.a(sd.a(vg.field_f, 53, new String[]{var4}), (byte) -106, 2);
                if (!var3.field_Ob) {
                  return;
                } else {
                  this.field_b.a(sd.a(ve.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
                  return;
                }
              }
            } else {
              this.field_b.a(sd.a(fp.field_b, 97, new String[]{var4}), (byte) -105, 2);
              this.field_b.a(sd.a(oi.field_a, 52, new String[]{var4}), (byte) -118, 3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    wi(ak param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_b = new pi(a.field_O);
            param0.field_U = true;
            this.field_o = param0;
            this.field_k = param5;
            this.field_h = param2;
            this.field_l = param1;
            this.field_j = param6;
            this.field_i = param3;
            this.field_m = param4;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == this.field_h) {
            break L0;
          } else {
            if ((this.field_l ^ -1L) != (hn.field_f ^ -1L)) {
              var3 = this.a((byte) 43);
              var2 = var3;
              this.field_b.a(sd.a(sl.field_j, param0 + -8830, new String[]{var3}), (byte) -72, 17);
              break L0;
            } else {
              if (param0 == 8893) {
                return;
              } else {
                discarded$4 = this.a(-105, 67, -5);
                return;
              }
            }
          }
        }
        if (param0 != 8893) {
          discarded$5 = this.a(-105, 67, -5);
          return;
        } else {
          return;
        }
    }

    static {
        field_c = "Suggest muting this player";
        field_g = "This is your RuneScape clan if you have one.";
        field_n = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_e = "<%0> cannot join; the game has started.";
        field_f = new int[4];
    }
}
