/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_a;

    final static void a(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        mi var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        mi var12 = null;
        int[] var13 = null;
        hq var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        Object var18 = null;
        hq var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        hq var21_ref = null;
        Object var22 = null;
        Object var23 = null;
        int[] var24 = null;
        Object var25 = null;
        hq var25_ref = null;
        Object var26 = null;
        hq var26_ref = null;
        Object var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        nf var30 = null;
        nf var31 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var25 = null;
        var26 = null;
        var27 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        var12 = id.field_f;
        var2 = var12.h(-11);
        if (param0 <= -108) {
          if (var2 != 0) {
            if (1 == var2) {
              var31 = (nf) (Object) ki.field_a.a((byte) 100);
              if (var31 == null) {
                rm.b((byte) 11);
                return;
              } else {
                var31.c(2);
                return;
              }
            } else {
              if (var2 == 2) {
                var26_ref = (hq) (Object) mo.field_h.a((byte) 100);
                if (var26_ref == null) {
                  rm.b((byte) 100);
                  return;
                } else {
                  var26_ref.field_n = mm.a(8);
                  var26_ref.field_o = true;
                  var26_ref.field_p = var26_ref.field_n[0];
                  var26_ref.c(2);
                  return;
                }
              } else {
                ke.a((Throwable) null, "A1: " + or.a(117), 0);
                rm.b((byte) 89);
                return;
              }
            }
          } else {
            var10 = mm.a(8);
            var29 = var10;
            var24 = var29;
            var16 = var24;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((ed) (Object) var5).h(-11);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var25_ref = (hq) (Object) mo.field_h.a((byte) 100);
                if (var25_ref == null) {
                  rm.b((byte) 88);
                  return;
                } else {
                  var25_ref.field_o = true;
                  var25_ref.field_n = var3;
                  var25_ref.field_p = var29[0];
                  var25_ref.c(2);
                  return;
                }
              } else {
                var9[var7] = ((ed) (Object) var5).b(true);
                var7++;
                continue L0;
              }
            }
          }
        } else {
          field_a = null;
          if (var2 != 0) {
            if (1 == var2) {
              var30 = (nf) (Object) ki.field_a.a((byte) 100);
              if (var30 == null) {
                rm.b((byte) 11);
                return;
              } else {
                var30.c(2);
                return;
              }
            } else {
              if (var2 == 2) {
                var21_ref = (hq) (Object) mo.field_h.a((byte) 100);
                var15 = var21_ref;
                if (var21_ref == null) {
                  rm.b((byte) 100);
                  return;
                } else {
                  var21_ref.field_n = mm.a(8);
                  var21_ref.field_o = true;
                  var21_ref.field_p = var21_ref.field_n[0];
                  var21_ref.c(2);
                  return;
                }
              } else {
                ke.a((Throwable) null, "A1: " + or.a(117), 0);
                rm.b((byte) 89);
                return;
              }
            }
          } else {
            var10 = mm.a(8);
            var28 = var10;
            var17 = var28;
            var16 = var17;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((ed) (Object) var5).h(-11);
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                var18_ref = (hq) (Object) mo.field_h.a((byte) 100);
                if (var18_ref == null) {
                  rm.b((byte) 88);
                  return;
                } else {
                  var18_ref.field_o = true;
                  var18_ref.field_n = var3;
                  var18_ref.field_p = var28[0];
                  var18_ref.c(2);
                  return;
                }
              } else {
                var9[var7] = ((ed) (Object) var5).b(true);
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 376) {
          if (param1 < 32) {
            if (param1 < 160) {
              L0: {
                if (param1 == 8364) {
                  break L0;
                } else {
                  if (param1 == 338) {
                    break L0;
                  } else {
                    if (param1 == 8212) {
                      break L0;
                    } else {
                      if (param1 == 339) {
                        break L0;
                      } else {
                        if (376 == param1) {
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              if (param1 > 255) {
                L1: {
                  if (param1 == 8364) {
                    break L1;
                  } else {
                    if (param1 == 338) {
                      break L1;
                    } else {
                      if (param1 == 8212) {
                        break L1;
                      } else {
                        if (param1 == 339) {
                          break L1;
                        } else {
                          if (376 == param1) {
                            break L1;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              } else {
                return true;
              }
            }
          } else {
            if (126 < param1) {
              if (param1 < 160) {
                L2: {
                  if (param1 == 8364) {
                    break L2;
                  } else {
                    if (param1 == 338) {
                      break L2;
                    } else {
                      if (param1 == 8212) {
                        break L2;
                      } else {
                        if (param1 == 339) {
                          break L2;
                        } else {
                          if (376 == param1) {
                            break L2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              } else {
                if (param1 > 255) {
                  L3: {
                    if (param1 == 8364) {
                      break L3;
                    } else {
                      if (param1 == 338) {
                        break L3;
                      } else {
                        if (param1 == 8212) {
                          break L3;
                        } else {
                          if (param1 == 339) {
                            break L3;
                          } else {
                            if (376 == param1) {
                              break L3;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          field_a = null;
          if (param1 >= 32) {
            if (126 >= param1) {
              return true;
            } else {
              if (param1 >= 160) {
                if (param1 <= 255) {
                  return true;
                } else {
                  L4: {
                    if (param1 == 8364) {
                      break L4;
                    } else {
                      if (param1 == 338) {
                        break L4;
                      } else {
                        if (param1 == 8212) {
                          break L4;
                        } else {
                          if (param1 == 339) {
                            break L4;
                          } else {
                            if (376 == param1) {
                              break L4;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                }
              } else {
                L5: {
                  if (param1 == 8364) {
                    break L5;
                  } else {
                    if (param1 == 338) {
                      break L5;
                    } else {
                      if (param1 == 8212) {
                        break L5;
                      } else {
                        if (param1 == 339) {
                          break L5;
                        } else {
                          if (376 == param1) {
                            break L5;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              }
            }
          } else {
            if (param1 < 160) {
              L6: {
                if (param1 == 8364) {
                  break L6;
                } else {
                  if (param1 == 338) {
                    break L6;
                  } else {
                    if (param1 == 8212) {
                      break L6;
                    } else {
                      if (param1 == 339) {
                        break L6;
                      } else {
                        if (376 == param1) {
                          break L6;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              if (param1 > 255) {
                if (param1 != 8364) {
                  if (param1 != 338) {
                    if (param1 != 8212) {
                      if (param1 != 339) {
                        if (376 != param1) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        ch.field_e.i(param0 ^ param0);
        if (!(null != bb.field_F)) {
            bb.field_F = new fg(ch.field_e, eg.field_t);
        }
        ch.field_e.b((iq) (Object) bb.field_F, 0);
    }

    public static void b(int param0) {
        if (param0 != 0) {
            p.b(36);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
