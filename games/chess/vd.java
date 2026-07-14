/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends vn implements mj {
    private boolean field_Hb;
    private ol field_Ib;
    private boolean field_Jb;
    static String field_Gb;

    final static boolean p(int param0) {
        if (param0 <= -36) {
          if (10 <= rm.field_Q) {
            if (-14 < (il.field_a ^ -1)) {
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

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        if (param4 == -24221) {
          if (((vd) this).field_Jb) {
            in.a((byte) 95, false, true);
            return;
          } else {
            ij.a(-128);
            ((vd) this).k((byte) -114);
            return;
          }
        } else {
          ((vd) this).field_Ib = null;
          if (((vd) this).field_Jb) {
            in.a((byte) 95, false, true);
            return;
          } else {
            ij.a(-128);
            ((vd) this).k((byte) -114);
            return;
          }
        }
    }

    private final void a(boolean param0, aj param1, int param2) {
        String var4 = null;
        e var5 = null;
        int var6 = 0;
        String var7 = null;
        e var8 = null;
        String var9 = null;
        e var10 = null;
        String var11 = null;
        e var12 = null;
        e var13 = null;
        var6 = Chess.field_G;
        if (param2 == -1) {
          ((vd) this).field_Hb = true;
          if (!param1.field_h) {
            L0: {
              if (param1.field_a != null) {
                var11 = eg.field_g;
                var4 = var11;
                if (null != ((vd) this).field_Ib) {
                  ((vd) this).field_Ib.a(120);
                  break L0;
                } else {
                  var12 = new e((vn) this, tk.field_a, var11);
                  var5 = var12;
                  if (!param1.field_h) {
                    if (!((vd) this).field_Jb) {
                      if (5 != param1.field_g) {
                        var12.a(-1, 114, fa.field_k);
                        if (param1.field_g != 3) {
                          if (param1.field_g == 6) {
                            var12.a(9, 124, gg.field_e);
                            ((vd) this).c((mf) (Object) var12, 108);
                            return;
                          } else {
                            ((vd) this).c((mf) (Object) var12, 108);
                            return;
                          }
                        } else {
                          var12.a(7, 30, ki.field_Q);
                          ((vd) this).c((mf) (Object) var12, 108);
                          return;
                        }
                      } else {
                        var12.a(11, 67, vi.field_a);
                        var12.a(17, 39, sn.field_b);
                        if (param1.field_g != 3) {
                          if (param1.field_g == 6) {
                            var12.a(9, 124, gg.field_e);
                            ((vd) this).c((mf) (Object) var12, 108);
                            return;
                          } else {
                            ((vd) this).c((mf) (Object) var12, 108);
                            return;
                          }
                        } else {
                          var12.a(7, 30, ki.field_Q);
                          ((vd) this).c((mf) (Object) var12, 108);
                          return;
                        }
                      }
                    } else {
                      fb discarded$8 = var12.a((byte) -114, (rg) this, sg.field_e);
                      if (param1.field_g != 3) {
                        if (param1.field_g == 6) {
                          var12.a(9, 124, gg.field_e);
                          ((vd) this).c((mf) (Object) var12, 108);
                          return;
                        } else {
                          ((vd) this).c((mf) (Object) var12, 108);
                          return;
                        }
                      } else {
                        var12.a(7, 30, ki.field_Q);
                        ((vd) this).c((mf) (Object) var12, 108);
                        return;
                      }
                    }
                  } else {
                    if (param1.field_f) {
                      ((vd) this).c((mf) (Object) new ba((vd) this), param2 ^ -101);
                      return;
                    } else {
                      fb discarded$9 = var12.a((byte) -114, (rg) this, sg.field_e);
                      ((vd) this).c((mf) (Object) var12, 108);
                      return;
                    }
                  }
                }
              } else {
                var4 = param1.field_e;
                if (param1.field_g != 248) {
                  break L0;
                } else {
                  L1: {
                    if (!param0) {
                      ln.f((byte) -74);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var9 = nj.field_z;
                  ((vd) this).field_Jb = true;
                  var10 = new e((vn) this, tk.field_a, var9);
                  var5 = var10;
                  if (!param1.field_h) {
                    if (!((vd) this).field_Jb) {
                      if (5 != param1.field_g) {
                        var10.a(-1, 114, fa.field_k);
                        if (param1.field_g != 3) {
                          if (param1.field_g == 6) {
                            var10.a(9, 124, gg.field_e);
                            ((vd) this).c((mf) (Object) var10, 108);
                            return;
                          } else {
                            ((vd) this).c((mf) (Object) var10, 108);
                            return;
                          }
                        } else {
                          var10.a(7, 30, ki.field_Q);
                          ((vd) this).c((mf) (Object) var10, 108);
                          return;
                        }
                      } else {
                        var10.a(11, 67, vi.field_a);
                        var10.a(17, 39, sn.field_b);
                        if (param1.field_g != 3) {
                          if (param1.field_g == 6) {
                            var10.a(9, 124, gg.field_e);
                            ((vd) this).c((mf) (Object) var10, 108);
                            return;
                          } else {
                            ((vd) this).c((mf) (Object) var10, 108);
                            return;
                          }
                        } else {
                          var10.a(7, 30, ki.field_Q);
                          ((vd) this).c((mf) (Object) var10, 108);
                          return;
                        }
                      }
                    } else {
                      fb discarded$10 = var10.a((byte) -114, (rg) this, sg.field_e);
                      if (param1.field_g != 3) {
                        if (param1.field_g == 6) {
                          var10.a(9, 124, gg.field_e);
                          ((vd) this).c((mf) (Object) var10, 108);
                          return;
                        } else {
                          ((vd) this).c((mf) (Object) var10, 108);
                          return;
                        }
                      } else {
                        var10.a(7, 30, ki.field_Q);
                        ((vd) this).c((mf) (Object) var10, 108);
                        return;
                      }
                    }
                  } else {
                    if (param1.field_f) {
                      ((vd) this).c((mf) (Object) new ba((vd) this), param2 ^ -101);
                      return;
                    } else {
                      fb discarded$11 = var10.a((byte) -114, (rg) this, sg.field_e);
                      ((vd) this).c((mf) (Object) var10, 108);
                      return;
                    }
                  }
                }
              }
            }
            var13 = new e((vn) this, tk.field_a, var4);
            if (!param1.field_h) {
              if (!((vd) this).field_Jb) {
                if (5 != param1.field_g) {
                  var13.a(-1, 114, fa.field_k);
                  if (param1.field_g != 3) {
                    if (param1.field_g == 6) {
                      var13.a(9, 124, gg.field_e);
                      ((vd) this).c((mf) (Object) var13, 108);
                      return;
                    } else {
                      ((vd) this).c((mf) (Object) var13, 108);
                      return;
                    }
                  } else {
                    var13.a(7, 30, ki.field_Q);
                    ((vd) this).c((mf) (Object) var13, 108);
                    return;
                  }
                } else {
                  var13.a(11, 67, vi.field_a);
                  var13.a(17, 39, sn.field_b);
                  if (param1.field_g != 3) {
                    if (param1.field_g == 6) {
                      var13.a(9, 124, gg.field_e);
                      ((vd) this).c((mf) (Object) var13, 108);
                      return;
                    } else {
                      ((vd) this).c((mf) (Object) var13, 108);
                      return;
                    }
                  } else {
                    var13.a(7, 30, ki.field_Q);
                    ((vd) this).c((mf) (Object) var13, 108);
                    return;
                  }
                }
              } else {
                fb discarded$12 = var13.a((byte) -114, (rg) this, sg.field_e);
                if (param1.field_g != 3) {
                  if (param1.field_g == 6) {
                    var13.a(9, 124, gg.field_e);
                    ((vd) this).c((mf) (Object) var13, 108);
                    return;
                  } else {
                    ((vd) this).c((mf) (Object) var13, 108);
                    return;
                  }
                } else {
                  var13.a(7, 30, ki.field_Q);
                  ((vd) this).c((mf) (Object) var13, 108);
                  return;
                }
              }
            } else {
              if (param1.field_f) {
                ((vd) this).c((mf) (Object) new ba((vd) this), param2 ^ -101);
                return;
              } else {
                fb discarded$13 = var13.a((byte) -114, (rg) this, sg.field_e);
                ((vd) this).c((mf) (Object) var13, 108);
                return;
              }
            }
          } else {
            var7 = ge.field_db;
            var8 = new e((vn) this, tk.field_a, var7);
            if (!param1.field_h) {
              L2: {
                if (!((vd) this).field_Jb) {
                  if (5 != param1.field_g) {
                    var8.a(-1, 114, fa.field_k);
                    break L2;
                  } else {
                    var8.a(11, 67, vi.field_a);
                    var8.a(17, 39, sn.field_b);
                    break L2;
                  }
                } else {
                  fb discarded$14 = var8.a((byte) -114, (rg) this, sg.field_e);
                  break L2;
                }
              }
              if (param1.field_g != 3) {
                if (param1.field_g == 6) {
                  var8.a(9, 124, gg.field_e);
                  ((vd) this).c((mf) (Object) var8, 108);
                  return;
                } else {
                  ((vd) this).c((mf) (Object) var8, 108);
                  return;
                }
              } else {
                var8.a(7, 30, ki.field_Q);
                ((vd) this).c((mf) (Object) var8, 108);
                return;
              }
            } else {
              if (param1.field_f) {
                ((vd) this).c((mf) (Object) new ba((vd) this), param2 ^ -101);
                return;
              } else {
                fb discarded$15 = var8.a((byte) -114, (rg) this, sg.field_e);
                ((vd) this).c((mf) (Object) var8, 108);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    vd(fm param0, ol param1) {
        super(param0, tk.field_a, ka.field_e, false, false);
        ((vd) this).field_Ib = param1;
    }

    final boolean g(byte param0) {
        aj var2 = null;
        if (param0 <= -4) {
          if (((vd) this).field_P) {
            if (!((vd) this).field_Hb) {
              var2 = ik.b(6792);
              if (var2 == null) {
                return super.g((byte) -90);
              } else {
                this.a(false, var2, -1);
                return super.g((byte) -90);
              }
            } else {
              return super.g((byte) -90);
            }
          } else {
            return super.g((byte) -90);
          }
        } else {
          vd.l((byte) -32);
          if (((vd) this).field_P) {
            if (!((vd) this).field_Hb) {
              var2 = ik.b(6792);
              if (var2 == null) {
                return super.g((byte) -90);
              } else {
                this.a(false, var2, -1);
                return super.g((byte) -90);
              }
            } else {
              return super.g((byte) -90);
            }
          } else {
            return super.g((byte) -90);
          }
        }
    }

    public static void l(byte param0) {
        int var1 = 57 % ((-49 - param0) / 44);
        field_Gb = null;
    }

    final void o(int param0) {
        this.a(true, sc.a(nj.field_z, 248, (byte) -92), -1);
        if (param0 != -10896) {
            ((vd) this).field_Jb = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
