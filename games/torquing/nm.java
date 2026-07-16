/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends mn implements ng {
    private boolean field_gb;
    private boolean field_hb;
    private ki field_ib;

    nm(ln param0, ki param1) {
        super(param0, pe.field_E, po.field_y, false, false);
        ((nm) this).field_ib = param1;
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param0 < -85) {
          if (((nm) this).field_gb) {
            ea.a(false, (byte) 126, true);
            return;
          } else {
            m.c(-103);
            ((nm) this).b(true);
            return;
          }
        } else {
          var7 = null;
          ((nm) this).a((byte) 95, (lg) null, 85, -55, 97);
          if (((nm) this).field_gb) {
            ea.a(false, (byte) 126, true);
            return;
          } else {
            m.c(-103);
            ((nm) this).b(true);
            return;
          }
        }
    }

    final void o(int param0) {
        if (param0 != 11) {
            return;
        }
        this.a(true, pg.a(248, a.field_a, -1), (byte) -117);
    }

    final boolean h(int param0) {
        dn var2 = null;
        Object var3 = null;
        if (((nm) this).field_D) {
          if (!((nm) this).field_hb) {
            var2 = ji.a(false);
            if (var2 != null) {
              this.a(false, var2, (byte) -110);
              if (param0 != -7) {
                var3 = null;
                this.a(true, (dn) null, (byte) 100);
                return super.h(-7);
              } else {
                return super.h(-7);
              }
            } else {
              if (param0 != -7) {
                var3 = null;
                this.a(true, (dn) null, (byte) 100);
                return super.h(-7);
              } else {
                return super.h(-7);
              }
            }
          } else {
            if (param0 != -7) {
              var3 = null;
              this.a(true, (dn) null, (byte) 100);
              return super.h(-7);
            } else {
              return super.h(-7);
            }
          }
        } else {
          if (param0 != -7) {
            var3 = null;
            this.a(true, (dn) null, (byte) 100);
            return super.h(-7);
          } else {
            return super.h(-7);
          }
        }
    }

    private final void a(boolean param0, dn param1, byte param2) {
        String var4 = null;
        fo var5 = null;
        int var6 = 0;
        String var7 = null;
        fo var8 = null;
        String var9 = null;
        fo var10 = null;
        String var11 = null;
        fo var12 = null;
        fo var13 = null;
        fo var14 = null;
        L0: {
          var6 = Torquing.field_u;
          ((nm) this).field_hb = true;
          if (param1.field_b) {
            var4 = d.field_q;
            break L0;
          } else {
            if (null != param1.field_d) {
              var11 = s.field_u;
              if (null != ((nm) this).field_ib) {
                L1: {
                  ((nm) this).field_ib.a((byte) 121);
                  var13 = new fo((mn) this, pe.field_E, var11);
                  var5 = var13;
                  if (param2 < -102) {
                    break L1;
                  } else {
                    ((nm) this).field_ib = null;
                    break L1;
                  }
                }
                if (param1.field_b) {
                  if (!param1.field_g) {
                    lg discarded$16 = var13.a(0, vd.field_d, (ca) this);
                    ((nm) this).c((gm) (Object) var13, 33);
                    return;
                  } else {
                    ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                    return;
                  }
                } else {
                  if (!((nm) this).field_gb) {
                    if (param1.field_a == 5) {
                      var13.a(kl.field_n, 5177, 11);
                      var13.a(pf.field_q, 5177, 17);
                      if ((param1.field_a ^ -1) != -4) {
                        if (-7 != (param1.field_a ^ -1)) {
                          ((nm) this).c((gm) (Object) var13, 33);
                          return;
                        } else {
                          var13.a(pf.field_u, 5177, 9);
                          ((nm) this).c((gm) (Object) var13, 33);
                          return;
                        }
                      } else {
                        var13.a(dc.field_b, 5177, 7);
                        ((nm) this).c((gm) (Object) var13, 33);
                        return;
                      }
                    } else {
                      var13.a(qh.field_a, 5177, -1);
                      if ((param1.field_a ^ -1) != -4) {
                        if (-7 != (param1.field_a ^ -1)) {
                          ((nm) this).c((gm) (Object) var13, 33);
                          return;
                        } else {
                          var13.a(pf.field_u, 5177, 9);
                          ((nm) this).c((gm) (Object) var13, 33);
                          return;
                        }
                      } else {
                        var13.a(dc.field_b, 5177, 7);
                        ((nm) this).c((gm) (Object) var13, 33);
                        return;
                      }
                    }
                  } else {
                    lg discarded$17 = var13.a(0, vd.field_d, (ca) this);
                    if ((param1.field_a ^ -1) != -4) {
                      if (-7 != (param1.field_a ^ -1)) {
                        ((nm) this).c((gm) (Object) var13, 33);
                        return;
                      } else {
                        var13.a(pf.field_u, 5177, 9);
                        ((nm) this).c((gm) (Object) var13, 33);
                        return;
                      }
                    } else {
                      var13.a(dc.field_b, 5177, 7);
                      ((nm) this).c((gm) (Object) var13, 33);
                      return;
                    }
                  }
                }
              } else {
                var12 = new fo((mn) this, pe.field_E, var11);
                var5 = var12;
                if (param2 < -102) {
                  if (param1.field_b) {
                    if (!param1.field_g) {
                      lg discarded$18 = var12.a(0, vd.field_d, (ca) this);
                      ((nm) this).c((gm) (Object) var12, 33);
                      return;
                    } else {
                      ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                      return;
                    }
                  } else {
                    if (!((nm) this).field_gb) {
                      if (param1.field_a == 5) {
                        var12.a(kl.field_n, 5177, 11);
                        var12.a(pf.field_q, 5177, 17);
                        if ((param1.field_a ^ -1) != -4) {
                          if (-7 != (param1.field_a ^ -1)) {
                            ((nm) this).c((gm) (Object) var12, 33);
                            return;
                          } else {
                            var12.a(pf.field_u, 5177, 9);
                            ((nm) this).c((gm) (Object) var12, 33);
                            return;
                          }
                        } else {
                          var12.a(dc.field_b, 5177, 7);
                          ((nm) this).c((gm) (Object) var12, 33);
                          return;
                        }
                      } else {
                        var12.a(qh.field_a, 5177, -1);
                        if ((param1.field_a ^ -1) != -4) {
                          if (-7 != (param1.field_a ^ -1)) {
                            ((nm) this).c((gm) (Object) var12, 33);
                            return;
                          } else {
                            var12.a(pf.field_u, 5177, 9);
                            ((nm) this).c((gm) (Object) var12, 33);
                            return;
                          }
                        } else {
                          var12.a(dc.field_b, 5177, 7);
                          ((nm) this).c((gm) (Object) var12, 33);
                          return;
                        }
                      }
                    } else {
                      lg discarded$19 = var12.a(0, vd.field_d, (ca) this);
                      if ((param1.field_a ^ -1) != -4) {
                        if (-7 != (param1.field_a ^ -1)) {
                          ((nm) this).c((gm) (Object) var12, 33);
                          return;
                        } else {
                          var12.a(pf.field_u, 5177, 9);
                          ((nm) this).c((gm) (Object) var12, 33);
                          return;
                        }
                      } else {
                        var12.a(dc.field_b, 5177, 7);
                        ((nm) this).c((gm) (Object) var12, 33);
                        return;
                      }
                    }
                  }
                } else {
                  ((nm) this).field_ib = null;
                  if (param1.field_b) {
                    if (!param1.field_g) {
                      lg discarded$20 = var12.a(0, vd.field_d, (ca) this);
                      ((nm) this).c((gm) (Object) var12, 33);
                      return;
                    } else {
                      ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                      return;
                    }
                  } else {
                    L2: {
                      if (!((nm) this).field_gb) {
                        if (param1.field_a == 5) {
                          var12.a(kl.field_n, 5177, 11);
                          var12.a(pf.field_q, 5177, 17);
                          break L2;
                        } else {
                          var12.a(qh.field_a, 5177, -1);
                          break L2;
                        }
                      } else {
                        lg discarded$21 = var12.a(0, vd.field_d, (ca) this);
                        break L2;
                      }
                    }
                    if ((param1.field_a ^ -1) != -4) {
                      if (-7 != (param1.field_a ^ -1)) {
                        ((nm) this).c((gm) (Object) var12, 33);
                        return;
                      } else {
                        var12.a(pf.field_u, 5177, 9);
                        ((nm) this).c((gm) (Object) var12, 33);
                        return;
                      }
                    } else {
                      var12.a(dc.field_b, 5177, 7);
                      ((nm) this).c((gm) (Object) var12, 33);
                      return;
                    }
                  }
                }
              }
            } else {
              var7 = param1.field_e;
              if ((param1.field_a ^ -1) == -249) {
                if (param0) {
                  ((nm) this).field_gb = true;
                  var4 = a.field_a;
                  break L0;
                } else {
                  id.a((byte) 57);
                  L3: {
                    ((nm) this).field_gb = true;
                    var9 = a.field_a;
                    var10 = new fo((mn) this, pe.field_E, var9);
                    if (param2 < -102) {
                      break L3;
                    } else {
                      ((nm) this).field_ib = null;
                      break L3;
                    }
                  }
                  if (param1.field_b) {
                    if (!param1.field_g) {
                      lg discarded$22 = var10.a(0, vd.field_d, (ca) this);
                      ((nm) this).c((gm) (Object) var10, 33);
                      return;
                    } else {
                      ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                      return;
                    }
                  } else {
                    L4: {
                      if (!((nm) this).field_gb) {
                        if (param1.field_a == 5) {
                          var10.a(kl.field_n, 5177, 11);
                          var10.a(pf.field_q, 5177, 17);
                          break L4;
                        } else {
                          var10.a(qh.field_a, 5177, -1);
                          break L4;
                        }
                      } else {
                        lg discarded$23 = var10.a(0, vd.field_d, (ca) this);
                        break L4;
                      }
                    }
                    if ((param1.field_a ^ -1) != -4) {
                      if (-7 != (param1.field_a ^ -1)) {
                        ((nm) this).c((gm) (Object) var10, 33);
                        return;
                      } else {
                        var10.a(pf.field_u, 5177, 9);
                        ((nm) this).c((gm) (Object) var10, 33);
                        return;
                      }
                    } else {
                      var10.a(dc.field_b, 5177, 7);
                      ((nm) this).c((gm) (Object) var10, 33);
                      return;
                    }
                  }
                }
              } else {
                var8 = new fo((mn) this, pe.field_E, var7);
                var5 = var8;
                if (param2 < -102) {
                  if (param1.field_b) {
                    if (!param1.field_g) {
                      lg discarded$24 = var8.a(0, vd.field_d, (ca) this);
                      ((nm) this).c((gm) (Object) var8, 33);
                      return;
                    } else {
                      ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                      return;
                    }
                  } else {
                    if (!((nm) this).field_gb) {
                      if (param1.field_a == 5) {
                        var8.a(kl.field_n, 5177, 11);
                        var8.a(pf.field_q, 5177, 17);
                        if ((param1.field_a ^ -1) != -4) {
                          if (-7 != (param1.field_a ^ -1)) {
                            ((nm) this).c((gm) (Object) var8, 33);
                            return;
                          } else {
                            var8.a(pf.field_u, 5177, 9);
                            ((nm) this).c((gm) (Object) var8, 33);
                            return;
                          }
                        } else {
                          var8.a(dc.field_b, 5177, 7);
                          ((nm) this).c((gm) (Object) var8, 33);
                          return;
                        }
                      } else {
                        var8.a(qh.field_a, 5177, -1);
                        if ((param1.field_a ^ -1) != -4) {
                          if (-7 != (param1.field_a ^ -1)) {
                            ((nm) this).c((gm) (Object) var8, 33);
                            return;
                          } else {
                            var8.a(pf.field_u, 5177, 9);
                            ((nm) this).c((gm) (Object) var8, 33);
                            return;
                          }
                        } else {
                          var8.a(dc.field_b, 5177, 7);
                          ((nm) this).c((gm) (Object) var8, 33);
                          return;
                        }
                      }
                    } else {
                      lg discarded$25 = var8.a(0, vd.field_d, (ca) this);
                      if ((param1.field_a ^ -1) != -4) {
                        if (-7 != (param1.field_a ^ -1)) {
                          ((nm) this).c((gm) (Object) var8, 33);
                          return;
                        } else {
                          var8.a(pf.field_u, 5177, 9);
                          ((nm) this).c((gm) (Object) var8, 33);
                          return;
                        }
                      } else {
                        var8.a(dc.field_b, 5177, 7);
                        ((nm) this).c((gm) (Object) var8, 33);
                        return;
                      }
                    }
                  }
                } else {
                  ((nm) this).field_ib = null;
                  if (param1.field_b) {
                    if (!param1.field_g) {
                      lg discarded$26 = var8.a(0, vd.field_d, (ca) this);
                      ((nm) this).c((gm) (Object) var8, 33);
                      return;
                    } else {
                      ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                      return;
                    }
                  } else {
                    L5: {
                      if (!((nm) this).field_gb) {
                        if (param1.field_a == 5) {
                          var8.a(kl.field_n, 5177, 11);
                          var8.a(pf.field_q, 5177, 17);
                          break L5;
                        } else {
                          var8.a(qh.field_a, 5177, -1);
                          break L5;
                        }
                      } else {
                        lg discarded$27 = var8.a(0, vd.field_d, (ca) this);
                        break L5;
                      }
                    }
                    if ((param1.field_a ^ -1) != -4) {
                      if (-7 != (param1.field_a ^ -1)) {
                        ((nm) this).c((gm) (Object) var8, 33);
                        return;
                      } else {
                        var8.a(pf.field_u, 5177, 9);
                        ((nm) this).c((gm) (Object) var8, 33);
                        return;
                      }
                    } else {
                      var8.a(dc.field_b, 5177, 7);
                      ((nm) this).c((gm) (Object) var8, 33);
                      return;
                    }
                  }
                }
              }
            }
          }
        }
        var14 = new fo((mn) this, pe.field_E, var4);
        var5 = var14;
        if (param2 < -102) {
          if (param1.field_b) {
            if (!param1.field_g) {
              lg discarded$28 = var14.a(0, vd.field_d, (ca) this);
              ((nm) this).c((gm) (Object) var14, 33);
              return;
            } else {
              ((nm) this).c((gm) (Object) new sc((nm) this), 33);
              return;
            }
          } else {
            if (!((nm) this).field_gb) {
              if (param1.field_a == 5) {
                var14.a(kl.field_n, 5177, 11);
                var14.a(pf.field_q, 5177, 17);
                if ((param1.field_a ^ -1) != -4) {
                  if (-7 != (param1.field_a ^ -1)) {
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  } else {
                    var14.a(pf.field_u, 5177, 9);
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  }
                } else {
                  var14.a(dc.field_b, 5177, 7);
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                }
              } else {
                var14.a(qh.field_a, 5177, -1);
                if ((param1.field_a ^ -1) != -4) {
                  if (-7 != (param1.field_a ^ -1)) {
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  } else {
                    var14.a(pf.field_u, 5177, 9);
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  }
                } else {
                  var14.a(dc.field_b, 5177, 7);
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                }
              }
            } else {
              lg discarded$29 = var14.a(0, vd.field_d, (ca) this);
              if ((param1.field_a ^ -1) != -4) {
                if (-7 != (param1.field_a ^ -1)) {
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                } else {
                  var14.a(pf.field_u, 5177, 9);
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                }
              } else {
                var14.a(dc.field_b, 5177, 7);
                ((nm) this).c((gm) (Object) var14, 33);
                return;
              }
            }
          }
        } else {
          ((nm) this).field_ib = null;
          if (param1.field_b) {
            if (!param1.field_g) {
              lg discarded$30 = var14.a(0, vd.field_d, (ca) this);
              ((nm) this).c((gm) (Object) var14, 33);
              return;
            } else {
              ((nm) this).c((gm) (Object) new sc((nm) this), 33);
              return;
            }
          } else {
            if (!((nm) this).field_gb) {
              if (param1.field_a == 5) {
                var14.a(kl.field_n, 5177, 11);
                var14.a(pf.field_q, 5177, 17);
                if ((param1.field_a ^ -1) != -4) {
                  if (-7 != (param1.field_a ^ -1)) {
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  } else {
                    var14.a(pf.field_u, 5177, 9);
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  }
                } else {
                  var14.a(dc.field_b, 5177, 7);
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                }
              } else {
                var14.a(qh.field_a, 5177, -1);
                if ((param1.field_a ^ -1) != -4) {
                  if (-7 != (param1.field_a ^ -1)) {
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  } else {
                    var14.a(pf.field_u, 5177, 9);
                    ((nm) this).c((gm) (Object) var14, 33);
                    return;
                  }
                } else {
                  var14.a(dc.field_b, 5177, 7);
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                }
              }
            } else {
              lg discarded$31 = var14.a(0, vd.field_d, (ca) this);
              if ((param1.field_a ^ -1) != -4) {
                if (-7 != (param1.field_a ^ -1)) {
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                } else {
                  var14.a(pf.field_u, 5177, 9);
                  ((nm) this).c((gm) (Object) var14, 33);
                  return;
                }
              } else {
                var14.a(dc.field_b, 5177, 7);
                ((nm) this).c((gm) (Object) var14, 33);
                return;
              }
            }
          }
        }
    }

    static {
    }
}
