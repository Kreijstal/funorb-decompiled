/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends sh implements rc {
    private boolean field_ob;
    private boolean field_nb;
    static int field_lb;
    static be field_mb;
    static gk field_pb;
    private gh field_kb;

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        Object var7 = null;
        if (((sd) this).field_nb) {
          l.a(false, true, -100);
          return;
        } else {
          ck.e((byte) 125);
          if (param0 < 6) {
            var7 = null;
            this.a(-84, true, (rg) null);
            ((sd) this).a(true);
            return;
          } else {
            ((sd) this).a(true);
            return;
          }
        }
    }

    final void j(byte param0) {
        this.a(-1, true, wb.a(248, param0 ^ -51, ih.field_P));
        if (param0 != -52) {
            Object var3 = null;
            this.a(28, false, (rg) null);
        }
    }

    sd(pf param0, gh param1) {
        super(param0, ne.field_v, ce.field_t, false, false);
        ((sd) this).field_kb = param1;
    }

    public static void b(boolean param0) {
        field_pb = null;
        if (param0) {
            sd.b(false);
            field_mb = null;
            return;
        }
        field_mb = null;
    }

    private final void a(int param0, boolean param1, rg param2) {
        String var4 = null;
        uc var5 = null;
        int var6 = 0;
        uc var7 = null;
        String var8 = null;
        uc var9 = null;
        uc var10 = null;
        String var11 = null;
        uc var12 = null;
        String var13 = null;
        uc var14 = null;
        String var15 = null;
        uc var16 = null;
        var6 = Bounce.field_N;
        ((sd) this).field_ob = true;
        if (param0 == -1) {
          if (param2.field_f) {
            var15 = ha.field_k;
            var16 = new uc((sh) this, ne.field_v, var15);
            var5 = var16;
            if (param2.field_f) {
              if (param2.field_a) {
                ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
                return;
              } else {
                wd discarded$12 = var16.a(pc.field_i, (sk) this, -4);
                ((sd) this).a(10768, (lk) (Object) var16);
                return;
              }
            } else {
              if (((sd) this).field_nb) {
                wd discarded$13 = var16.a(pc.field_i, (sk) this, -4);
                if (param2.field_g == 3) {
                  var16.a(oc.field_c, 7, (byte) 80);
                  ((sd) this).a(10768, (lk) (Object) var16);
                  return;
                } else {
                  if ((param2.field_g ^ -1) != -7) {
                    ((sd) this).a(10768, (lk) (Object) var16);
                    return;
                  } else {
                    var16.a(da.field_c, 9, (byte) 93);
                    ((sd) this).a(10768, (lk) (Object) var16);
                    return;
                  }
                }
              } else {
                if ((param2.field_g ^ -1) == -6) {
                  var16.a(ta.field_e, 11, (byte) 114);
                  var16.a(i.field_g, 17, (byte) 85);
                  if (param2.field_g == 3) {
                    var16.a(oc.field_c, 7, (byte) 80);
                    ((sd) this).a(10768, (lk) (Object) var16);
                    return;
                  } else {
                    if ((param2.field_g ^ -1) != -7) {
                      ((sd) this).a(10768, (lk) (Object) var16);
                      return;
                    } else {
                      var16.a(da.field_c, 9, (byte) 93);
                      ((sd) this).a(10768, (lk) (Object) var16);
                      return;
                    }
                  }
                } else {
                  var16.a(pe.field_h, -1, (byte) 124);
                  if (param2.field_g == 3) {
                    var16.a(oc.field_c, 7, (byte) 80);
                    ((sd) this).a(10768, (lk) (Object) var16);
                    return;
                  } else {
                    if ((param2.field_g ^ -1) != -7) {
                      ((sd) this).a(10768, (lk) (Object) var16);
                      return;
                    } else {
                      var16.a(da.field_c, 9, (byte) 93);
                      ((sd) this).a(10768, (lk) (Object) var16);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param2.field_d == null) {
              var11 = param2.field_c;
              if (param2.field_g == 248) {
                L0: {
                  if (!param1) {
                    rg.b((byte) -128);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var13 = ih.field_P;
                ((sd) this).field_nb = true;
                var14 = new uc((sh) this, ne.field_v, var13);
                var5 = var14;
                if (param2.field_f) {
                  if (param2.field_a) {
                    ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
                    return;
                  } else {
                    wd discarded$14 = var14.a(pc.field_i, (sk) this, -4);
                    ((sd) this).a(10768, (lk) (Object) var14);
                    return;
                  }
                } else {
                  if (((sd) this).field_nb) {
                    wd discarded$15 = var14.a(pc.field_i, (sk) this, -4);
                    if (param2.field_g == 3) {
                      var14.a(oc.field_c, 7, (byte) 80);
                      ((sd) this).a(10768, (lk) (Object) var14);
                      return;
                    } else {
                      if ((param2.field_g ^ -1) != -7) {
                        ((sd) this).a(10768, (lk) (Object) var14);
                        return;
                      } else {
                        var14.a(da.field_c, 9, (byte) 93);
                        ((sd) this).a(10768, (lk) (Object) var14);
                        return;
                      }
                    }
                  } else {
                    if ((param2.field_g ^ -1) == -6) {
                      var14.a(ta.field_e, 11, (byte) 114);
                      var14.a(i.field_g, 17, (byte) 85);
                      if (param2.field_g == 3) {
                        var14.a(oc.field_c, 7, (byte) 80);
                        ((sd) this).a(10768, (lk) (Object) var14);
                        return;
                      } else {
                        if ((param2.field_g ^ -1) != -7) {
                          ((sd) this).a(10768, (lk) (Object) var14);
                          return;
                        } else {
                          var14.a(da.field_c, 9, (byte) 93);
                          ((sd) this).a(10768, (lk) (Object) var14);
                          return;
                        }
                      }
                    } else {
                      var14.a(pe.field_h, -1, (byte) 124);
                      if (param2.field_g == 3) {
                        var14.a(oc.field_c, 7, (byte) 80);
                        ((sd) this).a(10768, (lk) (Object) var14);
                        return;
                      } else {
                        if ((param2.field_g ^ -1) != -7) {
                          ((sd) this).a(10768, (lk) (Object) var14);
                          return;
                        } else {
                          var14.a(da.field_c, 9, (byte) 93);
                          ((sd) this).a(10768, (lk) (Object) var14);
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = new uc((sh) this, ne.field_v, var11);
                var5 = var12;
                if (param2.field_f) {
                  if (param2.field_a) {
                    ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
                    return;
                  } else {
                    wd discarded$16 = var12.a(pc.field_i, (sk) this, -4);
                    ((sd) this).a(10768, (lk) (Object) var12);
                    return;
                  }
                } else {
                  if (((sd) this).field_nb) {
                    wd discarded$17 = var12.a(pc.field_i, (sk) this, -4);
                    if (param2.field_g == 3) {
                      var12.a(oc.field_c, 7, (byte) 80);
                      ((sd) this).a(10768, (lk) (Object) var12);
                      return;
                    } else {
                      if ((param2.field_g ^ -1) != -7) {
                        ((sd) this).a(10768, (lk) (Object) var12);
                        return;
                      } else {
                        var12.a(da.field_c, 9, (byte) 93);
                        ((sd) this).a(10768, (lk) (Object) var12);
                        return;
                      }
                    }
                  } else {
                    if ((param2.field_g ^ -1) == -6) {
                      var12.a(ta.field_e, 11, (byte) 114);
                      var12.a(i.field_g, 17, (byte) 85);
                      if (param2.field_g == 3) {
                        var12.a(oc.field_c, 7, (byte) 80);
                        ((sd) this).a(10768, (lk) (Object) var12);
                        return;
                      } else {
                        if ((param2.field_g ^ -1) != -7) {
                          ((sd) this).a(10768, (lk) (Object) var12);
                          return;
                        } else {
                          var12.a(da.field_c, 9, (byte) 93);
                          ((sd) this).a(10768, (lk) (Object) var12);
                          return;
                        }
                      }
                    } else {
                      var12.a(pe.field_h, -1, (byte) 124);
                      if (param2.field_g == 3) {
                        var12.a(oc.field_c, 7, (byte) 80);
                        ((sd) this).a(10768, (lk) (Object) var12);
                        return;
                      } else {
                        if ((param2.field_g ^ -1) != -7) {
                          ((sd) this).a(10768, (lk) (Object) var12);
                          return;
                        } else {
                          var12.a(da.field_c, 9, (byte) 93);
                          ((sd) this).a(10768, (lk) (Object) var12);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var8 = ma.field_n;
              if (((sd) this).field_kb != null) {
                ((sd) this).field_kb.a(-3814);
                var10 = new uc((sh) this, ne.field_v, var8);
                if (param2.field_f) {
                  if (param2.field_a) {
                    ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
                    return;
                  } else {
                    wd discarded$18 = var10.a(pc.field_i, (sk) this, -4);
                    ((sd) this).a(10768, (lk) (Object) var10);
                    return;
                  }
                } else {
                  L1: {
                    if (((sd) this).field_nb) {
                      wd discarded$19 = var10.a(pc.field_i, (sk) this, -4);
                      break L1;
                    } else {
                      if ((param2.field_g ^ -1) == -6) {
                        var10.a(ta.field_e, 11, (byte) 114);
                        var10.a(i.field_g, 17, (byte) 85);
                        break L1;
                      } else {
                        var10.a(pe.field_h, -1, (byte) 124);
                        break L1;
                      }
                    }
                  }
                  if (param2.field_g == 3) {
                    var10.a(oc.field_c, 7, (byte) 80);
                    ((sd) this).a(10768, (lk) (Object) var10);
                    return;
                  } else {
                    if ((param2.field_g ^ -1) == -7) {
                      var10.a(da.field_c, 9, (byte) 93);
                      ((sd) this).a(10768, (lk) (Object) var10);
                      return;
                    } else {
                      ((sd) this).a(10768, (lk) (Object) var10);
                      return;
                    }
                  }
                }
              } else {
                var9 = new uc((sh) this, ne.field_v, var8);
                var5 = var9;
                if (param2.field_f) {
                  if (param2.field_a) {
                    ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
                    return;
                  } else {
                    wd discarded$20 = var9.a(pc.field_i, (sk) this, -4);
                    ((sd) this).a(10768, (lk) (Object) var9);
                    return;
                  }
                } else {
                  if (((sd) this).field_nb) {
                    wd discarded$21 = var9.a(pc.field_i, (sk) this, -4);
                    if (param2.field_g == 3) {
                      var9.a(oc.field_c, 7, (byte) 80);
                      ((sd) this).a(10768, (lk) (Object) var9);
                      return;
                    } else {
                      if ((param2.field_g ^ -1) != -7) {
                        ((sd) this).a(10768, (lk) (Object) var9);
                        return;
                      } else {
                        var9.a(da.field_c, 9, (byte) 93);
                        ((sd) this).a(10768, (lk) (Object) var9);
                        return;
                      }
                    }
                  } else {
                    if ((param2.field_g ^ -1) == -6) {
                      var9.a(ta.field_e, 11, (byte) 114);
                      var9.a(i.field_g, 17, (byte) 85);
                      if (param2.field_g == 3) {
                        var9.a(oc.field_c, 7, (byte) 80);
                        ((sd) this).a(10768, (lk) (Object) var9);
                        return;
                      } else {
                        if ((param2.field_g ^ -1) != -7) {
                          ((sd) this).a(10768, (lk) (Object) var9);
                          return;
                        } else {
                          var9.a(da.field_c, 9, (byte) 93);
                          ((sd) this).a(10768, (lk) (Object) var9);
                          return;
                        }
                      }
                    } else {
                      var9.a(pe.field_h, -1, (byte) 124);
                      if (param2.field_g == 3) {
                        var9.a(oc.field_c, 7, (byte) 80);
                        ((sd) this).a(10768, (lk) (Object) var9);
                        return;
                      } else {
                        if ((param2.field_g ^ -1) != -7) {
                          ((sd) this).a(10768, (lk) (Object) var9);
                          return;
                        } else {
                          var9.a(da.field_c, 9, (byte) 93);
                          ((sd) this).a(10768, (lk) (Object) var9);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          L2: {
            field_lb = 6;
            if (param2.field_f) {
              var4 = ha.field_k;
              break L2;
            } else {
              if (param2.field_d == null) {
                var4 = param2.field_c;
                if (param2.field_g != 248) {
                  break L2;
                } else {
                  L3: {
                    if (!param1) {
                      rg.b((byte) -128);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = ih.field_P;
                  ((sd) this).field_nb = true;
                  break L2;
                }
              } else {
                var4 = ma.field_n;
                if (((sd) this).field_kb == null) {
                  break L2;
                } else {
                  ((sd) this).field_kb.a(-3814);
                  break L2;
                }
              }
            }
          }
          var7 = new uc((sh) this, ne.field_v, var4);
          if (param2.field_f) {
            if (param2.field_a) {
              ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
              return;
            } else {
              wd discarded$22 = var7.a(pc.field_i, (sk) this, -4);
              ((sd) this).a(10768, (lk) (Object) var7);
              return;
            }
          } else {
            L4: {
              if (((sd) this).field_nb) {
                wd discarded$23 = var7.a(pc.field_i, (sk) this, -4);
                break L4;
              } else {
                if ((param2.field_g ^ -1) == -6) {
                  var7.a(ta.field_e, 11, (byte) 114);
                  var7.a(i.field_g, 17, (byte) 85);
                  break L4;
                } else {
                  var7.a(pe.field_h, -1, (byte) 124);
                  break L4;
                }
              }
            }
            if (param2.field_g == 3) {
              var7.a(oc.field_c, 7, (byte) 80);
              ((sd) this).a(10768, (lk) (Object) var7);
              return;
            } else {
              if ((param2.field_g ^ -1) == -7) {
                var7.a(da.field_c, 9, (byte) 93);
                ((sd) this).a(10768, (lk) (Object) var7);
                return;
              } else {
                ((sd) this).a(10768, (lk) (Object) var7);
                return;
              }
            }
          }
        }
    }

    final boolean e(byte param0) {
        rg var2 = null;
        if (param0 == 21) {
          if (((sd) this).field_D) {
            if (!((sd) this).field_ob) {
              var2 = jf.a(true);
              if (var2 == null) {
                return super.e((byte) 21);
              } else {
                this.a(-1, false, var2);
                return super.e((byte) 21);
              }
            } else {
              return super.e((byte) 21);
            }
          } else {
            return super.e((byte) 21);
          }
        } else {
          boolean discarded$6 = ((sd) this).e((byte) -34);
          if (((sd) this).field_D) {
            if (!((sd) this).field_ob) {
              var2 = jf.a(true);
              if (var2 == null) {
                return super.e((byte) 21);
              } else {
                this.a(-1, false, var2);
                return super.e((byte) 21);
              }
            } else {
              return super.e((byte) 21);
            }
          } else {
            return super.e((byte) 21);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = 250;
    }
}
