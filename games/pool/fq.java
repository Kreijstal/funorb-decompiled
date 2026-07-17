/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends qq implements tb {
    static boolean field_Gb;
    static String field_Db;
    static String field_Bb;
    private boolean field_Fb;
    private boolean field_Eb;
    static int[] field_Hb;
    private nf field_Cb;

    final static boolean m(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != 0) {
          L0: {
            boolean discarded$8 = fq.m(71);
            if (null != ne.field_u) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = um.field_e;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != ne.field_u) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = um.field_e;
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void l(int param0) {
        field_Bb = null;
        field_Db = null;
        if (param0 != 5) {
            return;
        }
        field_Hb = null;
    }

    private final void a(wc param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        wk var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              ((fq) this).field_Fb = true;
              if (param1 == 5) {
                break L1;
              } else {
                field_Gb = true;
                break L1;
              }
            }
            L2: {
              if (!param0.field_f) {
                if (null == param0.field_c) {
                  var4_ref = param0.field_b;
                  if (param0.field_g == 248) {
                    L3: {
                      if (param2) {
                        break L3;
                      } else {
                        int discarded$3 = -80;
                        uf.r();
                        break L3;
                      }
                    }
                    var4_ref = hb.field_b;
                    ((fq) this).field_Eb = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = gi.field_n;
                  if (null != ((fq) this).field_Cb) {
                    ((fq) this).field_Cb.a(param1 ^ 16777210);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4_ref = ud.field_H;
                break L2;
              }
            }
            L4: {
              var5 = new wk((qq) this, bi.field_e, var4_ref);
              if (param0.field_f) {
                if (!param0.field_e) {
                  fe discarded$4 = var5.a(fg.field_c, param1 + -88, (cc) this);
                  break L4;
                } else {
                  ((fq) this).d((ei) (Object) new sd((fq) this), 30);
                  return;
                }
              } else {
                L5: {
                  if (((fq) this).field_Eb) {
                    fe discarded$5 = var5.a(fg.field_c, -123, (cc) this);
                    break L5;
                  } else {
                    if (param0.field_g == 5) {
                      var5.a(11, hb.field_c, param1 ^ 4);
                      var5.a(17, dj.field_e, 1);
                      break L5;
                    } else {
                      var5.a(-1, jk.field_a, param1 ^ 4);
                      break L5;
                    }
                  }
                }
                if (3 == param0.field_g) {
                  var5.a(7, o.field_w, param1 ^ 4);
                  break L4;
                } else {
                  if (param0.field_g == 6) {
                    var5.a(9, e.field_f, 1);
                    break L4;
                  } else {
                    ((fq) this).d((ei) (Object) var5, 30);
                    return;
                  }
                }
              }
            }
            ((fq) this).d((ei) (Object) var5, 30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("fq.TB(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (!(!((fq) this).field_Eb)) {
            t.a(115, false, true);
            return;
        }
        nm.a((byte) 41);
        if (!param0) {
            return;
        }
        try {
            ((fq) this).k(17);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "fq.P(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final boolean g(byte param0) {
        wc var2 = null;
        if (param0 == -20) {
          if (((fq) this).field_R) {
            if (!((fq) this).field_Fb) {
              var2 = hi.a(true);
              if (var2 == null) {
                return super.g((byte) -20);
              } else {
                this.a(var2, param0 + 25, false);
                return super.g((byte) -20);
              }
            } else {
              return super.g((byte) -20);
            }
          } else {
            return super.g((byte) -20);
          }
        } else {
          field_Bb = null;
          if (((fq) this).field_R) {
            if (!((fq) this).field_Fb) {
              var2 = hi.a(true);
              if (var2 == null) {
                return super.g((byte) -20);
              } else {
                this.a(var2, param0 + 25, false);
                return super.g((byte) -20);
              }
            } else {
              return super.g((byte) -20);
            }
          } else {
            return super.g((byte) -20);
          }
        }
    }

    fq(lq param0, nf param1) {
        super(param0, bi.field_e, tk.field_j, false, false);
        try {
            ((fq) this).field_Cb = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "fq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void p(byte param0) {
        this.a(gg.a(248, true, hb.field_b), 5, true);
        if (param0 > -44) {
            field_Gb = true;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        le discarded$28 = lg.field_s.a(true, (byte) 106, (java.awt.Component) (Object) vj.a((byte) -37));
        sg.field_P = 0;
        sq.field_b = param1;
        if (param0 == -3405) {
          ga.m(param0 ^ 22150);
          if (dn.a(true, sq.field_b)) {
            L0: {
              s.field_c[sq.field_b].field_w = param2;
              var4 = 0;
              if (sq.field_b == 21) {
                var4 = -1;
                break L0;
              } else {
                break L0;
              }
            }
            s.field_c[sq.field_b].a(0, var4, param3);
            if (sq.field_b == 21) {
              id.a(-83, param3);
              if (sq.field_b >= 0) {
                if (s.field_c[sq.field_b].field_n) {
                  L1: {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b == -2) {
                      break L1;
                    } else {
                      if (sq.field_b == -4) {
                        break L1;
                      } else {
                        kf discarded$29 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (-2 == sq.field_b) {
                    L2: {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b == -2) {
                        break L2;
                      } else {
                        if (sq.field_b == -4) {
                          break L2;
                        } else {
                          kf discarded$30 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (sq.field_b == -5) {
                      L3: {
                        ac.a(256, false, true, ul.field_m);
                        if (sq.field_b == -2) {
                          break L3;
                        } else {
                          if (sq.field_b == -4) {
                            break L3;
                          } else {
                            kf discarded$31 = vj.a((byte) -27, il.field_c[3]);
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (sq.field_b == -4) {
                        L4: {
                          ac.a(256, false, true, ul.field_m);
                          if (sq.field_b == -2) {
                            break L4;
                          } else {
                            if (sq.field_b == -4) {
                              break L4;
                            } else {
                              kf discarded$32 = vj.a((byte) -27, il.field_c[3]);
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        if (sq.field_b != -2) {
                          if (sq.field_b == -4) {
                            return;
                          } else {
                            kf discarded$33 = vj.a((byte) -27, il.field_c[3]);
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (-2 == sq.field_b) {
                  L5: {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b == -2) {
                      break L5;
                    } else {
                      if (sq.field_b == -4) {
                        break L5;
                      } else {
                        kf discarded$34 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (sq.field_b == -5) {
                    L6: {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b == -2) {
                        break L6;
                      } else {
                        if (sq.field_b == -4) {
                          break L6;
                        } else {
                          kf discarded$35 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (sq.field_b == -4) {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b != -2) {
                        if (sq.field_b != -4) {
                          kf discarded$36 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (sq.field_b != -2) {
                        if (sq.field_b != -4) {
                          kf discarded$37 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              if (sq.field_b >= 0) {
                if (s.field_c[sq.field_b].field_n) {
                  ac.a(256, false, true, ul.field_m);
                  if (sq.field_b != -2) {
                    if (sq.field_b != -4) {
                      kf discarded$38 = vj.a((byte) -27, il.field_c[3]);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (-2 == sq.field_b) {
                    L7: {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b == -2) {
                        break L7;
                      } else {
                        if (sq.field_b == -4) {
                          break L7;
                        } else {
                          kf discarded$39 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (sq.field_b == -5) {
                      L8: {
                        ac.a(256, false, true, ul.field_m);
                        if (sq.field_b == -2) {
                          break L8;
                        } else {
                          if (sq.field_b == -4) {
                            break L8;
                          } else {
                            kf discarded$40 = vj.a((byte) -27, il.field_c[3]);
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (sq.field_b == -4) {
                        L9: {
                          ac.a(256, false, true, ul.field_m);
                          if (sq.field_b == -2) {
                            break L9;
                          } else {
                            if (sq.field_b == -4) {
                              break L9;
                            } else {
                              kf discarded$41 = vj.a((byte) -27, il.field_c[3]);
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        if (sq.field_b != -2) {
                          if (sq.field_b == -4) {
                            return;
                          } else {
                            kf discarded$42 = vj.a((byte) -27, il.field_c[3]);
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (-2 == sq.field_b) {
                  L10: {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b == -2) {
                      break L10;
                    } else {
                      if (sq.field_b == -4) {
                        break L10;
                      } else {
                        kf discarded$43 = vj.a((byte) -27, il.field_c[3]);
                        break L10;
                      }
                    }
                  }
                  return;
                } else {
                  if (sq.field_b == -5) {
                    L11: {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b == -2) {
                        break L11;
                      } else {
                        if (sq.field_b == -4) {
                          break L11;
                        } else {
                          kf discarded$44 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (sq.field_b == -4) {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b != -2) {
                        if (sq.field_b != -4) {
                          kf discarded$45 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (sq.field_b != -2) {
                        if (sq.field_b != -4) {
                          kf discarded$46 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (sq.field_b >= 0) {
              if (s.field_c[sq.field_b].field_n) {
                L12: {
                  ac.a(256, false, true, ul.field_m);
                  if (sq.field_b == -2) {
                    break L12;
                  } else {
                    if (sq.field_b == -4) {
                      break L12;
                    } else {
                      kf discarded$47 = vj.a((byte) -27, il.field_c[3]);
                      return;
                    }
                  }
                }
                return;
              } else {
                if (-2 == sq.field_b) {
                  L13: {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b == -2) {
                      break L13;
                    } else {
                      if (sq.field_b == -4) {
                        break L13;
                      } else {
                        kf discarded$48 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (sq.field_b == -5) {
                    L14: {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b == -2) {
                        break L14;
                      } else {
                        if (sq.field_b == -4) {
                          break L14;
                        } else {
                          kf discarded$49 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (sq.field_b == -4) {
                      L15: {
                        ac.a(256, false, true, ul.field_m);
                        if (sq.field_b == -2) {
                          break L15;
                        } else {
                          if (sq.field_b == -4) {
                            break L15;
                          } else {
                            kf discarded$50 = vj.a((byte) -27, il.field_c[3]);
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (sq.field_b != -2) {
                        if (sq.field_b == -4) {
                          return;
                        } else {
                          kf discarded$51 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              if (-2 == sq.field_b) {
                L16: {
                  ac.a(256, false, true, ul.field_m);
                  if (sq.field_b == -2) {
                    break L16;
                  } else {
                    if (sq.field_b == -4) {
                      break L16;
                    } else {
                      kf discarded$52 = vj.a((byte) -27, il.field_c[3]);
                      break L16;
                    }
                  }
                }
                return;
              } else {
                if (sq.field_b == -5) {
                  L17: {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b == -2) {
                      break L17;
                    } else {
                      if (sq.field_b == -4) {
                        break L17;
                      } else {
                        kf discarded$53 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (sq.field_b == -4) {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b != -2) {
                      if (sq.field_b != -4) {
                        kf discarded$54 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (sq.field_b != -2) {
                      if (sq.field_b != -4) {
                        kf discarded$55 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "On";
        field_Bb = "Set up new game";
        field_Hb = new int[]{2, 20, 21, 49, 6, 5, 12, 13};
    }
}
