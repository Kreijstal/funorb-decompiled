/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class mn extends aa implements ng {
    private boolean field_eb;
    private uc field_cb;
    private boolean field_Y;
    private boolean field_ab;
    static int[] field_Z;
    static int[] field_bb;
    private boolean field_fb;
    private kf field_db;

    final static t a(la param0, String param1, String param2, int param3) {
        int var4 = param0.a(-1, param1);
        if (param3 <= 81) {
            mn.h((byte) 123);
        }
        int var5 = param0.a(param2, -121, var4);
        return wi.a(var5, (byte) -106, param0, var4);
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        byte[] var9 = null;
        var7 = Torquing.field_u;
        var9 = new byte[param3];
        var4 = var9;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (param3 <= var6) {
            if (param0 == -6058) {
              if (var5 == 0) {
                return null;
              } else {
                return var4;
              }
            } else {
              var8 = null;
              byte[] discarded$1 = mn.a(-121, (byte[]) null, -61, -87);
              if (var5 == 0) {
                return null;
              } else {
                return var4;
              }
            }
          } else {
            var9[var6] = param1[var6];
            if (param1[var6] != param2) {
              var5 = 1;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        fo var4 = null;
        int var5 = 0;
        fo var6 = null;
        fo var7 = null;
        fo var8 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        fo stackIn_23_0 = null;
        fo stackIn_24_0 = null;
        fo stackIn_25_0 = null;
        String stackIn_25_1 = null;
        fo stackIn_56_0 = null;
        fo stackIn_57_0 = null;
        fo stackIn_58_0 = null;
        String stackIn_58_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        fo stackOut_55_0 = null;
        fo stackOut_57_0 = null;
        String stackOut_57_1 = null;
        fo stackOut_56_0 = null;
        String stackOut_56_1 = null;
        fo stackOut_22_0 = null;
        fo stackOut_24_0 = null;
        String stackOut_24_1 = null;
        fo stackOut_23_0 = null;
        String stackOut_23_1 = null;
        var5 = Torquing.field_u;
        if (!((mn) this).field_fb) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param0 != 256) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((mn) this).field_Y = stackIn_5_1 != 0;
          ((mn) this).field_fb = true;
          if (param2 != -257) {
            field_bb = null;
            ((mn) this).field_db.c(4210752, 8405024, (byte) 125);
            var8 = new fo((mn) this, ((mn) this).field_cb, param1);
            var6 = var8;
            var4 = var8;
            if (param0 == -6) {
              var8.a(kl.field_n, 5177, 11);
              var8.a(pf.field_q, 5177, 17);
              if (param0 == 3) {
                var8.a(dc.field_b, 5177, 7);
                ((mn) this).c((gm) (Object) var8, 33);
                return;
              } else {
                if (4 != param0) {
                  if (-7 == (param0 ^ -1)) {
                    var8.a(pf.field_u, param2 ^ -5434, 9);
                    ((mn) this).c((gm) (Object) var8, 33);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      lg discarded$8 = var8.a(0, ml.field_c, (ca) this);
                      ((mn) this).c((gm) (Object) var8, 33);
                      return;
                    } else {
                      ((mn) this).c((gm) (Object) var8, 33);
                      return;
                    }
                  }
                } else {
                  var8.a(cd.field_a, 5177, 8);
                  ((mn) this).c((gm) (Object) var8, 33);
                  return;
                }
              }
            } else {
              if (-257 == param0) {
                lg discarded$9 = var8.a(0, qm.field_b, (ca) this);
                if (param0 == 3) {
                  var8.a(dc.field_b, 5177, 7);
                  ((mn) this).c((gm) (Object) var8, 33);
                  return;
                } else {
                  if (4 != param0) {
                    if (-7 == (param0 ^ -1)) {
                      var8.a(pf.field_u, param2 ^ -5434, 9);
                      ((mn) this).c((gm) (Object) var8, 33);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        lg discarded$10 = var8.a(0, ml.field_c, (ca) this);
                        ((mn) this).c((gm) (Object) var8, 33);
                        return;
                      } else {
                        ((mn) this).c((gm) (Object) var8, 33);
                        return;
                      }
                    }
                  } else {
                    var8.a(cd.field_a, 5177, 8);
                    ((mn) this).c((gm) (Object) var8, 33);
                    return;
                  }
                }
              } else {
                L1: {
                  stackOut_55_0 = (fo) var8;
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_56_0 = stackOut_55_0;
                  if (((mn) this).field_eb) {
                    stackOut_57_0 = (fo) (Object) stackIn_57_0;
                    stackOut_57_1 = qm.field_b;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    break L1;
                  } else {
                    stackOut_56_0 = (fo) (Object) stackIn_56_0;
                    stackOut_56_1 = qh.field_a;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    break L1;
                  }
                }
                ((fo) (Object) stackIn_58_0).a(stackIn_58_1, param2 ^ -5434, -1);
                if (param0 == 3) {
                  var8.a(dc.field_b, 5177, 7);
                  ((mn) this).c((gm) (Object) var8, 33);
                  return;
                } else {
                  if (4 != param0) {
                    if (-7 == (param0 ^ -1)) {
                      var8.a(pf.field_u, param2 ^ -5434, 9);
                      ((mn) this).c((gm) (Object) var8, 33);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        lg discarded$11 = var8.a(0, ml.field_c, (ca) this);
                        ((mn) this).c((gm) (Object) var8, 33);
                        return;
                      } else {
                        ((mn) this).c((gm) (Object) var8, 33);
                        return;
                      }
                    }
                  } else {
                    var8.a(cd.field_a, 5177, 8);
                    ((mn) this).c((gm) (Object) var8, 33);
                    return;
                  }
                }
              }
            }
          } else {
            ((mn) this).field_db.c(4210752, 8405024, (byte) 125);
            var7 = new fo((mn) this, ((mn) this).field_cb, param1);
            var6 = var7;
            var4 = var7;
            if ((param0 ^ -1) != -6) {
              if (-257 == (param0 ^ -1)) {
                lg discarded$12 = var7.a(0, qm.field_b, (ca) this);
                if (param0 == 3) {
                  var7.a(dc.field_b, 5177, 7);
                  ((mn) this).c((gm) (Object) var7, 33);
                  return;
                } else {
                  if (4 != param0) {
                    if (-7 == (param0 ^ -1)) {
                      var7.a(pf.field_u, param2 ^ -5434, 9);
                      ((mn) this).c((gm) (Object) var7, 33);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        lg discarded$13 = var7.a(0, ml.field_c, (ca) this);
                        ((mn) this).c((gm) (Object) var7, 33);
                        return;
                      } else {
                        ((mn) this).c((gm) (Object) var7, 33);
                        return;
                      }
                    }
                  } else {
                    var7.a(cd.field_a, 5177, 8);
                    ((mn) this).c((gm) (Object) var7, 33);
                    return;
                  }
                }
              } else {
                L2: {
                  stackOut_22_0 = (fo) var7;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (((mn) this).field_eb) {
                    stackOut_24_0 = (fo) (Object) stackIn_24_0;
                    stackOut_24_1 = qm.field_b;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L2;
                  } else {
                    stackOut_23_0 = (fo) (Object) stackIn_23_0;
                    stackOut_23_1 = qh.field_a;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L2;
                  }
                }
                ((fo) (Object) stackIn_25_0).a(stackIn_25_1, param2 ^ -5434, -1);
                if (param0 == 3) {
                  var7.a(dc.field_b, 5177, 7);
                  ((mn) this).c((gm) (Object) var7, 33);
                  return;
                } else {
                  if (4 != param0) {
                    if (-7 == (param0 ^ -1)) {
                      var7.a(pf.field_u, param2 ^ -5434, 9);
                      ((mn) this).c((gm) (Object) var7, 33);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        lg discarded$14 = var7.a(0, ml.field_c, (ca) this);
                        ((mn) this).c((gm) (Object) var7, 33);
                        return;
                      } else {
                        ((mn) this).c((gm) (Object) var7, 33);
                        return;
                      }
                    }
                  } else {
                    var7.a(cd.field_a, 5177, 8);
                    ((mn) this).c((gm) (Object) var7, 33);
                    return;
                  }
                }
              }
            } else {
              var7.a(kl.field_n, 5177, 11);
              var7.a(pf.field_q, 5177, 17);
              if (param0 == 3) {
                var7.a(dc.field_b, 5177, 7);
                ((mn) this).c((gm) (Object) var7, 33);
                return;
              } else {
                if (4 != param0) {
                  if (-7 == (param0 ^ -1)) {
                    var7.a(pf.field_u, param2 ^ -5434, 9);
                    ((mn) this).c((gm) (Object) var7, 33);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      lg discarded$15 = var7.a(0, ml.field_c, (ca) this);
                      ((mn) this).c((gm) (Object) var7, 33);
                      return;
                    } else {
                      ((mn) this).c((gm) (Object) var7, 33);
                      return;
                    }
                  }
                } else {
                  var7.a(cd.field_a, 5177, 8);
                  ((mn) this).c((gm) (Object) var7, 33);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = Torquing.field_u;
        if (param0 == null) {
          return false;
        } else {
          var3 = param0.length();
          if (param2 > 12) {
            if ((var3 ^ -1) > -2) {
              return false;
            } else {
              if ((var3 ^ -1) >= -13) {
                L0: {
                  var10 = hf.a(param0, 114);
                  if (var10 == null) {
                    break L0;
                  } else {
                    if (-2 < (var10.length() ^ -1)) {
                      break L0;
                    } else {
                      if (ra.a(var10.charAt(0), 252)) {
                        return false;
                      } else {
                        if (!ra.a(var10.charAt(var10.length() + -1), 252)) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (0 >= var5) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (!ra.a((char) var7, 252)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (var5 < 2) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
                return false;
              } else {
                return false;
              }
            }
          } else {
            field_Z = null;
            if ((var3 ^ -1) <= -2) {
              if ((var3 ^ -1) >= -13) {
                var9 = hf.a(param0, 114);
                if (var9 != null) {
                  if (-2 < (var9.length() ^ -1)) {
                    return false;
                  } else {
                    if (ra.a(var9.charAt(0), 252)) {
                      return false;
                    } else {
                      if (!ra.a(var9.charAt(var9.length() + -1), 252)) {
                        var5 = 0;
                        var6 = 0;
                        L3: while (true) {
                          if (param0.length() <= var6) {
                            if (0 >= var5) {
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            L4: {
                              var7 = param0.charAt(var6);
                              if (!ra.a((char) var7, 252)) {
                                var5 = 0;
                                break L4;
                              } else {
                                var5++;
                                break L4;
                              }
                            }
                            if (var5 < 2) {
                              var6++;
                              var6++;
                              continue L3;
                            } else {
                              if (!param1) {
                                return false;
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
          if (!((mn) this).field_D) {
            return;
          } else {
            ((mn) this).field_D = false;
            if (!((mn) this).field_eb) {
              if (((mn) this).field_ab) {
                kf.a((byte) -100);
                return;
              } else {
                return;
              }
            } else {
              wo.a(107);
              return;
            }
          }
        } else {
          mn.h((byte) 54);
          if (!((mn) this).field_D) {
            return;
          } else {
            ((mn) this).field_D = false;
            if (!((mn) this).field_eb) {
              if (!((mn) this).field_ab) {
                return;
              } else {
                kf.a((byte) -100);
                return;
              }
            } else {
              wo.a(107);
              return;
            }
          }
        }
    }

    final void n(int param0) {
        fo var2 = null;
        ((mn) this).field_db.c(4210752, 2121792, (byte) 125);
        if (param0 != -20041) {
          return;
        } else {
          var2 = new fo((mn) this, ((mn) this).field_cb, kh.field_j);
          var2.a(pn.field_c, 5177, 15);
          ((mn) this).c((gm) (Object) var2, 33);
          return;
        }
    }

    public static void h(byte param0) {
        field_bb = null;
        if (param0 != 77) {
            field_bb = null;
            field_Z = null;
            return;
        }
        field_Z = null;
    }

    mn(ln param0, uc param1, String param2, boolean param3, boolean param4) {
        super(param0, (gm) (Object) new fo((mn) null, param1, param2), 77, 10, 10);
        ((mn) this).field_cb = param1;
        ((mn) this).field_fb = false;
        ((mn) this).field_eb = param3 ? true : false;
        ((mn) this).field_Y = false;
        ((mn) this).field_ab = param4 ? true : false;
        ((mn) this).field_db = new kf(13, 50, 274, 30, 15, 2113632, 4210752);
        ((mn) this).field_db.field_M = true;
        ((mn) this).a((gm) (Object) ((mn) this).field_db, -6938);
    }

    public void a(byte param0, lg param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (!((mn) this).field_Y) {
          ul.a(0, "tochangedisplayname.ws", ip.a(9));
          if (param0 < -85) {
            return;
          } else {
            var7 = null;
            boolean discarded$4 = ((mn) this).a(-44, (gm) null, 'Z', 47);
            return;
          }
        } else {
          od.b(128, 3);
          ((mn) this).b(true);
          if (param0 < -85) {
            return;
          } else {
            var7 = null;
            boolean discarded$5 = ((mn) this).a(-44, (gm) null, 'Z', 47);
            return;
          }
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        if (!(param0 != 13)) {
            ((mn) this).b(true);
            return true;
        }
        int var5 = -42 % ((param3 - -33) / 57);
        return super.a(param0, param1, param2, 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new int[16384];
    }
}
