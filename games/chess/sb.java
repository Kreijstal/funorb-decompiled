/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bj {
    static int field_sb;
    static int field_rb;
    static int field_tb;

    final static boolean j(byte param0) {
        if (kn.field_L) {
          if (param0 == 78) {
            if (-1 != vk.field_g) {
              return false;
            } else {
              return true;
            }
          } else {
            field_sb = 57;
            if (-1 != vk.field_g) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static aj b(String param0, boolean param1) {
        if (param1) {
          if (ci.field_ub != vl.field_A) {
            if (vl.field_A == kn.field_D) {
              if (param0.equals((Object) (Object) lc.field_e)) {
                vl.field_A = ji.field_T;
                return kf.field_j;
              } else {
                lc.field_e = param0;
                kf.field_j = null;
                vl.field_A = ci.field_ub;
                return null;
              }
            } else {
              lc.field_e = param0;
              kf.field_j = null;
              vl.field_A = ci.field_ub;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_sb = 58;
          if (ci.field_ub != vl.field_A) {
            if (vl.field_A == kn.field_D) {
              if (!param0.equals((Object) (Object) lc.field_e)) {
                lc.field_e = param0;
                kf.field_j = null;
                vl.field_A = ci.field_ub;
                return null;
              } else {
                vl.field_A = ji.field_T;
                return kf.field_j;
              }
            } else {
              lc.field_e = param0;
              kf.field_j = null;
              vl.field_A = ci.field_ub;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_15_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_161_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        L0: {
          var3 = Chess.field_G;
          if (-1 != ac.field_k) {
            break L0;
          } else {
            if ((kj.field_c ^ -1) == 0) {
              ac.field_k = hn.field_k;
              kj.field_c = rf.field_b;
              break L0;
            } else {
              ei.field_u = ei.field_u + 1;
              if (param1) {
                L1: {
                  L2: {
                    if (param0 != null) {
                      if (param0.equals((Object) (Object) eg.field_j)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      if (eg.field_j != null) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!uk.field_e) {
                      if (ei.field_u >= be.field_f) {
                        if (ei.field_u < sj.field_n + be.field_f) {
                          stackOut_50_0 = 1;
                          stackIn_52_0 = stackOut_50_0;
                          break L3;
                        } else {
                          stackOut_49_0 = 0;
                          stackIn_52_0 = stackOut_49_0;
                          break L3;
                        }
                      } else {
                        stackOut_47_0 = 0;
                        stackIn_52_0 = stackOut_47_0;
                        break L3;
                      }
                    } else {
                      stackOut_45_0 = 0;
                      stackIn_52_0 = stackOut_45_0;
                      break L3;
                    }
                  }
                  L4: {
                    var2 = stackIn_52_0;
                    if (param0 == null) {
                      ei.field_u = 0;
                      break L4;
                    } else {
                      if (!uk.field_e) {
                        if (var2 == 0) {
                          ei.field_u = 0;
                          break L4;
                        } else {
                          ei.field_u = be.field_f;
                          break L4;
                        }
                      } else {
                        ei.field_u = be.field_f;
                        break L4;
                      }
                    }
                  }
                  vn.field_Db = kj.field_c;
                  if (param0 != null) {
                    uk.field_e = false;
                    fm.field_S = ac.field_k;
                    break L1;
                  } else {
                    if (var2 != 0) {
                      uk.field_e = true;
                      fm.field_S = ac.field_k;
                      break L1;
                    } else {
                      fm.field_S = ac.field_k;
                      break L1;
                    }
                  }
                }
                L5: {
                  if (uk.field_e) {
                    break L5;
                  } else {
                    if (ei.field_u >= be.field_f) {
                      break L5;
                    } else {
                      if (lf.field_O) {
                        fm.field_S = ac.field_k;
                        ei.field_u = 0;
                        vn.field_Db = kj.field_c;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    eg.field_j = param0;
                    if (!uk.field_e) {
                      break L7;
                    } else {
                      if (ei.field_u != ae.field_k) {
                        break L7;
                      } else {
                        uk.field_e = false;
                        ei.field_u = 0;
                        kj.field_c = -1;
                        ac.field_k = -1;
                        break L6;
                      }
                    }
                  }
                  kj.field_c = -1;
                  ac.field_k = -1;
                  break L6;
                }
                return;
              } else {
                L8: {
                  L9: {
                    var4 = null;
                    aj discarded$2 = sb.b((String) null, true);
                    if (param0 != null) {
                      if (param0.equals((Object) (Object) eg.field_j)) {
                        break L8;
                      } else {
                        break L9;
                      }
                    } else {
                      if (eg.field_j != null) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (!uk.field_e) {
                      if (ei.field_u >= be.field_f) {
                        if (ei.field_u < sj.field_n + be.field_f) {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L10;
                        } else {
                          stackOut_12_0 = 0;
                          stackIn_15_0 = stackOut_12_0;
                          break L10;
                        }
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_15_0 = stackOut_10_0;
                        break L10;
                      }
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_15_0 = stackOut_8_0;
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      var2 = stackIn_15_0;
                      if (param0 == null) {
                        break L12;
                      } else {
                        if (!uk.field_e) {
                          if (var2 == 0) {
                            break L12;
                          } else {
                            ei.field_u = be.field_f;
                            break L11;
                          }
                        } else {
                          ei.field_u = be.field_f;
                          break L11;
                        }
                      }
                    }
                    ei.field_u = 0;
                    break L11;
                  }
                  L13: {
                    vn.field_Db = kj.field_c;
                    if (param0 != null) {
                      uk.field_e = false;
                      break L13;
                    } else {
                      if (var2 != 0) {
                        uk.field_e = true;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  fm.field_S = ac.field_k;
                  break L8;
                }
                L14: {
                  if (uk.field_e) {
                    eg.field_j = param0;
                    if (!uk.field_e) {
                      break L14;
                    } else {
                      L15: {
                        if (ei.field_u == ae.field_k) {
                          break L15;
                        } else {
                          eg.field_j = param0;
                          if (!uk.field_e) {
                            break L14;
                          } else {
                            if (ei.field_u != ae.field_k) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      uk.field_e = false;
                      ei.field_u = 0;
                      break L14;
                    }
                  } else {
                    eg.field_j = param0;
                    if (!uk.field_e) {
                      break L14;
                    } else {
                      if (ei.field_u != ae.field_k) {
                        break L14;
                      } else {
                        uk.field_e = false;
                        ei.field_u = 0;
                        break L14;
                      }
                    }
                  }
                }
                kj.field_c = -1;
                ac.field_k = -1;
                return;
              }
            }
          }
        }
        ei.field_u = ei.field_u + 1;
        if (param1) {
          L16: {
            if (param0 != null) {
              if (!param0.equals((Object) (Object) eg.field_j)) {
                break L16;
              } else {
                L17: {
                  if (uk.field_e) {
                    break L17;
                  } else {
                    if (ei.field_u >= be.field_f) {
                      break L17;
                    } else {
                      if (lf.field_O) {
                        fm.field_S = ac.field_k;
                        ei.field_u = 0;
                        vn.field_Db = kj.field_c;
                        break L17;
                      } else {
                        eg.field_j = param0;
                        if (uk.field_e) {
                          if (ei.field_u == ae.field_k) {
                            uk.field_e = false;
                            ei.field_u = 0;
                            kj.field_c = -1;
                            ac.field_k = -1;
                            return;
                          } else {
                            kj.field_c = -1;
                            ac.field_k = -1;
                            return;
                          }
                        } else {
                          kj.field_c = -1;
                          ac.field_k = -1;
                          return;
                        }
                      }
                    }
                  }
                }
                eg.field_j = param0;
                if (uk.field_e) {
                  if (ei.field_u != ae.field_k) {
                    kj.field_c = -1;
                    ac.field_k = -1;
                    return;
                  } else {
                    uk.field_e = false;
                    ei.field_u = 0;
                    kj.field_c = -1;
                    ac.field_k = -1;
                    return;
                  }
                } else {
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                }
              }
            } else {
              if (eg.field_j == null) {
                break L16;
              } else {
                L18: {
                  if (uk.field_e) {
                    break L18;
                  } else {
                    if (ei.field_u >= be.field_f) {
                      break L18;
                    } else {
                      if (lf.field_O) {
                        fm.field_S = ac.field_k;
                        ei.field_u = 0;
                        vn.field_Db = kj.field_c;
                        break L18;
                      } else {
                        eg.field_j = param0;
                        if (uk.field_e) {
                          if (ei.field_u == ae.field_k) {
                            uk.field_e = false;
                            ei.field_u = 0;
                            kj.field_c = -1;
                            ac.field_k = -1;
                            return;
                          } else {
                            kj.field_c = -1;
                            ac.field_k = -1;
                            return;
                          }
                        } else {
                          kj.field_c = -1;
                          ac.field_k = -1;
                          return;
                        }
                      }
                    }
                  }
                }
                eg.field_j = param0;
                if (uk.field_e) {
                  if (ei.field_u == ae.field_k) {
                    uk.field_e = false;
                    ei.field_u = 0;
                    kj.field_c = -1;
                    ac.field_k = -1;
                    return;
                  } else {
                    kj.field_c = -1;
                    ac.field_k = -1;
                    return;
                  }
                } else {
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                }
              }
            }
          }
          L19: {
            if (!uk.field_e) {
              if (ei.field_u >= be.field_f) {
                if (ei.field_u >= sj.field_n + be.field_f) {
                  stackOut_160_0 = 0;
                  stackIn_161_0 = stackOut_160_0;
                  break L19;
                } else {
                  stackOut_159_0 = 1;
                  stackIn_161_0 = stackOut_159_0;
                  break L19;
                }
              } else {
                stackOut_157_0 = 0;
                stackIn_161_0 = stackOut_157_0;
                break L19;
              }
            } else {
              stackOut_155_0 = 0;
              stackIn_161_0 = stackOut_155_0;
              break L19;
            }
          }
          L20: {
            var2 = stackIn_161_0;
            if (param0 == null) {
              ei.field_u = 0;
              break L20;
            } else {
              if (uk.field_e) {
                ei.field_u = be.field_f;
                break L20;
              } else {
                if (var2 != 0) {
                  L21: {
                    ei.field_u = be.field_f;
                    vn.field_Db = kj.field_c;
                    if (param0 != null) {
                      uk.field_e = false;
                      break L21;
                    } else {
                      if (var2 != 0) {
                        uk.field_e = true;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    fm.field_S = ac.field_k;
                    if (!uk.field_e) {
                      eg.field_j = param0;
                      if (!uk.field_e) {
                        break L22;
                      } else {
                        if (ei.field_u != ae.field_k) {
                          break L22;
                        } else {
                          uk.field_e = false;
                          ei.field_u = 0;
                          break L22;
                        }
                      }
                    } else {
                      eg.field_j = param0;
                      if (!uk.field_e) {
                        break L22;
                      } else {
                        if (ei.field_u != ae.field_k) {
                          break L22;
                        } else {
                          uk.field_e = false;
                          ei.field_u = 0;
                          break L22;
                        }
                      }
                    }
                  }
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                } else {
                  ei.field_u = 0;
                  break L20;
                }
              }
            }
          }
          vn.field_Db = kj.field_c;
          if (param0 != null) {
            L23: {
              uk.field_e = false;
              fm.field_S = ac.field_k;
              if (uk.field_e) {
                break L23;
              } else {
                if (ei.field_u >= be.field_f) {
                  break L23;
                } else {
                  if (lf.field_O) {
                    fm.field_S = ac.field_k;
                    ei.field_u = 0;
                    vn.field_Db = kj.field_c;
                    break L23;
                  } else {
                    L24: {
                      eg.field_j = param0;
                      if (!uk.field_e) {
                        break L24;
                      } else {
                        if (ei.field_u != ae.field_k) {
                          break L24;
                        } else {
                          uk.field_e = false;
                          ei.field_u = 0;
                          break L24;
                        }
                      }
                    }
                    kj.field_c = -1;
                    ac.field_k = -1;
                    return;
                  }
                }
              }
            }
            eg.field_j = param0;
            if (uk.field_e) {
              if (ei.field_u != ae.field_k) {
                kj.field_c = -1;
                ac.field_k = -1;
                return;
              } else {
                uk.field_e = false;
                ei.field_u = 0;
                kj.field_c = -1;
                ac.field_k = -1;
                return;
              }
            } else {
              kj.field_c = -1;
              ac.field_k = -1;
              return;
            }
          } else {
            if (var2 != 0) {
              L25: {
                uk.field_e = true;
                fm.field_S = ac.field_k;
                if (uk.field_e) {
                  break L25;
                } else {
                  if (ei.field_u >= be.field_f) {
                    break L25;
                  } else {
                    if (lf.field_O) {
                      fm.field_S = ac.field_k;
                      ei.field_u = 0;
                      vn.field_Db = kj.field_c;
                      break L25;
                    } else {
                      L26: {
                        eg.field_j = param0;
                        if (!uk.field_e) {
                          break L26;
                        } else {
                          if (ei.field_u != ae.field_k) {
                            break L26;
                          } else {
                            uk.field_e = false;
                            ei.field_u = 0;
                            break L26;
                          }
                        }
                      }
                      kj.field_c = -1;
                      ac.field_k = -1;
                      return;
                    }
                  }
                }
              }
              eg.field_j = param0;
              if (uk.field_e) {
                if (ei.field_u == ae.field_k) {
                  uk.field_e = false;
                  ei.field_u = 0;
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                } else {
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                }
              } else {
                kj.field_c = -1;
                ac.field_k = -1;
                return;
              }
            } else {
              L27: {
                fm.field_S = ac.field_k;
                if (uk.field_e) {
                  break L27;
                } else {
                  if (ei.field_u >= be.field_f) {
                    break L27;
                  } else {
                    if (lf.field_O) {
                      fm.field_S = ac.field_k;
                      ei.field_u = 0;
                      vn.field_Db = kj.field_c;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                }
              }
              eg.field_j = param0;
              if (uk.field_e) {
                if (ei.field_u != ae.field_k) {
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                } else {
                  uk.field_e = false;
                  ei.field_u = 0;
                  kj.field_c = -1;
                  ac.field_k = -1;
                  return;
                }
              } else {
                kj.field_c = -1;
                ac.field_k = -1;
                return;
              }
            }
          }
        } else {
          L28: {
            L29: {
              var4 = null;
              aj discarded$3 = sb.b((String) null, true);
              if (param0 != null) {
                if (param0.equals((Object) (Object) eg.field_j)) {
                  break L28;
                } else {
                  break L29;
                }
              } else {
                if (eg.field_j != null) {
                  break L28;
                } else {
                  break L29;
                }
              }
            }
            L30: {
              if (!uk.field_e) {
                if (ei.field_u >= be.field_f) {
                  if (ei.field_u >= sj.field_n + be.field_f) {
                    stackOut_94_0 = 0;
                    stackIn_96_0 = stackOut_94_0;
                    break L30;
                  } else {
                    stackOut_93_0 = 1;
                    stackIn_96_0 = stackOut_93_0;
                    break L30;
                  }
                } else {
                  stackOut_91_0 = 0;
                  stackIn_96_0 = stackOut_91_0;
                  break L30;
                }
              } else {
                stackOut_89_0 = 0;
                stackIn_96_0 = stackOut_89_0;
                break L30;
              }
            }
            L31: {
              var2 = stackIn_96_0;
              if (param0 == null) {
                ei.field_u = 0;
                break L31;
              } else {
                L32: {
                  if (uk.field_e) {
                    break L32;
                  } else {
                    if (var2 != 0) {
                      break L32;
                    } else {
                      ei.field_u = 0;
                      break L31;
                    }
                  }
                }
                ei.field_u = be.field_f;
                break L31;
              }
            }
            L33: {
              vn.field_Db = kj.field_c;
              if (param0 != null) {
                uk.field_e = false;
                break L33;
              } else {
                if (var2 != 0) {
                  uk.field_e = true;
                  break L33;
                } else {
                  break L33;
                }
              }
            }
            fm.field_S = ac.field_k;
            break L28;
          }
          L34: {
            if (!uk.field_e) {
              eg.field_j = param0;
              if (!uk.field_e) {
                break L34;
              } else {
                if (ei.field_u != ae.field_k) {
                  break L34;
                } else {
                  uk.field_e = false;
                  ei.field_u = 0;
                  break L34;
                }
              }
            } else {
              eg.field_j = param0;
              if (!uk.field_e) {
                break L34;
              } else {
                if (ei.field_u != ae.field_k) {
                  break L34;
                } else {
                  uk.field_e = false;
                  ei.field_u = 0;
                  break L34;
                }
              }
            }
          }
          kj.field_c = -1;
          ac.field_k = -1;
          return;
        }
    }

    final void c(mf param0, int param1) {
        super.c(param0, 117);
        if (param1 < 45) {
            field_sb = -34;
        }
    }

    final static void d(int param0, int param1, int param2) {
        ac.field_k = param2;
        kj.field_c = param1;
        if (param0 != 33) {
            Object var4 = null;
            sb.a((String) null, true);
        }
    }

    sb(fm param0, mf param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_tb = 360;
    }
}
