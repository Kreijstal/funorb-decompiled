/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends sg implements hh {
    private boolean field_rb;
    static String field_wb;
    private fk field_sb;
    static String[] field_qb;
    private boolean field_ub;
    static vn field_vb;
    static vn field_tb;

    final static int a(boolean param0, String param1, String param2, int param3, byte param4, int param5, String param6) {
        int var9 = 49 / ((param4 - 61) / 57);
        ji var7 = new ji(param6);
        ji var8 = new ji(param1);
        return bg.a(105, param3, var7, param2, var8, param5, param0);
    }

    public static void n(int param0) {
        field_qb = null;
        if (param0 != 54) {
            return;
        }
        field_tb = null;
        field_wb = null;
        field_vb = null;
    }

    private final void a(boolean param0, eo param1, boolean param2) {
        String var4 = null;
        e var5 = null;
        int var6 = 0;
        String var7 = null;
        e var8 = null;
        e var9 = null;
        e var10 = null;
        e var11 = null;
        e var12 = null;
        L0: {
          var6 = ZombieDawn.field_J;
          if (!param0) {
            break L0;
          } else {
            md.n(-43);
            break L0;
          }
        }
        L1: {
          L2: {
            ((md) this).field_rb = true;
            if (param1.field_b) {
              break L2;
            } else {
              if (param1.field_g == null) {
                var4 = param1.field_e;
                if (248 != param1.field_a) {
                  break L1;
                } else {
                  if (param2) {
                    var4 = fm.field_E;
                    ((md) this).field_ub = true;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    L3: {
                      eo.a(true);
                      var4 = fm.field_E;
                      ((md) this).field_ub = true;
                      if (var6 == 0) {
                        break L3;
                      } else {
                        var4 = lg.field_j;
                        break L3;
                      }
                    }
                    var11 = new e((sg) this, rk.field_b, var4);
                    var5 = var11;
                    if (param1.field_b) {
                      if (!param1.field_d) {
                        an discarded$27 = var11.a(jb.field_c, 125, (sk) this);
                        ((md) this).b(20, (ga) (Object) var11);
                        return;
                      } else {
                        ((md) this).b(20, (ga) (Object) new fe((md) this));
                        return;
                      }
                    } else {
                      if (!((md) this).field_ub) {
                        if ((param1.field_a ^ -1) != -6) {
                          L4: {
                            var11.a((byte) 123, jk.field_g, -1);
                            if (-4 == param1.field_a) {
                              break L4;
                            } else {
                              if (-7 == param1.field_a) {
                                var11.a((byte) 122, di.field_I, 9);
                                break L4;
                              } else {
                                ((md) this).b(20, (ga) (Object) var11);
                                return;
                              }
                            }
                          }
                          var11.a((byte) 95, rf.field_b, 7);
                          if (!param1.field_d) {
                            an discarded$28 = var11.a(jb.field_c, 125, (sk) this);
                            ((md) this).b(20, (ga) (Object) var11);
                            return;
                          } else {
                            ((md) this).b(20, (ga) (Object) new fe((md) this));
                            return;
                          }
                        } else {
                          var11.a((byte) 106, te.field_R, 11);
                          var11.a((byte) 110, qd.field_d, 17);
                          L5: {
                            var11.a((byte) 123, jk.field_g, -1);
                            if (-4 == param1.field_a) {
                              break L5;
                            } else {
                              if (-7 == param1.field_a) {
                                var11.a((byte) 122, di.field_I, 9);
                                break L5;
                              } else {
                                ((md) this).b(20, (ga) (Object) var11);
                                return;
                              }
                            }
                          }
                          var11.a((byte) 95, rf.field_b, 7);
                          if (!param1.field_d) {
                            an discarded$29 = var11.a(jb.field_c, 125, (sk) this);
                            ((md) this).b(20, (ga) (Object) var11);
                            return;
                          } else {
                            ((md) this).b(20, (ga) (Object) new fe((md) this));
                            return;
                          }
                        }
                      } else {
                        an discarded$30 = var11.a(jb.field_c, 125, (sk) this);
                        if (var6 == 0) {
                          L6: {
                            if (-4 == param1.field_a) {
                              break L6;
                            } else {
                              if (-7 == param1.field_a) {
                                var11.a((byte) 122, di.field_I, 9);
                                if (var6 != 0) {
                                  break L6;
                                } else {
                                  ((md) this).b(20, (ga) (Object) var11);
                                  return;
                                }
                              } else {
                                ((md) this).b(20, (ga) (Object) var11);
                                return;
                              }
                            }
                          }
                          var11.a((byte) 95, rf.field_b, 7);
                          if (!param1.field_d) {
                            an discarded$31 = var11.a(jb.field_c, 125, (sk) this);
                            ((md) this).b(20, (ga) (Object) var11);
                            return;
                          } else {
                            ((md) this).b(20, (ga) (Object) new fe((md) this));
                            return;
                          }
                        } else {
                          L7: {
                            if ((param1.field_a ^ -1) != -6) {
                              var11.a((byte) 123, jk.field_g, -1);
                              break L7;
                            } else {
                              var11.a((byte) 106, te.field_R, 11);
                              var11.a((byte) 110, qd.field_d, 17);
                              var11.a((byte) 123, jk.field_g, -1);
                              break L7;
                            }
                          }
                          L8: {
                            if (-4 == param1.field_a) {
                              break L8;
                            } else {
                              if (-7 == param1.field_a) {
                                var11.a((byte) 122, di.field_I, 9);
                                break L8;
                              } else {
                                ((md) this).b(20, (ga) (Object) var11);
                                return;
                              }
                            }
                          }
                          var11.a((byte) 95, rf.field_b, 7);
                          if (!param1.field_d) {
                            an discarded$32 = var11.a(jb.field_c, 125, (sk) this);
                            ((md) this).b(20, (ga) (Object) var11);
                            return;
                          } else {
                            ((md) this).b(20, (ga) (Object) new fe((md) this));
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var7 = ma.field_i;
                if (null != ((md) this).field_sb) {
                  ((md) this).field_sb.a(-41);
                  if (var6 != 0) {
                    L9: {
                      var4 = param1.field_e;
                      if (248 != param1.field_a) {
                        break L9;
                      } else {
                        L10: {
                          if (param2) {
                            break L10;
                          } else {
                            eo.a(true);
                            break L10;
                          }
                        }
                        var4 = fm.field_E;
                        ((md) this).field_ub = true;
                        if (var6 == 0) {
                          break L9;
                        } else {
                          var4 = lg.field_j;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      var10 = new e((sg) this, rk.field_b, var4);
                      if (param1.field_b) {
                        break L11;
                      } else {
                        L12: {
                          L13: {
                            if (!((md) this).field_ub) {
                              break L13;
                            } else {
                              an discarded$33 = var10.a(jb.field_c, 125, (sk) this);
                              if (var6 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((param1.field_a ^ -1) != -6) {
                            var10.a((byte) 123, jk.field_g, -1);
                            break L12;
                          } else {
                            var10.a((byte) 106, te.field_R, 11);
                            var10.a((byte) 110, qd.field_d, 17);
                            var10.a((byte) 123, jk.field_g, -1);
                            break L12;
                          }
                        }
                        L14: {
                          if (-4 == param1.field_a) {
                            break L14;
                          } else {
                            if (-7 == param1.field_a) {
                              var10.a((byte) 122, di.field_I, 9);
                              if (var6 != 0) {
                                break L14;
                              } else {
                                ((md) this).b(20, (ga) (Object) var10);
                                return;
                              }
                            } else {
                              ((md) this).b(20, (ga) (Object) var10);
                              return;
                            }
                          }
                        }
                        var10.a((byte) 95, rf.field_b, 7);
                        break L11;
                      }
                    }
                    if (!param1.field_d) {
                      an discarded$34 = var10.a(jb.field_c, 125, (sk) this);
                      ((md) this).b(20, (ga) (Object) var10);
                      return;
                    } else {
                      ((md) this).b(20, (ga) (Object) new fe((md) this));
                      return;
                    }
                  } else {
                    var9 = new e((sg) this, rk.field_b, var7);
                    if (param1.field_b) {
                      if (!param1.field_d) {
                        an discarded$35 = var9.a(jb.field_c, 125, (sk) this);
                        ((md) this).b(20, (ga) (Object) var9);
                        return;
                      } else {
                        ((md) this).b(20, (ga) (Object) new fe((md) this));
                        return;
                      }
                    } else {
                      if (!((md) this).field_ub) {
                        if ((param1.field_a ^ -1) != -6) {
                          L15: {
                            var9.a((byte) 123, jk.field_g, -1);
                            if (-4 == param1.field_a) {
                              break L15;
                            } else {
                              if (-7 == param1.field_a) {
                                var9.a((byte) 122, di.field_I, 9);
                                if (var6 != 0) {
                                  break L15;
                                } else {
                                  ((md) this).b(20, (ga) (Object) var9);
                                  return;
                                }
                              } else {
                                ((md) this).b(20, (ga) (Object) var9);
                                return;
                              }
                            }
                          }
                          var9.a((byte) 95, rf.field_b, 7);
                          if (var6 != 0) {
                            if (!param1.field_d) {
                              an discarded$36 = var9.a(jb.field_c, 125, (sk) this);
                              ((md) this).b(20, (ga) (Object) var9);
                              return;
                            } else {
                              ((md) this).b(20, (ga) (Object) new fe((md) this));
                              return;
                            }
                          } else {
                            ((md) this).b(20, (ga) (Object) var9);
                            return;
                          }
                        } else {
                          var9.a((byte) 106, te.field_R, 11);
                          var9.a((byte) 110, qd.field_d, 17);
                          L16: {
                            var9.a((byte) 123, jk.field_g, -1);
                            if (-4 == param1.field_a) {
                              break L16;
                            } else {
                              if (-7 == param1.field_a) {
                                var9.a((byte) 122, di.field_I, 9);
                                if (var6 != 0) {
                                  break L16;
                                } else {
                                  ((md) this).b(20, (ga) (Object) var9);
                                  return;
                                }
                              } else {
                                ((md) this).b(20, (ga) (Object) var9);
                                return;
                              }
                            }
                          }
                          var9.a((byte) 95, rf.field_b, 7);
                          if (var6 != 0) {
                            if (!param1.field_d) {
                              an discarded$37 = var9.a(jb.field_c, 125, (sk) this);
                              ((md) this).b(20, (ga) (Object) var9);
                              return;
                            } else {
                              ((md) this).b(20, (ga) (Object) new fe((md) this));
                              return;
                            }
                          } else {
                            ((md) this).b(20, (ga) (Object) var9);
                            return;
                          }
                        }
                      } else {
                        an discarded$38 = var9.a(jb.field_c, 125, (sk) this);
                        if (var6 == 0) {
                          L17: {
                            if (-4 == param1.field_a) {
                              break L17;
                            } else {
                              if (-7 == param1.field_a) {
                                var9.a((byte) 122, di.field_I, 9);
                                if (var6 != 0) {
                                  break L17;
                                } else {
                                  ((md) this).b(20, (ga) (Object) var9);
                                  return;
                                }
                              } else {
                                ((md) this).b(20, (ga) (Object) var9);
                                return;
                              }
                            }
                          }
                          var9.a((byte) 95, rf.field_b, 7);
                          if (var6 != 0) {
                            if (!param1.field_d) {
                              an discarded$39 = var9.a(jb.field_c, 125, (sk) this);
                              ((md) this).b(20, (ga) (Object) var9);
                              return;
                            } else {
                              ((md) this).b(20, (ga) (Object) new fe((md) this));
                              return;
                            }
                          } else {
                            ((md) this).b(20, (ga) (Object) var9);
                            return;
                          }
                        } else {
                          L18: {
                            if ((param1.field_a ^ -1) != -6) {
                              var9.a((byte) 123, jk.field_g, -1);
                              break L18;
                            } else {
                              var9.a((byte) 106, te.field_R, 11);
                              var9.a((byte) 110, qd.field_d, 17);
                              var9.a((byte) 123, jk.field_g, -1);
                              break L18;
                            }
                          }
                          L19: {
                            if (-4 == param1.field_a) {
                              break L19;
                            } else {
                              if (-7 == param1.field_a) {
                                var9.a((byte) 122, di.field_I, 9);
                                break L19;
                              } else {
                                ((md) this).b(20, (ga) (Object) var9);
                                return;
                              }
                            }
                          }
                          var9.a((byte) 95, rf.field_b, 7);
                          if (!param1.field_d) {
                            an discarded$40 = var9.a(jb.field_c, 125, (sk) this);
                            ((md) this).b(20, (ga) (Object) var9);
                            return;
                          } else {
                            ((md) this).b(20, (ga) (Object) new fe((md) this));
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var8 = new e((sg) this, rk.field_b, var7);
                  if (param1.field_b) {
                    if (!param1.field_d) {
                      an discarded$41 = var8.a(jb.field_c, 125, (sk) this);
                      ((md) this).b(20, (ga) (Object) var8);
                      return;
                    } else {
                      ((md) this).b(20, (ga) (Object) new fe((md) this));
                      return;
                    }
                  } else {
                    if (!((md) this).field_ub) {
                      if ((param1.field_a ^ -1) != -6) {
                        L20: {
                          var8.a((byte) 123, jk.field_g, -1);
                          if (-4 == param1.field_a) {
                            break L20;
                          } else {
                            if (-7 == param1.field_a) {
                              var8.a((byte) 122, di.field_I, 9);
                              break L20;
                            } else {
                              ((md) this).b(20, (ga) (Object) var8);
                              return;
                            }
                          }
                        }
                        var8.a((byte) 95, rf.field_b, 7);
                        if (!param1.field_d) {
                          an discarded$42 = var8.a(jb.field_c, 125, (sk) this);
                          ((md) this).b(20, (ga) (Object) var8);
                          return;
                        } else {
                          ((md) this).b(20, (ga) (Object) new fe((md) this));
                          return;
                        }
                      } else {
                        var8.a((byte) 106, te.field_R, 11);
                        var8.a((byte) 110, qd.field_d, 17);
                        L21: {
                          var8.a((byte) 123, jk.field_g, -1);
                          if (-4 == param1.field_a) {
                            break L21;
                          } else {
                            if (-7 == param1.field_a) {
                              var8.a((byte) 122, di.field_I, 9);
                              if (var6 != 0) {
                                break L21;
                              } else {
                                ((md) this).b(20, (ga) (Object) var8);
                                return;
                              }
                            } else {
                              ((md) this).b(20, (ga) (Object) var8);
                              return;
                            }
                          }
                        }
                        var8.a((byte) 95, rf.field_b, 7);
                        if (!param1.field_d) {
                          an discarded$43 = var8.a(jb.field_c, 125, (sk) this);
                          ((md) this).b(20, (ga) (Object) var8);
                          return;
                        } else {
                          ((md) this).b(20, (ga) (Object) new fe((md) this));
                          return;
                        }
                      }
                    } else {
                      an discarded$44 = var8.a(jb.field_c, 125, (sk) this);
                      if (var6 == 0) {
                        L22: {
                          if (-4 == param1.field_a) {
                            break L22;
                          } else {
                            if (-7 == param1.field_a) {
                              var8.a((byte) 122, di.field_I, 9);
                              if (var6 != 0) {
                                break L22;
                              } else {
                                ((md) this).b(20, (ga) (Object) var8);
                                return;
                              }
                            } else {
                              ((md) this).b(20, (ga) (Object) var8);
                              return;
                            }
                          }
                        }
                        var8.a((byte) 95, rf.field_b, 7);
                        if (param1.field_d) {
                          ((md) this).b(20, (ga) (Object) new fe((md) this));
                          return;
                        } else {
                          an discarded$45 = var8.a(jb.field_c, 125, (sk) this);
                          ((md) this).b(20, (ga) (Object) var8);
                          return;
                        }
                      } else {
                        L23: {
                          if ((param1.field_a ^ -1) != -6) {
                            var8.a((byte) 123, jk.field_g, -1);
                            break L23;
                          } else {
                            var8.a((byte) 106, te.field_R, 11);
                            var8.a((byte) 110, qd.field_d, 17);
                            var8.a((byte) 123, jk.field_g, -1);
                            break L23;
                          }
                        }
                        L24: {
                          if (-4 == param1.field_a) {
                            break L24;
                          } else {
                            if (-7 == param1.field_a) {
                              var8.a((byte) 122, di.field_I, 9);
                              break L24;
                            } else {
                              ((md) this).b(20, (ga) (Object) var8);
                              return;
                            }
                          }
                        }
                        var8.a((byte) 95, rf.field_b, 7);
                        if (!param1.field_d) {
                          an discarded$46 = var8.a(jb.field_c, 125, (sk) this);
                          ((md) this).b(20, (ga) (Object) var8);
                          return;
                        } else {
                          ((md) this).b(20, (ga) (Object) new fe((md) this));
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          var4 = lg.field_j;
          break L1;
        }
        var12 = new e((sg) this, rk.field_b, var4);
        var5 = var12;
        if (param1.field_b) {
          if (!param1.field_d) {
            an discarded$47 = var12.a(jb.field_c, 125, (sk) this);
            ((md) this).b(20, (ga) (Object) var12);
            return;
          } else {
            ((md) this).b(20, (ga) (Object) new fe((md) this));
            return;
          }
        } else {
          L25: {
            if (!((md) this).field_ub) {
              if ((param1.field_a ^ -1) != -6) {
                L26: {
                  var12.a((byte) 123, jk.field_g, -1);
                  if (-4 == param1.field_a) {
                    break L26;
                  } else {
                    if (-7 == param1.field_a) {
                      var12.a((byte) 122, di.field_I, 9);
                      break L26;
                    } else {
                      ((md) this).b(20, (ga) (Object) var12);
                      return;
                    }
                  }
                }
                var12.a((byte) 95, rf.field_b, 7);
                if (!param1.field_d) {
                  an discarded$48 = var12.a(jb.field_c, 125, (sk) this);
                  ((md) this).b(20, (ga) (Object) var12);
                  return;
                } else {
                  ((md) this).b(20, (ga) (Object) new fe((md) this));
                  return;
                }
              } else {
                var12.a((byte) 106, te.field_R, 11);
                var12.a((byte) 110, qd.field_d, 17);
                if (var6 == 0) {
                  break L25;
                } else {
                  L27: {
                    var12.a((byte) 123, jk.field_g, -1);
                    if (-4 == param1.field_a) {
                      break L27;
                    } else {
                      if (-7 == param1.field_a) {
                        var12.a((byte) 122, di.field_I, 9);
                        break L27;
                      } else {
                        ((md) this).b(20, (ga) (Object) var12);
                        return;
                      }
                    }
                  }
                  var12.a((byte) 95, rf.field_b, 7);
                  if (!param1.field_d) {
                    an discarded$49 = var12.a(jb.field_c, 125, (sk) this);
                    ((md) this).b(20, (ga) (Object) var12);
                    return;
                  } else {
                    ((md) this).b(20, (ga) (Object) new fe((md) this));
                    return;
                  }
                }
              }
            } else {
              an discarded$50 = var12.a(jb.field_c, 125, (sk) this);
              if (var6 == 0) {
                break L25;
              } else {
                if ((param1.field_a ^ -1) != -6) {
                  L28: {
                    var12.a((byte) 123, jk.field_g, -1);
                    if (-4 == param1.field_a) {
                      break L28;
                    } else {
                      if (-7 == param1.field_a) {
                        var12.a((byte) 122, di.field_I, 9);
                        if (var6 != 0) {
                          break L28;
                        } else {
                          ((md) this).b(20, (ga) (Object) var12);
                          return;
                        }
                      } else {
                        ((md) this).b(20, (ga) (Object) var12);
                        return;
                      }
                    }
                  }
                  var12.a((byte) 95, rf.field_b, 7);
                  if (var6 != 0) {
                    if (!param1.field_d) {
                      an discarded$51 = var12.a(jb.field_c, 125, (sk) this);
                      ((md) this).b(20, (ga) (Object) var12);
                      return;
                    } else {
                      ((md) this).b(20, (ga) (Object) new fe((md) this));
                      return;
                    }
                  } else {
                    ((md) this).b(20, (ga) (Object) var12);
                    return;
                  }
                } else {
                  var12.a((byte) 106, te.field_R, 11);
                  var12.a((byte) 110, qd.field_d, 17);
                  L29: {
                    var12.a((byte) 123, jk.field_g, -1);
                    if (-4 == param1.field_a) {
                      break L29;
                    } else {
                      if (-7 == param1.field_a) {
                        var12.a((byte) 122, di.field_I, 9);
                        break L29;
                      } else {
                        ((md) this).b(20, (ga) (Object) var12);
                        return;
                      }
                    }
                  }
                  var12.a((byte) 95, rf.field_b, 7);
                  if (!param1.field_d) {
                    an discarded$52 = var12.a(jb.field_c, 125, (sk) this);
                    ((md) this).b(20, (ga) (Object) var12);
                    return;
                  } else {
                    ((md) this).b(20, (ga) (Object) new fe((md) this));
                    return;
                  }
                }
              }
            }
          }
          L30: {
            if (-4 == param1.field_a) {
              break L30;
            } else {
              if (-7 == param1.field_a) {
                var12.a((byte) 122, di.field_I, 9);
                if (var6 != 0) {
                  break L30;
                } else {
                  ((md) this).b(20, (ga) (Object) var12);
                  return;
                }
              } else {
                ((md) this).b(20, (ga) (Object) var12);
                return;
              }
            }
          }
          var12.a((byte) 95, rf.field_b, 7);
          if (param1.field_d) {
            ((md) this).b(20, (ga) (Object) new fe((md) this));
            return;
          } else {
            an discarded$53 = var12.a(jb.field_c, 125, (sk) this);
            ((md) this).b(20, (ga) (Object) var12);
            return;
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = 0;
        var4 = 255;
        var3 = var3 | (var4 & param1[param0 * 4]) << -1013987752;
        var3 = var3 | (var4 & param1[1 + param0 * 4]) << 1364809232;
        var3 = var3 | (param1[2 + param0 * 4] & var4) << 1346297928;
        if (param2 < 48) {
          field_qb = null;
          var3 = var3 | param1[3 + param0 * 4] & var4;
          return var3;
        } else {
          var3 = var3 | param1[3 + param0 * 4] & var4;
          return var3;
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (((md) this).field_ub) {
          pn.a(true, (byte) -59, false);
          return;
        } else {
          ed.a(419);
          if (param1 != -6) {
            field_vb = null;
            ((md) this).h((byte) -126);
            return;
          } else {
            ((md) this).h((byte) -126);
            return;
          }
        }
    }

    final boolean j(int param0) {
        eo var2 = null;
        Object var3 = null;
        if (param0 == 2634) {
          if (((md) this).field_H) {
            if (!((md) this).field_rb) {
              var2 = ij.h(-107);
              if (var2 == null) {
                return super.j(param0 + 0);
              } else {
                this.a(false, var2, false);
                return super.j(param0 + 0);
              }
            } else {
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        } else {
          var3 = null;
          int discarded$1 = md.a(-115, (byte[]) null, 111);
          if (((md) this).field_H) {
            if (((md) this).field_rb) {
              return super.j(param0 + 0);
            } else {
              L0: {
                var2 = ij.h(-107);
                if (var2 != null) {
                  this.a(false, var2, false);
                  break L0;
                } else {
                  break L0;
                }
              }
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        }
    }

    md(dn param0, fk param1) {
        super(param0, rk.field_b, bb.field_d, false, false);
        ((md) this).field_sb = param1;
    }

    final void c(boolean param0) {
        this.a(param0, te.a(fm.field_E, -13466, 248), true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_wb = "Logging in...";
        field_vb = new vn(54, 54);
    }
}
