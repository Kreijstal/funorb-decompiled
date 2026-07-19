/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    String field_h;
    static String field_j;
    pe field_l;
    private String field_k;
    static String field_a;
    private int[] field_m;
    static int field_g;
    private int field_i;
    private long field_d;
    int field_e;
    kc field_c;
    static int field_b;
    static String field_f;

    private final boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        int var5 = 0;
        String var6 = null;
        var4 = null;
        if ((param0 ^ -1) != -5) {
          if (-6 != (param0 ^ -1)) {
            if (param0 != 6) {
              if ((param0 ^ -1) == -8) {
                L0: {
                  var4_ref = hf.a(this.field_h, this.field_k, param2, 10068666);
                  var5 = 61 / ((11 - param1) / 63);
                  if (var4_ref != null) {
                    var6 = (String) null;
                    ao.a(0, (byte) 97, var4_ref, this.field_h, 2, (String) null);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return true;
              } else {
                return false;
              }
            } else {
              L1: {
                var4_ref = eh.a((byte) -120, param2, this.field_h);
                var5 = 61 / ((11 - param1) / 63);
                if (var4_ref != null) {
                  var6 = (String) null;
                  ao.a(0, (byte) 97, var4_ref, this.field_h, 2, (String) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return true;
            }
          } else {
            var4_ref = oe.a(this.field_h, 29140, param2);
            var5 = 61 / ((11 - param1) / 63);
            if (var4_ref == null) {
              return true;
            } else {
              var6 = (String) null;
              ao.a(0, (byte) 97, var4_ref, this.field_h, 2, (String) null);
              return true;
            }
          }
        } else {
          L2: {
            var4_ref = bo.a(this.field_h, (byte) -26, param2);
            var5 = 61 / ((11 - param1) / 63);
            if (var4_ref != null) {
              var6 = (String) null;
              ao.a(0, (byte) 97, var4_ref, this.field_h, 2, (String) null);
              break L2;
            } else {
              break L2;
            }
          }
          return true;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var6 = 0;
        if (param4 != 12815) {
            this.d(102);
            var6 = this.field_l.a(-1, param0);
            if (!(1 != (var6 ^ -1))) {
                return false;
            }
            discarded$0 = this.b(param2, param4 ^ 32446, var6);
            discarded$1 = this.a(var6, -68, param3);
            discarded$2 = this.a(var6, param3, false);
            discarded$3 = this.a(param1, (byte) -64, var6);
            return true;
        }
        var6 = this.field_l.a(-1, param0);
        if (!(1 != (var6 ^ -1))) {
            return false;
        }
        boolean discarded$4 = this.b(param2, param4 ^ 32446, var6);
        boolean discarded$5 = this.a(var6, -68, param3);
        boolean discarded$6 = this.a(var6, param3, false);
        boolean discarded$7 = this.a(param1, (byte) -64, var6);
        return true;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if ((param2 ^ -1) != -18) {
          if (param1 != -64) {
            this.field_c = (kc) null;
            return false;
          } else {
            return false;
          }
        } else {
          db.field_a = new w(this.field_c.field_V, this.field_c.field_nb, this.field_c.field_x, this.field_c.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, this.field_h, this.field_d);
          return true;
        }
    }

    final void d(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (this.field_h == null) {
            break L0;
          } else {
            if (this.field_d != qf.field_a) {
              var3 = this.a((byte) 32);
              var2 = var3;
              this.field_l.a(17, tj.a(-38, new String[]{var3}, ad.field_b), (byte) -26);
              break L0;
            } else {
              if (param0 == 5552) {
                return;
              } else {
                field_a = (String) null;
                return;
              }
            }
          }
        }
        if (param0 != 5552) {
          field_a = (String) null;
          return;
        } else {
          return;
        }
    }

    private final String a(byte param0) {
        boolean discarded$18 = false;
        String var2 = null;
        if (param0 != 32) {
          L0: {
            discarded$18 = this.a(false, -123, 50, 70, -1);
            if (null != this.field_k) {
              var2 = this.field_k;
              break L0;
            } else {
              var2 = this.field_h;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (null != this.field_k) {
              var2 = this.field_k;
              break L1;
            } else {
              var2 = this.field_h;
              break L1;
            }
          }
          return var2;
        }
    }

    final static boolean b(int param0) {
        if (param0 == -22768) {
          if (ob.field_Y != null) {
            if (!ob.field_Y.d((byte) -126)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_g = 24;
          if (ob.field_Y != null) {
            if (!ob.field_Y.d((byte) -126)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, jg param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (!param1.field_i) {
              L1: {
                this.field_i = param1.field_m;
                if (param0 == 19) {
                  break L1;
                } else {
                  this.field_m = (int[]) null;
                  break L1;
                }
              }
              L2: {
                if (param1.field_m == 0) {
                  L3: {
                    if (0 == on.field_h) {
                      this.field_l.a(12, fg.field_g, (byte) -26);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_l.a(13, jg.field_j, (byte) -26);
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (-2 == (param1.field_m ^ -1)) {
                  L5: {
                    if (-1 != (ra.field_m ^ -1)) {
                      break L5;
                    } else {
                      this.field_l.a(12, go.field_a, (byte) -26);
                      break L5;
                    }
                  }
                  this.field_l.a(13, dm.field_J, (byte) -26);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if ((param1.field_m ^ -1) != -3) {
                  break L6;
                } else {
                  L7: {
                    if (hd.field_b == 0) {
                      this.field_l.a(12, va.field_d, (byte) -26);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_l.a(13, ol.field_c, (byte) -26);
                  break L6;
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
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (runtimeException);
            stackOut_21_1 = new StringBuilder().append("ne.O(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        cg var4 = null;
        String var5 = null;
        int var6 = 0;
        cg var11 = null;
        cg var12 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 72) {
          this.a((byte) -94, false);
          if (this.field_h != null) {
            L0: {
              if (this.field_d == qf.field_a) {
                break L0;
              } else {
                if (null == wi.field_f) {
                  break L0;
                } else {
                  if (qk.k((byte) 98)) {
                    var12 = fn.a(this.field_d, 110);
                    var4 = vf.a(this.field_d, 8192);
                    var5 = this.a((byte) 32);
                    if (var4 != null) {
                      if (!wi.field_f.field_Lb) {
                        this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
                        return;
                      } else {
                        if (wi.field_f.field_nc < 0) {
                          break L0;
                        } else {
                          this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
                          return;
                        }
                      }
                    } else {
                      if (var12 == null) {
                        break L0;
                      } else {
                        if (!wi.field_f.field_kc) {
                          break L0;
                        } else {
                          if (wi.field_f.field_dc > wi.field_f.field_Rb) {
                            if (var12.field_Db) {
                              this.field_l.a(1, tj.a(124, new String[]{var5}, na.field_gc), (byte) -26);
                              return;
                            } else {
                              L1: {
                                if (!param1) {
                                  break L1;
                                } else {
                                  if (!var12.field_Kb) {
                                    break L1;
                                  } else {
                                    this.field_l.a(0, tj.a(-55, new String[]{var5}, se.field_L), (byte) -26);
                                    this.field_l.a(1, tj.a(param0 + 54, new String[]{var5}, gh.field_z), (byte) -26);
                                    return;
                                  }
                                }
                              }
                              this.field_l.a(0, tj.a(param0 + 48, new String[]{var5}, nh.field_x), (byte) -26);
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
              }
            }
            return;
          } else {
            return;
          }
        } else {
          if (this.field_h != null) {
            if (this.field_d != qf.field_a) {
              if (null != wi.field_f) {
                if (qk.k((byte) 98)) {
                  var11 = fn.a(this.field_d, 110);
                  var4 = vf.a(this.field_d, 8192);
                  var5 = this.a((byte) 32);
                  if (var4 != null) {
                    if (!wi.field_f.field_Lb) {
                      this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
                      return;
                    } else {
                      if (wi.field_f.field_nc < 0) {
                        return;
                      } else {
                        this.field_l.a(1, tj.a(-18, new String[]{var5}, gg.field_a), (byte) -26);
                        return;
                      }
                    }
                  } else {
                    if (var11 != null) {
                      if (wi.field_f.field_kc) {
                        if (wi.field_f.field_dc > wi.field_f.field_Rb) {
                          if (var11.field_Db) {
                            this.field_l.a(1, tj.a(124, new String[]{var5}, na.field_gc), (byte) -26);
                            return;
                          } else {
                            L2: {
                              if (!param1) {
                                break L2;
                              } else {
                                if (!var11.field_Kb) {
                                  break L2;
                                } else {
                                  this.field_l.a(0, tj.a(-55, new String[]{var5}, se.field_L), (byte) -26);
                                  this.field_l.a(1, tj.a(param0 + 54, new String[]{var5}, gh.field_z), (byte) -26);
                                  return;
                                }
                              }
                            }
                            this.field_l.a(0, tj.a(param0 + 48, new String[]{var5}, nh.field_x), (byte) -26);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0) {
        String var3 = null;
        int var4 = 0;
        qb[] var5 = null;
        na var6 = null;
        na var7 = null;
        na var8 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 3) {
          var5 = (qb[]) null;
          ne.a(39, -67, (qb[]) null, -123, 12, 116);
          if (wi.field_f == null) {
            var8 = im.a(this.field_e, (byte) -103);
            if (var8 != null) {
              var3 = var8.field_ic;
              if (!var8.field_Hb) {
                if (var8.field_Ob) {
                  this.field_l.a(2, tj.a(118, new String[]{var3}, ec.field_a), (byte) -26);
                  if (!var8.field_Nb) {
                    return;
                  } else {
                    this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                    return;
                  }
                } else {
                  L0: {
                    if (var8.field_Nb) {
                      break L0;
                    } else {
                      if (!var8.field_kc) {
                        break L0;
                      } else {
                        L1: {
                          if (!var8.field_Lb) {
                            break L1;
                          } else {
                            if (var8.field_Ob) {
                              break L1;
                            } else {
                              if (!var8.field_Nb) {
                                return;
                              } else {
                                this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                                return;
                              }
                            }
                          }
                        }
                        this.field_l.a(2, tj.a(-53, new String[]{var3}, bm.field_i), (byte) -26);
                        if (!var8.field_Nb) {
                          return;
                        } else {
                          this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                          return;
                        }
                      }
                    }
                  }
                  if (!var8.field_Nb) {
                    return;
                  } else {
                    this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                    return;
                  }
                }
              } else {
                this.field_l.a(2, tj.a(-106, new String[]{var3}, na.field_Sb), (byte) -26);
                this.field_l.a(3, tj.a(-91, new String[]{var3}, mk.field_I), (byte) -26);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (wi.field_f == null) {
            var7 = im.a(this.field_e, (byte) -103);
            var6 = var7;
            if (var7 != null) {
              var3 = var7.field_ic;
              if (!var7.field_Hb) {
                if (var7.field_Ob) {
                  this.field_l.a(2, tj.a(118, new String[]{var3}, ec.field_a), (byte) -26);
                  if (!var7.field_Nb) {
                    return;
                  } else {
                    this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                    return;
                  }
                } else {
                  if (!var7.field_Nb) {
                    if (!var7.field_kc) {
                      if (!var7.field_Nb) {
                        return;
                      } else {
                        this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                        return;
                      }
                    } else {
                      if (var7.field_Lb) {
                        if (!var7.field_Ob) {
                          if (!var7.field_Nb) {
                            return;
                          } else {
                            this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                            return;
                          }
                        } else {
                          this.field_l.a(2, tj.a(-53, new String[]{var3}, bm.field_i), (byte) -26);
                          if (!var7.field_Nb) {
                            return;
                          } else {
                            this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                            return;
                          }
                        }
                      } else {
                        this.field_l.a(2, tj.a(-53, new String[]{var3}, bm.field_i), (byte) -26);
                        if (var7.field_Nb) {
                          this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var7.field_Nb) {
                      this.field_l.a(3, tj.a(-82, new String[]{var3}, hl.field_h), (byte) -26);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                this.field_l.a(2, tj.a(-106, new String[]{var3}, na.field_Sb), (byte) -26);
                this.field_l.a(3, tj.a(-91, new String[]{var3}, mk.field_I), (byte) -26);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -22717) {
            field_b = -81;
            this.field_l.a(param1, true);
            return;
        }
        this.field_l.a(param1, true);
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        wa var5 = null;
        int var6 = 0;
        qb[] var7 = null;
        String var8 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_h) {
                break L1;
              } else {
                L2: {
                  if ((qf.field_a ^ -1L) != (this.field_d ^ -1L)) {
                    break L2;
                  } else {
                    if (param0 != 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if ((jb.field_t ^ -1) != -3) {
                  break L1;
                } else {
                  L3: {
                    var8 = this.a((byte) 32);
                    var4_ref = var8;
                    var5 = im.a(param2 ^ 13, this.field_h);
                    var6 = sa.a(this.field_h, param2 ^ 333) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        this.field_l.a(4, tj.a(param2 + -80, new String[]{var8}, ArcanistsMulti.field_F), (byte) -26);
                        this.field_l.a(6, tj.a(-108, new String[]{var8}, tn.field_Lb), (byte) -26);
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (param0 == 2) {
                            break L3;
                          } else {
                            if (!wh.field_g) {
                              this.field_m = param1;
                              this.field_l.a(19, tj.a(-25, new String[]{var8}, gh.field_O), (byte) -26);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (tc.a(this.field_h, -31046)) {
                          break L5;
                        } else {
                          if (!wh.field_g) {
                            L6: {
                              if (ld.field_p) {
                                break L6;
                              } else {
                                this.field_l.a(8, tj.a(-94, new String[]{var8}, mb.field_S), (byte) -26);
                                break L6;
                              }
                            }
                            this.field_l.a(18, tj.a(127, new String[]{var8}, bh.field_b), (byte) -26);
                            if (param1 == null) {
                              break L5;
                            } else {
                              this.field_m = param1;
                              this.field_l.a(19, tj.a(-98, new String[]{var8}, gh.field_O), (byte) -26);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_l.a(5, tj.a(param2 + -48, new String[]{var8}, ke.field_F), (byte) -26);
                      break L4;
                    }
                  }
                  if (var6 != 0) {
                    this.field_l.a(7, tj.a(126, new String[]{var8}, ja.field_t), (byte) -26);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param2 == 13) {
              break L0;
            } else {
              var7 = (qb[]) null;
              ne.a(-44, -48, (qb[]) null, 59, 24, -88);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("ne.K(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 19633) {
            return false;
        }
        if (param2 == 0) {
            qo.a(param0, (byte) -102, this.field_d);
            return true;
        }
        if ((param2 ^ -1) == -2) {
            na.a(this.field_d, 126, param0);
            return true;
        }
        if (param2 == 2) {
            uj.a(this.field_e, (byte) -123, param0);
        } else {
            if (param2 == 3) {
                qc.a(false, this.field_e, param0);
                return true;
            }
            if (10 == param2) {
                qe.a(this.field_e, (byte) -35, param0);
                return true;
            }
            if (param2 == 15) {
                ce.a(this.field_e, param0, -123);
                return true;
            }
            if (param2 == 16) {
                ce.a(0, param0, -79);
                return true;
            }
            return false;
        }
        return true;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param2) {
          if (8 != param0) {
            if (18 != param0) {
              if ((param0 ^ -1) != -12) {
                if (-13 != (param0 ^ -1)) {
                  if (-14 != (param0 ^ -1)) {
                    if ((param0 ^ -1) != -15) {
                      if ((param0 ^ -1) != -21) {
                        if (19 != param0) {
                          return false;
                        } else {
                          discarded$2 = va.a(this.field_d, 1, this.field_m, this.field_h, this.field_i);
                          return true;
                        }
                      } else {
                        gj.a((byte) -61);
                        return true;
                      }
                    } else {
                      j.a(param2);
                      return true;
                    }
                  } else {
                    ea.a(param1, 2, true, this.field_i);
                    return true;
                  }
                } else {
                  ea.a(param1, 1, true, this.field_i);
                  return true;
                }
              } else {
                L0: {
                  stackOut_29_0 = param1;
                  stackOut_29_1 = 0;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  if (param2) {
                    stackOut_31_0 = stackIn_31_0;
                    stackOut_31_1 = stackIn_31_1;
                    stackOut_31_2 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    break L0;
                  } else {
                    stackOut_30_0 = stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackOut_30_2 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    stackIn_32_2 = stackOut_30_2;
                    break L0;
                  }
                }
                ea.a(stackIn_32_0, stackIn_32_1, stackIn_32_2 != 0, this.field_i);
                return true;
              }
            } else {
              h.a(this.field_d, -30687, this.field_h);
              return true;
            }
          } else {
            nb.a(this.field_h, this.field_d, -26510);
            return true;
          }
        } else {
          this.field_c = (kc) null;
          if (8 != param0) {
            if (18 != param0) {
              if ((param0 ^ -1) != -12) {
                if (-13 != (param0 ^ -1)) {
                  if (-14 != (param0 ^ -1)) {
                    if ((param0 ^ -1) != -15) {
                      if ((param0 ^ -1) != -21) {
                        if (19 == param0) {
                          discarded$3 = va.a(this.field_d, 1, this.field_m, this.field_h, this.field_i);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        gj.a((byte) -61);
                        return true;
                      }
                    } else {
                      j.a(param2);
                      return true;
                    }
                  } else {
                    ea.a(param1, 2, true, this.field_i);
                    return true;
                  }
                } else {
                  ea.a(param1, 1, true, this.field_i);
                  return true;
                }
              } else {
                L1: {
                  stackOut_6_0 = param1;
                  stackOut_6_1 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (param2) {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L1;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L1;
                  }
                }
                ea.a(stackIn_9_0, stackIn_9_1, stackIn_9_2 != 0, this.field_i);
                return true;
              }
            } else {
              h.a(this.field_d, -30687, this.field_h);
              return true;
            }
          } else {
            nb.a(this.field_h, this.field_d, -26510);
            return true;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 == 49) {
          if (this.field_l != null) {
            if (!this.field_l.e(param0 ^ -22615)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void c(int param0) {
        if (param0 >= -1) {
          field_j = (String) null;
          field_f = null;
          field_a = null;
          field_j = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_j = null;
          return;
        }
    }

    ne(kc param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_l = new pe(ml.field_H);
            param0.field_ab = true;
            this.field_i = param5;
            this.field_m = param6;
            this.field_h = param2;
            this.field_d = param1;
            this.field_k = param3;
            this.field_e = param4;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, qb[] param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var6_int = param2[0].field_n;
                  var7 = param2[2].field_n;
                  var8 = param2[1].field_n;
                  param2[0].e(param4, param3, param5);
                  param2[2].e(param4 - -param1 - var7, param3, param5);
                  de.a(sl.field_H);
                  de.a(param4 - -var6_int, param3, -var7 + (param1 + param4), param2[1].field_w + param3);
                  var9 = var6_int + param4;
                  var10 = -var7 + param4 - -param1;
                  if (param0 <= -30) {
                    param4 = var9;
                    L2: while (true) {
                      if (param4 >= var10) {
                        de.b(sl.field_H);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param2[1].e(param4, param3, param5);
                        param4 = param4 + var8;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("ne.G(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_j = "These green slopes are where all young Arcanists train to become great mages. All that can be found here is a clean battleground in which to test your skills.";
        field_a = "Clan";
        field_f = "Day";
    }
}
