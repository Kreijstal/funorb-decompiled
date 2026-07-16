/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends bd implements da {
    static dd[] field_tb;
    static String field_xb;
    static long field_sb;
    private boolean field_wb;
    private ca field_ub;
    private boolean field_vb;

    public static void i(byte param0) {
        if (param0 <= 119) {
            ua.i((byte) -36);
            field_xb = null;
            field_tb = null;
            return;
        }
        field_xb = null;
        field_tb = null;
    }

    private final void a(byte param0, mk param1, boolean param2) {
        String var4 = null;
        bm var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        ((ua) this).field_wb = true;
        if (param0 == 58) {
          L0: {
            if (param1.field_k) {
              var4 = lc.field_q;
              break L0;
            } else {
              if (param1.field_j != null) {
                var4 = de.field_o;
                if (null != ((ua) this).field_ub) {
                  ((ua) this).field_ub.a(-72);
                  if (var6 == 0) {
                    break L0;
                  } else {
                    var4 = param1.field_b;
                    if (-249 == (param1.field_f ^ -1)) {
                      L1: {
                        if (param2) {
                          break L1;
                        } else {
                          ii.b(116);
                          break L1;
                        }
                      }
                      ((ua) this).field_vb = true;
                      var4 = al.field_a;
                      var4 = lc.field_q;
                      var5 = new bm((bd) this, rg.field_o, var4);
                      if (param1.field_k) {
                        if (param1.field_g) {
                          ((ua) this).d((qa) (Object) new og((ua) this), 26034);
                          return;
                        } else {
                          L2: {
                            bb discarded$12 = var5.a((kd) this, true, ee.field_k);
                            if (!((ua) this).field_vb) {
                              break L2;
                            } else {
                              bb discarded$13 = var5.a((kd) this, true, ee.field_k);
                              break L2;
                            }
                          }
                          L3: {
                            if (param1.field_f != 5) {
                              break L3;
                            } else {
                              var5.a(ld.field_c, -23493, 11);
                              var5.a(vk.field_K, -23493, 17);
                              break L3;
                            }
                          }
                          var5.a(mi.field_k, param0 + -23551, -1);
                          L4: {
                            if (param1.field_f == 3) {
                              var5.a(bm.field_N, -23493, 7);
                              break L4;
                            } else {
                              if ((param1.field_f ^ -1) != -7) {
                                break L4;
                              } else {
                                var5.a(cb.field_s, param0 ^ -23551, 9);
                                var5.a(bm.field_N, -23493, 7);
                                break L4;
                              }
                            }
                          }
                          ((ua) this).d((qa) (Object) var5, param0 + 25976);
                          return;
                        }
                      } else {
                        L5: {
                          if (!((ua) this).field_vb) {
                            break L5;
                          } else {
                            bb discarded$14 = var5.a((kd) this, true, ee.field_k);
                            break L5;
                          }
                        }
                        L6: {
                          if (param1.field_f != 5) {
                            break L6;
                          } else {
                            var5.a(ld.field_c, -23493, 11);
                            var5.a(vk.field_K, -23493, 17);
                            break L6;
                          }
                        }
                        var5.a(mi.field_k, param0 + -23551, -1);
                        L7: {
                          if (param1.field_f == 3) {
                            var5.a(bm.field_N, -23493, 7);
                            break L7;
                          } else {
                            if ((param1.field_f ^ -1) != -7) {
                              break L7;
                            } else {
                              var5.a(cb.field_s, param0 ^ -23551, 9);
                              var5.a(bm.field_N, -23493, 7);
                              break L7;
                            }
                          }
                        }
                        ((ua) this).d((qa) (Object) var5, param0 + 25976);
                        return;
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  L8: {
                    var5 = new bm((bd) this, rg.field_o, var4);
                    if (!param1.field_k) {
                      break L8;
                    } else {
                      if (param1.field_g) {
                        ((ua) this).d((qa) (Object) new og((ua) this), 26034);
                        return;
                      } else {
                        bb discarded$15 = var5.a((kd) this, true, ee.field_k);
                        if (var6 != 0) {
                          break L8;
                        } else {
                          ((ua) this).d((qa) (Object) var5, param0 + 25976);
                          return;
                        }
                      }
                    }
                  }
                  if (!((ua) this).field_vb) {
                    if (param1.field_f == 5) {
                      var5.a(ld.field_c, -23493, 11);
                      var5.a(vk.field_K, -23493, 17);
                      if (var6 == 0) {
                        if (param1.field_f != 3) {
                          if ((param1.field_f ^ -1) == -7) {
                            var5.a(cb.field_s, param0 ^ -23551, 9);
                            if (var6 != 0) {
                              var5.a(bm.field_N, -23493, 7);
                              ((ua) this).d((qa) (Object) var5, param0 + 25976);
                              return;
                            } else {
                              ((ua) this).d((qa) (Object) var5, param0 + 25976);
                              return;
                            }
                          } else {
                            ((ua) this).d((qa) (Object) var5, param0 + 25976);
                            return;
                          }
                        } else {
                          var5.a(bm.field_N, -23493, 7);
                          ((ua) this).d((qa) (Object) var5, param0 + 25976);
                          return;
                        }
                      } else {
                        L9: {
                          var5.a(mi.field_k, param0 + -23551, -1);
                          if (param1.field_f == 3) {
                            var5.a(bm.field_N, -23493, 7);
                            break L9;
                          } else {
                            if ((param1.field_f ^ -1) != -7) {
                              break L9;
                            } else {
                              var5.a(cb.field_s, param0 ^ -23551, 9);
                              var5.a(bm.field_N, -23493, 7);
                              break L9;
                            }
                          }
                        }
                        ((ua) this).d((qa) (Object) var5, param0 + 25976);
                        return;
                      }
                    } else {
                      L10: {
                        var5.a(mi.field_k, param0 + -23551, -1);
                        if (param1.field_f == 3) {
                          var5.a(bm.field_N, -23493, 7);
                          break L10;
                        } else {
                          if ((param1.field_f ^ -1) != -7) {
                            break L10;
                          } else {
                            var5.a(cb.field_s, param0 ^ -23551, 9);
                            if (var6 == 0) {
                              break L10;
                            } else {
                              var5.a(bm.field_N, -23493, 7);
                              break L10;
                            }
                          }
                        }
                      }
                      ((ua) this).d((qa) (Object) var5, param0 + 25976);
                      return;
                    }
                  } else {
                    L11: {
                      bb discarded$16 = var5.a((kd) this, true, ee.field_k);
                      if (param1.field_f != 5) {
                        break L11;
                      } else {
                        var5.a(ld.field_c, -23493, 11);
                        var5.a(vk.field_K, -23493, 17);
                        break L11;
                      }
                    }
                    var5.a(mi.field_k, param0 + -23551, -1);
                    L12: {
                      if (param1.field_f == 3) {
                        var5.a(bm.field_N, -23493, 7);
                        break L12;
                      } else {
                        if ((param1.field_f ^ -1) != -7) {
                          break L12;
                        } else {
                          var5.a(cb.field_s, param0 ^ -23551, 9);
                          if (var6 == 0) {
                            break L12;
                          } else {
                            var5.a(bm.field_N, -23493, 7);
                            break L12;
                          }
                        }
                      }
                    }
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  }
                }
              } else {
                var4 = param1.field_b;
                if (-249 == (param1.field_f ^ -1)) {
                  L13: {
                    if (param2) {
                      break L13;
                    } else {
                      ii.b(116);
                      break L13;
                    }
                  }
                  L14: {
                    ((ua) this).field_vb = true;
                    var4 = al.field_a;
                    if (var6 == 0) {
                      break L14;
                    } else {
                      var4 = lc.field_q;
                      break L14;
                    }
                  }
                  var5 = new bm((bd) this, rg.field_o, var4);
                  if (param1.field_k) {
                    if (param1.field_g) {
                      ((ua) this).d((qa) (Object) new og((ua) this), 26034);
                      return;
                    } else {
                      L15: {
                        bb discarded$17 = var5.a((kd) this, true, ee.field_k);
                        if (var6 == 0) {
                          break L15;
                        } else {
                          L16: {
                            if (!((ua) this).field_vb) {
                              break L16;
                            } else {
                              bb discarded$18 = var5.a((kd) this, true, ee.field_k);
                              break L16;
                            }
                          }
                          L17: {
                            if (param1.field_f != 5) {
                              break L17;
                            } else {
                              var5.a(ld.field_c, -23493, 11);
                              var5.a(vk.field_K, -23493, 17);
                              break L17;
                            }
                          }
                          var5.a(mi.field_k, param0 + -23551, -1);
                          if (param1.field_f == 3) {
                            var5.a(bm.field_N, -23493, 7);
                            break L15;
                          } else {
                            if ((param1.field_f ^ -1) != -7) {
                              break L15;
                            } else {
                              var5.a(cb.field_s, param0 ^ -23551, 9);
                              var5.a(bm.field_N, -23493, 7);
                              break L15;
                            }
                          }
                        }
                      }
                      ((ua) this).d((qa) (Object) var5, param0 + 25976);
                      return;
                    }
                  } else {
                    L18: {
                      if (!((ua) this).field_vb) {
                        break L18;
                      } else {
                        bb discarded$19 = var5.a((kd) this, true, ee.field_k);
                        break L18;
                      }
                    }
                    L19: {
                      if (param1.field_f != 5) {
                        break L19;
                      } else {
                        var5.a(ld.field_c, -23493, 11);
                        var5.a(vk.field_K, -23493, 17);
                        break L19;
                      }
                    }
                    var5.a(mi.field_k, param0 + -23551, -1);
                    L20: {
                      if (param1.field_f == 3) {
                        var5.a(bm.field_N, -23493, 7);
                        break L20;
                      } else {
                        if ((param1.field_f ^ -1) != -7) {
                          break L20;
                        } else {
                          var5.a(cb.field_s, param0 ^ -23551, 9);
                          var5.a(bm.field_N, -23493, 7);
                          break L20;
                        }
                      }
                    }
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  }
                } else {
                  L21: {
                    var5 = new bm((bd) this, rg.field_o, var4);
                    if (!param1.field_k) {
                      break L21;
                    } else {
                      if (param1.field_g) {
                        ((ua) this).d((qa) (Object) new og((ua) this), 26034);
                        return;
                      } else {
                        bb discarded$20 = var5.a((kd) this, true, ee.field_k);
                        if (var6 != 0) {
                          break L21;
                        } else {
                          ((ua) this).d((qa) (Object) var5, param0 + 25976);
                          return;
                        }
                      }
                    }
                  }
                  if (!((ua) this).field_vb) {
                    if (param1.field_f == 5) {
                      L22: {
                        var5.a(ld.field_c, -23493, 11);
                        var5.a(vk.field_K, -23493, 17);
                        var5.a(mi.field_k, param0 + -23551, -1);
                        if (param1.field_f == 3) {
                          var5.a(bm.field_N, -23493, 7);
                          break L22;
                        } else {
                          if ((param1.field_f ^ -1) != -7) {
                            break L22;
                          } else {
                            var5.a(cb.field_s, param0 ^ -23551, 9);
                            var5.a(bm.field_N, -23493, 7);
                            break L22;
                          }
                        }
                      }
                      ((ua) this).d((qa) (Object) var5, param0 + 25976);
                      return;
                    } else {
                      L23: {
                        var5.a(mi.field_k, param0 + -23551, -1);
                        if (param1.field_f == 3) {
                          var5.a(bm.field_N, -23493, 7);
                          break L23;
                        } else {
                          if ((param1.field_f ^ -1) != -7) {
                            break L23;
                          } else {
                            var5.a(cb.field_s, param0 ^ -23551, 9);
                            var5.a(bm.field_N, -23493, 7);
                            break L23;
                          }
                        }
                      }
                      ((ua) this).d((qa) (Object) var5, param0 + 25976);
                      return;
                    }
                  } else {
                    L24: {
                      bb discarded$21 = var5.a((kd) this, true, ee.field_k);
                      if (param1.field_f != 5) {
                        break L24;
                      } else {
                        var5.a(ld.field_c, -23493, 11);
                        var5.a(vk.field_K, -23493, 17);
                        break L24;
                      }
                    }
                    var5.a(mi.field_k, param0 + -23551, -1);
                    L25: {
                      if (param1.field_f == 3) {
                        var5.a(bm.field_N, -23493, 7);
                        break L25;
                      } else {
                        if ((param1.field_f ^ -1) != -7) {
                          break L25;
                        } else {
                          var5.a(cb.field_s, param0 ^ -23551, 9);
                          var5.a(bm.field_N, -23493, 7);
                          break L25;
                        }
                      }
                    }
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  }
                }
              }
            }
          }
          L26: {
            var5 = new bm((bd) this, rg.field_o, var4);
            if (!param1.field_k) {
              break L26;
            } else {
              if (param1.field_g) {
                ((ua) this).d((qa) (Object) new og((ua) this), 26034);
                return;
              } else {
                bb discarded$22 = var5.a((kd) this, true, ee.field_k);
                if (var6 != 0) {
                  break L26;
                } else {
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                }
              }
            }
          }
          if (!((ua) this).field_vb) {
            if (param1.field_f != 5) {
              var5.a(mi.field_k, param0 + -23551, -1);
              if (param1.field_f == 3) {
                var5.a(bm.field_N, -23493, 7);
                ((ua) this).d((qa) (Object) var5, param0 + 25976);
                return;
              } else {
                if ((param1.field_f ^ -1) == -7) {
                  var5.a(cb.field_s, param0 ^ -23551, 9);
                  var5.a(bm.field_N, -23493, 7);
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                } else {
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                }
              }
            } else {
              var5.a(ld.field_c, -23493, 11);
              var5.a(vk.field_K, -23493, 17);
              if (var6 == 0) {
                if (param1.field_f == 3) {
                  var5.a(bm.field_N, -23493, 7);
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                } else {
                  L27: {
                    if ((param1.field_f ^ -1) != -7) {
                      break L27;
                    } else {
                      var5.a(cb.field_s, param0 ^ -23551, 9);
                      if (var6 == 0) {
                        break L27;
                      } else {
                        var5.a(bm.field_N, -23493, 7);
                        ((ua) this).d((qa) (Object) var5, param0 + 25976);
                        return;
                      }
                    }
                  }
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                }
              } else {
                var5.a(mi.field_k, param0 + -23551, -1);
                if (param1.field_f == 3) {
                  var5.a(bm.field_N, -23493, 7);
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                } else {
                  if ((param1.field_f ^ -1) == -7) {
                    var5.a(cb.field_s, param0 ^ -23551, 9);
                    var5.a(bm.field_N, -23493, 7);
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  } else {
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  }
                }
              }
            }
          } else {
            bb discarded$23 = var5.a((kd) this, true, ee.field_k);
            if (var6 != 0) {
              L28: {
                L29: {
                  if (param1.field_f != 5) {
                    break L29;
                  } else {
                    var5.a(ld.field_c, -23493, 11);
                    var5.a(vk.field_K, -23493, 17);
                    if (var6 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var5.a(mi.field_k, param0 + -23551, -1);
                break L28;
              }
              if (param1.field_f != 3) {
                if ((param1.field_f ^ -1) == -7) {
                  var5.a(cb.field_s, param0 ^ -23551, 9);
                  if (var6 != 0) {
                    var5.a(bm.field_N, -23493, 7);
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  } else {
                    ((ua) this).d((qa) (Object) var5, param0 + 25976);
                    return;
                  }
                } else {
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                }
              } else {
                var5.a(bm.field_N, -23493, 7);
                ((ua) this).d((qa) (Object) var5, param0 + 25976);
                return;
              }
            } else {
              if (param1.field_f != 3) {
                if ((param1.field_f ^ -1) != -7) {
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                } else {
                  var5.a(cb.field_s, param0 ^ -23551, 9);
                  ((ua) this).d((qa) (Object) var5, param0 + 25976);
                  return;
                }
              } else {
                var5.a(bm.field_N, -23493, 7);
                ((ua) this).d((qa) (Object) var5, param0 + 25976);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void h(byte param0) {
        if (param0 >= -3) {
            return;
        }
        this.a((byte) 58, af.a((byte) 36, 248, al.field_a), true);
    }

    final boolean a(int param0) {
        int var2 = 0;
        mk var3 = null;
        var2 = -66 / ((38 - param0) / 49);
        if (((ua) this).field_G) {
          if (!((ua) this).field_wb) {
            var3 = bg.a((byte) 56);
            if (var3 != null) {
              this.a((byte) 58, var3, false);
              return super.a(100);
            } else {
              return super.a(100);
            }
          } else {
            return super.a(100);
          }
        } else {
          return super.a(100);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        if (!(!((ua) this).field_vb)) {
            wa.a(false, true, param3 + -370);
            return;
        }
        ih.l(255);
        ((ua) this).n(param3 ^ -22669);
        if (param3 != 248) {
            field_xb = null;
        }
    }

    ua(f param0, ca param1) {
        super(param0, rg.field_o, pb.field_b, false, false);
        ((ua) this).field_ub = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_xb = "</shad>";
    }
}
