/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lja {
    private String field_d;
    private int field_b;
    private long field_g;
    private int[] field_e;
    ola field_f;
    jea field_h;
    int field_k;
    static fp field_j;
    static volatile boolean field_c;
    String field_i;
    static String field_a;

    public static void b(byte param0) {
        int var1 = 37 % ((7 - param0) / 44);
        field_j = null;
        field_a = null;
    }

    final boolean a(int param0) {
        Object var3 = null;
        if (param0 == 13) {
          if (((lja) this).field_f != null) {
            if (!((lja) this).field_f.f(param0 ^ -13)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          ((lja) this).a((gqa) null, -72);
          if (((lja) this).field_f != null) {
            if (!((lja) this).field_f.f(param0 ^ -13)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != -13) {
            return null;
        }
        if (((lja) this).field_d == null) {
            var2 = ((lja) this).field_i;
        } else {
            var2 = ((lja) this).field_d;
        }
        return var2;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            ((lja) this).field_g = -102L;
            ((lja) this).field_f.b(44, param1);
            return;
        }
        ((lja) this).field_f.b(44, param1);
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        ht var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null == uu.field_a) {
          var5 = av.a(((lja) this).field_k, 0);
          if (var5 != null) {
            var3 = var5.field_tb;
            if (var5.field_gc) {
              ((lja) this).field_f.a((byte) -102, 2, gl.a((byte) 114, pba.field_d, new String[1]));
              ((lja) this).field_f.a((byte) -104, 3, gl.a((byte) 123, cp.field_i, new String[1]));
              if (param0 <= -10) {
                return;
              } else {
                ((lja) this).field_e = null;
                return;
              }
            } else {
              if (var5.field_Bb) {
                ((lja) this).field_f.a((byte) -76, 2, gl.a((byte) 106, mna.field_b, new String[1]));
                if (var5.field_Sb) {
                  ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                  if (param0 <= -10) {
                    return;
                  } else {
                    ((lja) this).field_e = null;
                    return;
                  }
                } else {
                  if (param0 > -10) {
                    ((lja) this).field_e = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (!var5.field_Sb) {
                  if (var5.field_Yb) {
                    L0: {
                      if (!var5.field_ec) {
                        break L0;
                      } else {
                        if (var5.field_Bb) {
                          break L0;
                        } else {
                          if (var5.field_Sb) {
                            ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                            if (param0 <= -10) {
                              return;
                            } else {
                              ((lja) this).field_e = null;
                              return;
                            }
                          } else {
                            if (param0 <= -10) {
                              return;
                            } else {
                              ((lja) this).field_e = null;
                              return;
                            }
                          }
                        }
                      }
                    }
                    L1: {
                      ((lja) this).field_f.a((byte) -125, 2, gl.a((byte) 91, di.field_h, new String[1]));
                      if (var5.field_Sb) {
                        ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (param0 > -10) {
                      ((lja) this).field_e = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (var5.field_Sb) {
                      ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                      if (param0 > -10) {
                        ((lja) this).field_e = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 > -10) {
                        ((lja) this).field_e = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_Sb) {
                    ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                    if (param0 > -10) {
                      ((lja) this).field_e = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -10) {
                      ((lja) this).field_e = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 > -10) {
              ((lja) this).field_e = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 > -10) {
            ((lja) this).field_e = null;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = ((lja) this).field_f.d(0, param0);
        if (!(param3 != var6)) {
            return false;
        }
        boolean discarded$0 = this.a(param3 + -16, var6, param2);
        boolean discarded$1 = this.b(var6, (byte) -121, param4);
        boolean discarded$2 = this.a(var6, (byte) -39, param4);
        boolean discarded$3 = this.b(param1, var6, 114);
        return true;
    }

    private final boolean b(int param0, byte param1, int param2) {
        String var4 = null;
        Object var5 = null;
        var4 = null;
        if (4 == param0) {
          var4 = rf.a(true, ((lja) this).field_i, param2);
          if (var4 == null) {
            if (param1 != -121) {
              return false;
            } else {
              return true;
            }
          } else {
            var5 = null;
            gu.a(0, true, ((lja) this).field_i, var4, (String) null, 2);
            if (param1 != -121) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          if (param0 == 5) {
            var4 = uca.a(((lja) this).field_i, (byte) 102, param2);
            if (var4 == null) {
              if (param1 != -121) {
                return false;
              } else {
                return true;
              }
            } else {
              var5 = null;
              gu.a(0, true, ((lja) this).field_i, var4, (String) null, 2);
              if (param1 != -121) {
                return false;
              } else {
                return true;
              }
            }
          } else {
            if (param0 == 6) {
              var4 = nna.a(-3, ((lja) this).field_i, param2);
              if (var4 != null) {
                var5 = null;
                gu.a(0, true, ((lja) this).field_i, var4, (String) null, 2);
                if (param1 != -121) {
                  return false;
                } else {
                  return true;
                }
              } else {
                if (param1 != -121) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              if (7 == param0) {
                var4 = kc.a(((lja) this).field_i, param2, false, ((lja) this).field_d);
                if (var4 != null) {
                  var5 = null;
                  gu.a(0, true, ((lja) this).field_i, var4, (String) null, 2);
                  if (param1 != -121) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if (param1 != -121) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (-1 != (param1 ^ -1)) {
            if (param1 == -2) {
              fn.a(param2, ((lja) this).field_g, -120);
              if (param0 != -18) {
                field_j = null;
                return true;
              } else {
                return true;
              }
            } else {
              if (-3 != param1) {
                if ((param1 ^ -1) != -4) {
                  if (-11 != (param1 ^ -1)) {
                    if (param1 != 15) {
                      if ((param1 ^ -1) == -17) {
                        cua.a(0, 3, param2);
                        if (param0 != -18) {
                          field_j = null;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      cua.a(((lja) this).field_k, param0 + 21, param2);
                      if (param0 != -18) {
                        field_j = null;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    kw.a(param2, false, ((lja) this).field_k);
                    if (param0 == -18) {
                      return true;
                    } else {
                      field_j = null;
                      return true;
                    }
                  }
                } else {
                  et.a(param2, 30, ((lja) this).field_k);
                  if (param0 == -18) {
                    return true;
                  } else {
                    field_j = null;
                    return true;
                  }
                }
              } else {
                q.a((byte) -123, param2, ((lja) this).field_k);
                break L0;
              }
            }
          } else {
            fv.a((byte) -38, param2, ((lja) this).field_g);
            break L0;
          }
        }
        if (param0 != -18) {
          field_j = null;
          return true;
        } else {
          return true;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != -39) {
          lja.b((byte) 36);
          if (param0 != -9) {
            if (-19 != param0) {
              if (-12 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -13) {
                  if (param0 != -14) {
                    if (-15 != param0) {
                      if (-21 != (param0 ^ -1)) {
                        if (19 == param0) {
                          boolean discarded$2 = eca.a((byte) 84, ((lja) this).field_b, ((lja) this).field_g, ((lja) this).field_e, ((lja) this).field_i);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        ola.e((byte) 123);
                        return true;
                      }
                    } else {
                      kaa.a((byte) 118);
                      return true;
                    }
                  } else {
                    loa.a(((lja) this).field_b, param2, (byte) 108, 2);
                    return true;
                  }
                } else {
                  loa.a(((lja) this).field_b, param2, (byte) 108, 1);
                  return true;
                }
              } else {
                loa.a(((lja) this).field_b, param2, (byte) 108, 0);
                return true;
              }
            } else {
              fs.a((byte) 123, ((lja) this).field_g, ((lja) this).field_i);
              return true;
            }
          } else {
            no.a(((lja) this).field_i, ((lja) this).field_g, (byte) 120);
            return true;
          }
        } else {
          if (param0 != -9) {
            if (-19 != param0) {
              if (-12 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -13) {
                  if (param0 != -14) {
                    if (-15 != param0) {
                      if (-21 != (param0 ^ -1)) {
                        if (19 != param0) {
                          return false;
                        } else {
                          boolean discarded$3 = eca.a((byte) 84, ((lja) this).field_b, ((lja) this).field_g, ((lja) this).field_e, ((lja) this).field_i);
                          return true;
                        }
                      } else {
                        ola.e((byte) 123);
                        return true;
                      }
                    } else {
                      kaa.a((byte) 118);
                      return true;
                    }
                  } else {
                    loa.a(((lja) this).field_b, param2, (byte) 108, 2);
                    return true;
                  }
                } else {
                  loa.a(((lja) this).field_b, param2, (byte) 108, 1);
                  return true;
                }
              } else {
                loa.a(((lja) this).field_b, param2, (byte) 108, 0);
                return true;
              }
            } else {
              fs.a((byte) 123, ((lja) this).field_g, ((lja) this).field_i);
              return true;
            }
          } else {
            no.a(((lja) this).field_i, ((lja) this).field_g, (byte) 120);
            return true;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        String var4 = null;
        mu var5 = null;
        int var6 = 0;
        String var7 = null;
        if (param2 != 19) {
          ((lja) this).field_f = null;
          if (((lja) this).field_i != null) {
            if (rb.field_r != ((lja) this).field_g) {
              if (ae.field_g == 2) {
                var7 = this.b(-13);
                var4 = var7;
                var5 = wp.a(127, ((lja) this).field_i);
                var6 = qaa.a(2180, ((lja) this).field_i) ? 1 : 0;
                if (var5 == null) {
                  if (var6 == 0) {
                    ((lja) this).field_f.a((byte) -64, 4, gl.a((byte) 92, ao.field_m, new String[1]));
                    ((lja) this).field_f.a((byte) -70, 6, gl.a((byte) 127, mp.field_b, new String[1]));
                    if (param0 != null) {
                      L0: {
                        if (2 == param1) {
                          break L0;
                        } else {
                          if (!fua.field_g) {
                            ((lja) this).field_e = param0;
                            ((lja) this).field_f.a((byte) -90, 19, gl.a((byte) 119, gja.field_k, new String[1]));
                            break L0;
                          } else {
                            if (var5 != null) {
                              if (ab.a(((lja) this).field_i, (byte) -50)) {
                                L1: {
                                  ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                  if (var6 != 0) {
                                    ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                }
                                return;
                              } else {
                                if (!fua.field_g) {
                                  L2: {
                                    if (!ok.field_s) {
                                      ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                  ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                                  if (param0 != null) {
                                    ((lja) this).field_e = param0;
                                    ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                                    L3: {
                                      ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                      if (var6 != 0) {
                                        ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    }
                                    return;
                                  } else {
                                    L4: {
                                      ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                      if (var6 != 0) {
                                        ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    return;
                                  }
                                } else {
                                  L5: {
                                    ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                    if (var6 != 0) {
                                      ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  return;
                                }
                              }
                            } else {
                              L6: {
                                if (var6 != 0) {
                                  ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      if (var5 != null) {
                        if (ab.a(((lja) this).field_i, (byte) -50)) {
                          L7: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          return;
                        } else {
                          if (!fua.field_g) {
                            L8: {
                              if (!ok.field_s) {
                                ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                            if (param0 != null) {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                              L9: {
                                ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                if (var6 != 0) {
                                  ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              return;
                            } else {
                              L10: {
                                ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                if (var6 != 0) {
                                  ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              return;
                            }
                          } else {
                            L11: {
                              ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                              if (var6 != 0) {
                                ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L12: {
                          if (var6 != 0) {
                            ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        return;
                      }
                    } else {
                      if (var5 != null) {
                        if (!ab.a(((lja) this).field_i, (byte) -50)) {
                          if (!fua.field_g) {
                            L13: {
                              if (!ok.field_s) {
                                ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                            if (param0 != null) {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                              L14: {
                                ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                if (var6 != 0) {
                                  ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              return;
                            } else {
                              L15: {
                                ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                                if (var6 != 0) {
                                  ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              return;
                            }
                          } else {
                            L16: {
                              ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                              if (var6 != 0) {
                                ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            return;
                          }
                        } else {
                          L17: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          return;
                        }
                      } else {
                        L18: {
                          if (var6 != 0) {
                            ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (var5 != null) {
                      if (!ab.a(((lja) this).field_i, (byte) -50)) {
                        if (!fua.field_g) {
                          L19: {
                            if (!ok.field_s) {
                              ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                          if (param0 != null) {
                            ((lja) this).field_e = param0;
                            ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                            L20: {
                              ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                              if (var6 != 0) {
                                ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            return;
                          } else {
                            L21: {
                              ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                              if (var6 != 0) {
                                ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            return;
                          }
                        } else {
                          L22: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          return;
                        }
                      } else {
                        L23: {
                          ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                          if (var6 != 0) {
                            ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        return;
                      }
                    } else {
                      L24: {
                        if (var6 != 0) {
                          ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (var5 != null) {
                    if (!ab.a(((lja) this).field_i, (byte) -50)) {
                      if (!fua.field_g) {
                        L25: {
                          if (!ok.field_s) {
                            ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                        if (param0 != null) {
                          ((lja) this).field_e = param0;
                          ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                          L26: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          return;
                        } else {
                          L27: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          return;
                        }
                      } else {
                        L28: {
                          ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                          if (var6 != 0) {
                            ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        return;
                      }
                    } else {
                      L29: {
                        ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                        if (var6 != 0) {
                          ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      return;
                    }
                  } else {
                    L30: {
                      if (var6 != 0) {
                        ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (-3 == (param1 ^ -1)) {
                if (ae.field_g == 2) {
                  L31: {
                    var7 = this.b(-13);
                    var4 = var7;
                    var5 = wp.a(127, ((lja) this).field_i);
                    var6 = qaa.a(2180, ((lja) this).field_i) ? 1 : 0;
                    if (var5 != null) {
                      break L31;
                    } else {
                      if (var6 == 0) {
                        ((lja) this).field_f.a((byte) -64, 4, gl.a((byte) 92, ao.field_m, new String[1]));
                        ((lja) this).field_f.a((byte) -70, 6, gl.a((byte) 127, mp.field_b, new String[1]));
                        if (param0 == null) {
                          break L31;
                        } else {
                          if (2 == param1) {
                            break L31;
                          } else {
                            if (!fua.field_g) {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -90, 19, gl.a((byte) 119, gja.field_k, new String[1]));
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (var5 != null) {
                    if (!ab.a(((lja) this).field_i, (byte) -50)) {
                      if (!fua.field_g) {
                        L32: {
                          if (!ok.field_s) {
                            ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                        if (param0 != null) {
                          ((lja) this).field_e = param0;
                          ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                          L33: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          return;
                        } else {
                          L34: {
                            ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                            if (var6 != 0) {
                              ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          return;
                        }
                      } else {
                        L35: {
                          ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                          if (var6 != 0) {
                            ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        return;
                      }
                    } else {
                      L36: {
                        ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                        if (var6 != 0) {
                          ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      return;
                    }
                  } else {
                    L37: {
                      if (var6 != 0) {
                        ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                        break L37;
                      } else {
                        break L37;
                      }
                    }
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
          if (((lja) this).field_i != null) {
            L38: {
              if (rb.field_r != ((lja) this).field_g) {
                break L38;
              } else {
                if (-3 == (param1 ^ -1)) {
                  break L38;
                } else {
                  return;
                }
              }
            }
            if (ae.field_g == 2) {
              L39: {
                var7 = this.b(-13);
                var4 = var7;
                var5 = wp.a(127, ((lja) this).field_i);
                var6 = qaa.a(2180, ((lja) this).field_i) ? 1 : 0;
                if (var5 != null) {
                  break L39;
                } else {
                  if (var6 == 0) {
                    ((lja) this).field_f.a((byte) -64, 4, gl.a((byte) 92, ao.field_m, new String[1]));
                    ((lja) this).field_f.a((byte) -70, 6, gl.a((byte) 127, mp.field_b, new String[1]));
                    if (param0 == null) {
                      break L39;
                    } else {
                      if (2 == param1) {
                        break L39;
                      } else {
                        if (!fua.field_g) {
                          ((lja) this).field_e = param0;
                          ((lja) this).field_f.a((byte) -90, 19, gl.a((byte) 119, gja.field_k, new String[1]));
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                  } else {
                    break L39;
                  }
                }
              }
              if (var5 != null) {
                if (!ab.a(((lja) this).field_i, (byte) -50)) {
                  if (!fua.field_g) {
                    L40: {
                      if (!ok.field_s) {
                        ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                    if (param0 != null) {
                      ((lja) this).field_e = param0;
                      ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                      L41: {
                        ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                        if (var6 != 0) {
                          ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      return;
                    } else {
                      L42: {
                        ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                        if (var6 != 0) {
                          ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      return;
                    }
                  } else {
                    L43: {
                      ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                      if (var6 != 0) {
                        ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    return;
                  }
                } else {
                  L44: {
                    ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                    if (var6 != 0) {
                      ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                  return;
                }
              } else {
                L45: {
                  if (var6 != 0) {
                    ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
                    break L45;
                  } else {
                    break L45;
                  }
                }
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

    final void a(gqa param0, int param1) {
        if (!param0.field_m) {
          ((lja) this).field_b = param0.field_d;
          if (-1 == param0.field_d) {
            if (-1 != (k.field_A ^ -1)) {
              ((lja) this).field_f.a((byte) -86, 13, pea.field_f);
              if (1 == param0.field_d) {
                if (0 != nba.field_b) {
                  L0: {
                    ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                    if (-3 != (param0.field_d ^ -1)) {
                      break L0;
                    } else {
                      if (caa.field_i != 0) {
                        ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                        break L0;
                      } else {
                        L1: {
                          ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                          ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                          if (param1 == 13) {
                            break L1;
                          } else {
                            String discarded$11 = this.b(-106);
                            break L1;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param1 != 13) {
                    String discarded$12 = this.b(-106);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((lja) this).field_f.a((byte) -77, 12, jl.field_a);
                  L2: {
                    ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                    if (-3 != (param0.field_d ^ -1)) {
                      break L2;
                    } else {
                      if (caa.field_i != 0) {
                        ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                        break L2;
                      } else {
                        L3: {
                          ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                          ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                          if (param1 == 13) {
                            break L3;
                          } else {
                            String discarded$13 = this.b(-106);
                            break L3;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param1 != 13) {
                    String discarded$14 = this.b(-106);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L4: {
                  if (-3 != (param0.field_d ^ -1)) {
                    break L4;
                  } else {
                    if (caa.field_i != 0) {
                      ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                      break L4;
                    } else {
                      ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                      ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                      if (param1 == 13) {
                        return;
                      } else {
                        String discarded$15 = this.b(-106);
                        return;
                      }
                    }
                  }
                }
                if (param1 != 13) {
                  String discarded$16 = this.b(-106);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((lja) this).field_f.a((byte) -66, 12, qe.field_b);
              L5: {
                ((lja) this).field_f.a((byte) -86, 13, pea.field_f);
                if (1 == param0.field_d) {
                  if (0 != nba.field_b) {
                    ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                    break L5;
                  } else {
                    ((lja) this).field_f.a((byte) -77, 12, jl.field_a);
                    ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (-3 != (param0.field_d ^ -1)) {
                  break L6;
                } else {
                  if (caa.field_i == 0) {
                    ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                    ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                    break L6;
                  } else {
                    L7: {
                      ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                      if (param1 == 13) {
                        break L7;
                      } else {
                        String discarded$17 = this.b(-106);
                        break L7;
                      }
                    }
                    return;
                  }
                }
              }
              if (param1 == 13) {
                return;
              } else {
                String discarded$18 = this.b(-106);
                return;
              }
            }
          } else {
            if (1 == param0.field_d) {
              if (0 != nba.field_b) {
                L8: {
                  ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                  if (-3 != (param0.field_d ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      if (caa.field_i != 0) {
                        break L9;
                      } else {
                        ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                        break L9;
                      }
                    }
                    ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                    break L8;
                  }
                }
                L10: {
                  if (param1 == 13) {
                    break L10;
                  } else {
                    String discarded$19 = this.b(-106);
                    break L10;
                  }
                }
                return;
              } else {
                ((lja) this).field_f.a((byte) -77, 12, jl.field_a);
                L11: {
                  ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                  if (-3 != (param0.field_d ^ -1)) {
                    break L11;
                  } else {
                    L12: {
                      if (caa.field_i != 0) {
                        break L12;
                      } else {
                        ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                        break L12;
                      }
                    }
                    ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                    break L11;
                  }
                }
                L13: {
                  if (param1 == 13) {
                    break L13;
                  } else {
                    String discarded$20 = this.b(-106);
                    break L13;
                  }
                }
                return;
              }
            } else {
              L14: {
                if (-3 != param0.field_d) {
                  break L14;
                } else {
                  if (caa.field_i != 0) {
                    ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                    break L14;
                  } else {
                    ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                    ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                    break L14;
                  }
                }
              }
              L15: {
                if (param1 == 13) {
                  break L15;
                } else {
                  String discarded$21 = this.b(-106);
                  break L15;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        pha var4 = null;
        String var5 = null;
        int var6 = 0;
        pha var13 = null;
        pha var14 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -22) {
          field_c = false;
          if (((lja) this).field_i != null) {
            if (((lja) this).field_g != rb.field_r) {
              if (null != uu.field_a) {
                if (mka.b(8192)) {
                  var14 = nl.a(true, ((lja) this).field_g);
                  var4 = vba.a((byte) -40, ((lja) this).field_g);
                  var5 = this.b(-13);
                  if (var4 != null) {
                    if (uu.field_a.field_ec) {
                      if (uu.field_a.field_Kb >= 0) {
                        ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                      return;
                    }
                  } else {
                    if (var14 != null) {
                      if (uu.field_a.field_Yb) {
                        if (uu.field_a.field_Jb > uu.field_a.field_Mb) {
                          if (!var14.field_Hb) {
                            if (param1) {
                              if (var14.field_Fb) {
                                ((lja) this).field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[1]));
                                ((lja) this).field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[1]));
                                return;
                              } else {
                                ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                                return;
                              }
                            } else {
                              ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                              return;
                            }
                          } else {
                            ((lja) this).field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[1]));
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
        } else {
          if (((lja) this).field_i != null) {
            if (((lja) this).field_g != rb.field_r) {
              if (null != uu.field_a) {
                if (mka.b(8192)) {
                  var13 = nl.a(true, ((lja) this).field_g);
                  var4 = vba.a((byte) -40, ((lja) this).field_g);
                  var5 = this.b(-13);
                  if (var4 != null) {
                    if (uu.field_a.field_ec) {
                      if (uu.field_a.field_Kb >= 0) {
                        ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                      return;
                    }
                  } else {
                    if (var13 != null) {
                      if (uu.field_a.field_Yb) {
                        if (uu.field_a.field_Jb > uu.field_a.field_Mb) {
                          if (!var13.field_Hb) {
                            if (param1) {
                              if (var13.field_Fb) {
                                ((lja) this).field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[1]));
                                ((lja) this).field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[1]));
                                return;
                              } else {
                                ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                                return;
                              }
                            } else {
                              ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                              return;
                            }
                          } else {
                            ((lja) this).field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[1]));
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

    final void c(int param0) {
        String var2 = null;
        Object var3 = null;
        String var4 = null;
        L0: {
          if (((lja) this).field_i == null) {
            break L0;
          } else {
            if (((lja) this).field_g == rb.field_r) {
              break L0;
            } else {
              var4 = this.b(-13);
              var2 = var4;
              ((lja) this).field_f.a((byte) -81, 17, gl.a((byte) 122, vj.field_c, new String[1]));
              break L0;
            }
          }
        }
        if (param0 != 0) {
          var3 = null;
          ((lja) this).a((gqa) null, -104);
          return;
        } else {
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param2 >= 93) {
          if (-18 == (param1 ^ -1)) {
            fj.field_c = new wla(((lja) this).field_h.field_q, ((lja) this).field_h.field_A, ((lja) this).field_h.field_G, ((lja) this).field_h.field_t, param0, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, ((lja) this).field_i, ((lja) this).field_g);
            return true;
          } else {
            return false;
          }
        } else {
          field_a = null;
          if (-18 == (param1 ^ -1)) {
            fj.field_c = new wla(((lja) this).field_h.field_q, ((lja) this).field_h.field_A, ((lja) this).field_h.field_G, ((lja) this).field_h.field_t, param0, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, ((lja) this).field_i, ((lja) this).field_g);
            return true;
          } else {
            return false;
          }
        }
    }

    lja(jea param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((lja) this).field_f = new ola(eq.field_n);
        ((lja) this).field_i = param2;
        ((lja) this).field_h = param0;
        ((lja) this).field_b = param5;
        param0.field_cb = true;
        ((lja) this).field_e = param6;
        ((lja) this).field_g = param1;
        ((lja) this).field_k = param4;
        ((lja) this).field_d = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_j = new fp();
        field_a = "That treasure's valuable, but heavy, so it'll slow you down. Drop it using <img=8><img=9> if you need to.";
    }
}
