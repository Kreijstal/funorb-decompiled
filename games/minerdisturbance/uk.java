/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends rg implements sh {
    private boolean field_yb;
    private ik field_Ab;
    static bj field_xb;
    private boolean field_zb;

    final boolean n(int param0) {
        ed var2 = null;
        if (param0 == -4) {
          if (((uk) this).field_K) {
            if (!((uk) this).field_yb) {
              var2 = pa.a((byte) -107);
              if (var2 != null) {
                this.a(var2, 11, false);
                return super.n(-4);
              } else {
                return super.n(-4);
              }
            } else {
              return super.n(-4);
            }
          } else {
            return super.n(-4);
          }
        } else {
          return true;
        }
    }

    uk(hm param0, ik param1) {
        super(param0, cn.field_g, vh.field_e, false, false);
        ((uk) this).field_Ab = param1;
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        if (param1 == 6) {
          if (((uk) this).field_zb) {
            ie.a(false, true, -84);
            return;
          } else {
            pb.d(25);
            ((uk) this).s(param1 ^ 2121798);
            return;
          }
        } else {
          field_xb = null;
          if (((uk) this).field_zb) {
            ie.a(false, true, -84);
            return;
          } else {
            pb.d(25);
            ((uk) this).s(param1 ^ 2121798);
            return;
          }
        }
    }

    public static void j(byte param0) {
        field_xb = null;
        if (param0 != -42) {
            uk.j((byte) -31);
        }
    }

    private final void a(ed param0, int param1, boolean param2) {
        String var4 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        fm var9 = null;
        fm var10 = null;
        L0: {
          var6 = MinerDisturbance.field_ab;
          ((uk) this).field_yb = true;
          if (!param0.field_c) {
            if (param0.field_d != null) {
              var4 = hm.field_L;
              if (((uk) this).field_Ab != null) {
                ((uk) this).field_Ab.a((byte) 47);
                break L0;
              } else {
                break L0;
              }
            } else {
              var8 = param0.field_h;
              if (param0.field_e == 248) {
                L1: {
                  if (!param2) {
                    h.a(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4 = gn.field_c;
                ((uk) this).field_zb = true;
                break L0;
              } else {
                var9 = new fm((rg) this, cn.field_g, var8);
                if (param0.field_c) {
                  if (param0.field_i) {
                    ((uk) this).a((byte) -53, (fe) (Object) new ba((uk) this));
                    return;
                  } else {
                    hc discarded$4 = var9.a(oh.field_A, 53, (rm) this);
                    ((uk) this).a((byte) -99, (fe) (Object) var9);
                    if (param1 != 11) {
                      var7 = null;
                      this.a((ed) null, -124, true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!((uk) this).field_zb) {
                    if (5 != param0.field_e) {
                      L2: {
                        var9.a(-1, hk.field_d, param1 ^ -107);
                        if (-4 != (param0.field_e ^ -1)) {
                          if ((param0.field_e ^ -1) == -7) {
                            var9.a(9, gj.field_b, param1 ^ -115);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var9.a(7, wb.field_q, -77);
                          break L2;
                        }
                      }
                      L3: {
                        ((uk) this).a((byte) -99, (fe) (Object) var9);
                        if (param1 == 11) {
                          break L3;
                        } else {
                          var7 = null;
                          this.a((ed) null, -124, true);
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        var9.a(11, pc.field_i, -56);
                        var9.a(17, o.field_b, -117);
                        if (-4 != (param0.field_e ^ -1)) {
                          if ((param0.field_e ^ -1) == -7) {
                            var9.a(9, gj.field_b, param1 ^ -115);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          var9.a(7, wb.field_q, -77);
                          break L4;
                        }
                      }
                      L5: {
                        ((uk) this).a((byte) -99, (fe) (Object) var9);
                        if (param1 == 11) {
                          break L5;
                        } else {
                          var7 = null;
                          this.a((ed) null, -124, true);
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    hc discarded$5 = var9.a(oh.field_A, 82, (rm) this);
                    if (-4 != (param0.field_e ^ -1)) {
                      if ((param0.field_e ^ -1) != -7) {
                        L6: {
                          ((uk) this).a((byte) -99, (fe) (Object) var9);
                          if (param1 == 11) {
                            break L6;
                          } else {
                            var7 = null;
                            this.a((ed) null, -124, true);
                            break L6;
                          }
                        }
                        return;
                      } else {
                        L7: {
                          var9.a(9, gj.field_b, param1 ^ -115);
                          ((uk) this).a((byte) -99, (fe) (Object) var9);
                          if (param1 == 11) {
                            break L7;
                          } else {
                            var7 = null;
                            this.a((ed) null, -124, true);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        var9.a(7, wb.field_q, -77);
                        ((uk) this).a((byte) -99, (fe) (Object) var9);
                        if (param1 == 11) {
                          break L8;
                        } else {
                          var7 = null;
                          this.a((ed) null, -124, true);
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var4 = he.field_d;
            break L0;
          }
        }
        var10 = new fm((rg) this, cn.field_g, var4);
        if (param0.field_c) {
          if (param0.field_i) {
            ((uk) this).a((byte) -53, (fe) (Object) new ba((uk) this));
            return;
          } else {
            hc discarded$6 = var10.a(oh.field_A, 53, (rm) this);
            ((uk) this).a((byte) -99, (fe) (Object) var10);
            if (param1 == 11) {
              return;
            } else {
              var7 = null;
              this.a((ed) null, -124, true);
              return;
            }
          }
        } else {
          if (!((uk) this).field_zb) {
            if (5 == param0.field_e) {
              var10.a(11, pc.field_i, -56);
              var10.a(17, o.field_b, -117);
              if (-4 != (param0.field_e ^ -1)) {
                if ((param0.field_e ^ -1) != -7) {
                  L9: {
                    ((uk) this).a((byte) -99, (fe) (Object) var10);
                    if (param1 == 11) {
                      break L9;
                    } else {
                      var7 = null;
                      this.a((ed) null, -124, true);
                      break L9;
                    }
                  }
                  return;
                } else {
                  L10: {
                    var10.a(9, gj.field_b, param1 ^ -115);
                    ((uk) this).a((byte) -99, (fe) (Object) var10);
                    if (param1 == 11) {
                      break L10;
                    } else {
                      var7 = null;
                      this.a((ed) null, -124, true);
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                var10.a(7, wb.field_q, -77);
                ((uk) this).a((byte) -99, (fe) (Object) var10);
                if (param1 != 11) {
                  var7 = null;
                  this.a((ed) null, -124, true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L11: {
                var10.a(-1, hk.field_d, param1 ^ -107);
                if (-4 != (param0.field_e ^ -1)) {
                  if ((param0.field_e ^ -1) == -7) {
                    var10.a(9, gj.field_b, param1 ^ -115);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  var10.a(7, wb.field_q, -77);
                  break L11;
                }
              }
              ((uk) this).a((byte) -99, (fe) (Object) var10);
              if (param1 == 11) {
                return;
              } else {
                var7 = null;
                this.a((ed) null, -124, true);
                return;
              }
            }
          } else {
            hc discarded$7 = var10.a(oh.field_A, 82, (rm) this);
            if (-4 != (param0.field_e ^ -1)) {
              if ((param0.field_e ^ -1) == -7) {
                var10.a(9, gj.field_b, param1 ^ -115);
                ((uk) this).a((byte) -99, (fe) (Object) var10);
                if (param1 == 11) {
                  return;
                } else {
                  var7 = null;
                  this.a((ed) null, -124, true);
                  return;
                }
              } else {
                ((uk) this).a((byte) -99, (fe) (Object) var10);
                if (param1 != 11) {
                  var7 = null;
                  this.a((ed) null, -124, true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              var10.a(7, wb.field_q, -77);
              ((uk) this).a((byte) -99, (fe) (Object) var10);
              if (param1 != 11) {
                var7 = null;
                this.a((ed) null, -124, true);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void t(int param0) {
        this.a(ij.a(248, gn.field_c, true), 11, true);
        if (param0 != 23101) {
            ((uk) this).field_yb = true;
        }
    }

    static {
    }
}
