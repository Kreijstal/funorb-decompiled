/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private int field_g;
    static ka[] field_h;
    static int field_c;
    int field_b;
    int field_j;
    static int field_f;
    private int field_a;
    private int field_i;
    private int field_d;
    private boolean field_e;

    final boolean a(byte param0) {
        if (param0 > -46) {
            return false;
        }
        return 0 != ((rl) this).field_i ? true : false;
    }

    final static ka[] a(int param0, int param1, lj param2, byte param3) {
        if (param3 == 17) {
          if (!lk.a(param3 ^ 177, param2, param1, param0)) {
            return null;
          } else {
            return lb.f(param3 ^ 221);
          }
        } else {
          field_f = -112;
          if (!lk.a(param3 ^ 177, param2, param1, param0)) {
            return null;
          } else {
            return lb.f(param3 ^ 221);
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 >= 35) {
          if (0 == ((rl) this).field_d) {
            if (-85 != (((rl) this).field_a ^ -1)) {
              if (((rl) this).field_a == 83) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static ka b(boolean param0) {
        int var1 = 0;
        int[] var3 = null;
        int var4_int = 0;
        ka var4 = null;
        int var5 = 0;
        int[] var7 = null;
        byte[] var8 = null;
        int[] var9 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        var1 = pg.field_r[0] * lg.field_e[0];
        var8 = h.field_a[0];
        var9 = new int[var1];
        var7 = var9;
        var3 = var7;
        if (!param0) {
          field_c = 104;
          var4_int = 0;
          L0: while (true) {
            if (var1 <= var4_int) {
              var4 = new ka(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], var9);
              p.a(0);
              return var4;
            } else {
              var3[var4_int] = td.field_m[jh.a((int) var8[var4_int], 255)];
              var4_int++;
              continue L0;
            }
          }
        } else {
          var4_int = 0;
          L1: while (true) {
            if (var1 <= var4_int) {
              var4 = new ka(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], var9);
              p.a(0);
              return var4;
            } else {
              var3[var4_int] = td.field_m[jh.a((int) var8[var4_int], 255)];
              var4_int++;
              continue L1;
            }
          }
        }
    }

    final void b(int param0) {
        ((rl) this).field_d = 0;
        ((rl) this).field_a = 0;
        if (param0 == 15275) {
          if (-1 == (((rl) this).field_i ^ -1)) {
            if ((b.field_J ^ -1) == -99) {
              if (((rl) this).field_j > 0) {
                L0: {
                  ((rl) this).field_e = false;
                  ((rl) this).field_j = ((rl) this).field_j - 1;
                  if (((rl) this).field_i == 0) {
                    ((rl) this).field_a = b.field_J;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (0 == ((rl) this).field_i) {
                  if (99 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_b > ((rl) this).field_j) {
                      return;
                    } else {
                      ((rl) this).field_j = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((rl) this).field_j = ((rl) this).field_b;
                L1: {
                  ((rl) this).field_e = false;
                  ((rl) this).field_j = ((rl) this).field_j - 1;
                  if (((rl) this).field_i == 0) {
                    ((rl) this).field_a = b.field_J;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (0 == ((rl) this).field_i) {
                  if (99 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_b > ((rl) this).field_j) {
                      return;
                    } else {
                      ((rl) this).field_j = 0;
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
              L2: {
                if (((rl) this).field_i == 0) {
                  ((rl) this).field_a = b.field_J;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 == ((rl) this).field_i) {
                if (99 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  ((rl) this).field_e = false;
                  if (((rl) this).field_b > ((rl) this).field_j) {
                    return;
                  } else {
                    ((rl) this).field_j = 0;
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
            L3: {
              if (((rl) this).field_i == 0) {
                ((rl) this).field_a = b.field_J;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == ((rl) this).field_i) {
              if (99 == b.field_J) {
                ((rl) this).field_j = ((rl) this).field_j + 1;
                ((rl) this).field_e = false;
                if (((rl) this).field_b > ((rl) this).field_j) {
                  return;
                } else {
                  ((rl) this).field_j = 0;
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
    }

    final boolean d(int param0) {
        if (param0 > -84) {
            return false;
        }
        return (((rl) this).field_a ^ -1) == -104 ? true : false;
    }

    final void b(int param0, int param1) {
        if (param0 >= -119) {
          L0: {
            ((rl) this).field_d = -71;
            if (-1 == ((rl) this).field_i) {
              ((rl) this).field_e = false;
              ((rl) this).field_j = param1;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-1 == ((rl) this).field_i) {
              ((rl) this).field_e = false;
              ((rl) this).field_j = param1;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        ((rl) this).field_a = param0;
        ((rl) this).field_d = 0;
        if (((rl) this).field_i == 0) {
          if ((b.field_J ^ -1) == -97) {
            L0: {
              if (((rl) this).field_j <= 0) {
                ((rl) this).field_j = ((rl) this).field_b;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              ((rl) this).field_j = ((rl) this).field_j - 1;
              ((rl) this).field_e = false;
              if (0 == ((rl) this).field_i) {
                ((rl) this).field_a = b.field_J;
                break L1;
              } else {
                break L1;
              }
            }
            if (0 == ((rl) this).field_i) {
              if ((b.field_J ^ -1) != -98) {
                return;
              } else {
                L2: {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b <= ((rl) this).field_j) {
                    ((rl) this).field_j = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((rl) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              if (0 == ((rl) this).field_i) {
                ((rl) this).field_a = b.field_J;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == ((rl) this).field_i) {
              if ((b.field_J ^ -1) != -98) {
                return;
              } else {
                L4: {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b <= ((rl) this).field_j) {
                    ((rl) this).field_j = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((rl) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L5: {
            if (0 == ((rl) this).field_i) {
              ((rl) this).field_a = b.field_J;
              break L5;
            } else {
              break L5;
            }
          }
          if (0 == ((rl) this).field_i) {
            if ((b.field_J ^ -1) != -98) {
              return;
            } else {
              L6: {
                ((rl) this).field_j = ((rl) this).field_j + 1;
                if (((rl) this).field_b <= ((rl) this).field_j) {
                  ((rl) this).field_j = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              ((rl) this).field_e = false;
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -82) {
            field_h = null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final void a(int param0, int param1) {
        ((rl) this).field_d = 0;
        ((rl) this).field_a = 0;
        if (((rl) this).field_i == 0) {
          if (-97 == (b.field_J ^ -1)) {
            L0: {
              if (((rl) this).field_j <= 0) {
                ((rl) this).field_j = ((rl) this).field_b;
                break L0;
              } else {
                break L0;
              }
            }
            ((rl) this).field_e = false;
            ((rl) this).field_j = ((rl) this).field_j - 1;
            if (((rl) this).field_i != param0) {
              if (((rl) this).field_i != -1) {
                if (((rl) this).field_i == 0) {
                  L1: {
                    if (-99 == b.field_J) {
                      break L1;
                    } else {
                      if (-100 == b.field_J) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (97 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b > ((rl) this).field_j) {
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i == 0) {
                      L2: {
                        if (-99 == b.field_J) {
                          break L2;
                        } else {
                          if (-100 == b.field_J) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((rl) this).field_j = 0;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i == 0) {
                      L3: {
                        if (-99 == b.field_J) {
                          break L3;
                        } else {
                          if (-100 == b.field_J) {
                            break L3;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (((rl) this).field_i == 0) {
                    L4: {
                      if (-99 == b.field_J) {
                        break L4;
                      } else {
                        if (-100 == (b.field_J ^ -1)) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L5: {
                ((rl) this).field_a = b.field_J;
                if (((rl) this).field_i != 0) {
                  break L5;
                } else {
                  if (97 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    if (((rl) this).field_b > ((rl) this).field_j) {
                      ((rl) this).field_e = false;
                      if (((rl) this).field_i == 0) {
                        L6: {
                          if (-99 == b.field_J) {
                            break L6;
                          } else {
                            if (-100 == b.field_J) {
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                        if (((rl) this).field_j >= 0) {
                          ((rl) this).field_e = false;
                          return;
                        } else {
                          ((rl) this).field_j = param1;
                          ((rl) this).field_e = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((rl) this).field_j = 0;
                      ((rl) this).field_e = false;
                      if (((rl) this).field_i == 0) {
                        L7: {
                          if (-99 == b.field_J) {
                            break L7;
                          } else {
                            if (-100 == b.field_J) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        if (((rl) this).field_j >= 0) {
                          ((rl) this).field_e = false;
                          return;
                        } else {
                          ((rl) this).field_j = param1;
                          ((rl) this).field_e = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              if (((rl) this).field_i == 0) {
                if (-99 != (b.field_J ^ -1)) {
                  if (-100 == (b.field_J ^ -1)) {
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (((rl) this).field_i != param0) {
              if (((rl) this).field_i != -1) {
                if (((rl) this).field_i == 0) {
                  L8: {
                    if (-99 == b.field_J) {
                      break L8;
                    } else {
                      if (-100 == b.field_J) {
                        break L8;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (97 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b > ((rl) this).field_j) {
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i == 0) {
                      L9: {
                        if (-99 == b.field_J) {
                          break L9;
                        } else {
                          if (-100 == b.field_J) {
                            break L9;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((rl) this).field_j = 0;
                    ((rl) this).field_e = false;
                    if (((rl) this).field_i == 0) {
                      L10: {
                        if (-99 == b.field_J) {
                          break L10;
                        } else {
                          if (-100 == b.field_J) {
                            break L10;
                          } else {
                            return;
                          }
                        }
                      }
                      if (((rl) this).field_j >= 0) {
                        ((rl) this).field_e = false;
                        return;
                      } else {
                        ((rl) this).field_j = param1;
                        ((rl) this).field_e = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (((rl) this).field_i == 0) {
                    L11: {
                      if (-99 == b.field_J) {
                        break L11;
                      } else {
                        if (-100 == (b.field_J ^ -1)) {
                          break L11;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L12: {
                ((rl) this).field_a = b.field_J;
                if (((rl) this).field_i != 0) {
                  break L12;
                } else {
                  if (97 == b.field_J) {
                    ((rl) this).field_j = ((rl) this).field_j + 1;
                    if (((rl) this).field_b > ((rl) this).field_j) {
                      ((rl) this).field_e = false;
                      break L12;
                    } else {
                      ((rl) this).field_j = 0;
                      ((rl) this).field_e = false;
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
              }
              if (((rl) this).field_i == 0) {
                L13: {
                  if (-99 == b.field_J) {
                    break L13;
                  } else {
                    if (-100 == b.field_J) {
                      break L13;
                    } else {
                      return;
                    }
                  }
                }
                if (((rl) this).field_j >= 0) {
                  ((rl) this).field_e = false;
                  return;
                } else {
                  ((rl) this).field_j = param1;
                  ((rl) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (((rl) this).field_i != param0) {
            if (((rl) this).field_i != -1) {
              if (((rl) this).field_i == 0) {
                L14: {
                  if (-99 == b.field_J) {
                    break L14;
                  } else {
                    if (-100 == b.field_J) {
                      break L14;
                    } else {
                      return;
                    }
                  }
                }
                if (((rl) this).field_j >= 0) {
                  ((rl) this).field_e = false;
                  return;
                } else {
                  ((rl) this).field_j = param1;
                  ((rl) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (97 == b.field_J) {
                ((rl) this).field_j = ((rl) this).field_j + 1;
                if (((rl) this).field_b > ((rl) this).field_j) {
                  ((rl) this).field_e = false;
                  if (((rl) this).field_i == 0) {
                    L15: {
                      if (-99 == b.field_J) {
                        break L15;
                      } else {
                        if (-100 == b.field_J) {
                          break L15;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((rl) this).field_j = 0;
                  ((rl) this).field_e = false;
                  if (((rl) this).field_i == 0) {
                    L16: {
                      if (-99 == b.field_J) {
                        break L16;
                      } else {
                        if (-100 == b.field_J) {
                          break L16;
                        } else {
                          return;
                        }
                      }
                    }
                    if (((rl) this).field_j >= 0) {
                      ((rl) this).field_e = false;
                      return;
                    } else {
                      ((rl) this).field_j = param1;
                      ((rl) this).field_e = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (((rl) this).field_i == 0) {
                  L17: {
                    if (-99 == b.field_J) {
                      break L17;
                    } else {
                      if (-100 == (b.field_J ^ -1)) {
                        break L17;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((rl) this).field_j >= 0) {
                    ((rl) this).field_e = false;
                    return;
                  } else {
                    ((rl) this).field_j = param1;
                    ((rl) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L18: {
              ((rl) this).field_a = b.field_J;
              if (((rl) this).field_i != 0) {
                break L18;
              } else {
                if (97 == b.field_J) {
                  ((rl) this).field_j = ((rl) this).field_j + 1;
                  if (((rl) this).field_b > ((rl) this).field_j) {
                    ((rl) this).field_e = false;
                    break L18;
                  } else {
                    ((rl) this).field_j = 0;
                    ((rl) this).field_e = false;
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
            }
            if (((rl) this).field_i == 0) {
              L19: {
                if (-99 == b.field_J) {
                  break L19;
                } else {
                  if (-100 == b.field_J) {
                    break L19;
                  } else {
                    return;
                  }
                }
              }
              if (((rl) this).field_j >= 0) {
                ((rl) this).field_e = false;
                return;
              } else {
                ((rl) this).field_j = param1;
                ((rl) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        ij.c((byte) -98);
        if (null != bg.field_P) {
          L0: {
            rk.a((byte) -100, bg.field_P);
            var1 = 0 / ((-30 - param0) / 53);
            cg.a((byte) -102);
            tc.c(-119);
            pa.f((byte) 109);
            if (td.a(20422)) {
              dk.field_s.d(25, 1);
              nb.a(0, -1);
              break L0;
            } else {
              break L0;
            }
          }
          ob.b(-95);
          return;
        } else {
          L1: {
            var1 = 0 / ((-30 - param0) / 53);
            cg.a((byte) -102);
            tc.c(-119);
            pa.f((byte) 109);
            if (td.a(20422)) {
              dk.field_s.d(25, 1);
              nb.a(0, -1);
              break L1;
            } else {
              break L1;
            }
          }
          ob.b(-95);
          return;
        }
    }

    final void e(int param0) {
        ((rl) this).field_a = 0;
        ((rl) this).field_d = param0;
        if (!(((rl) this).field_i != 0)) {
            ((rl) this).field_a = b.field_J;
        }
    }

    final boolean g(int param0) {
        if (param0 >= -109) {
            return true;
        }
        return -98 == (((rl) this).field_a ^ -1) ? true : false;
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((rl) this).field_i = 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((rl) this).field_e = stackIn_3_1 != 0;
        if (((rl) this).field_e) {
          ((rl) this).field_j = param3;
          var5 = -113 / ((-43 - param0) / 35);
          return;
        } else {
          ((rl) this).field_j = param2;
          var5 = -113 / ((-43 - param0) / 35);
          return;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 8543) {
          L0: {
            boolean discarded$10 = ((rl) this).c((byte) 30);
            if ((((rl) this).field_a ^ -1) != -103) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((rl) this).field_a ^ -1) != -103) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return -97 == (((rl) this).field_a ^ -1) ? true : false;
    }

    final void a(byte param0, int param1, int param2) {
        if (((rl) this).field_b > param1) {
          if (((rl) this).field_b <= param2) {
            throw new IllegalArgumentException();
          } else {
            ((rl) this).field_d = 0;
            ((rl) this).field_a = 0;
            if (vb.field_n != 0) {
              ((rl) this).field_d = vb.field_n;
              ((rl) this).field_i = vb.field_n;
              ((rl) this).field_e = true;
              ((rl) this).field_j = param2;
              ((rl) this).field_g = pl.field_a;
              if (((rl) this).field_i != 0) {
                L0: {
                  if (0 != wh.field_e) {
                    L1: {
                      if (0 >= ((rl) this).field_g) {
                        ((rl) this).field_g = v.field_W;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((rl) this).field_g = ((rl) this).field_g - 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (0 == vb.field_n) {
                  if (-1 == wh.field_e) {
                    L2: {
                      ((rl) this).field_i = 0;
                      if (param0 > 1) {
                        break L2;
                      } else {
                        ((rl) this).field_d = 76;
                        break L2;
                      }
                    }
                    if (-1 == ((rl) this).field_i) {
                      L3: {
                        L4: {
                          if (((rl) this).field_e) {
                            break L4;
                          } else {
                            if (ek.field_P) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (-1 > param1) {
                          if (!((rl) this).field_e) {
                            return;
                          } else {
                            ((rl) this).field_j = -1;
                            return;
                          }
                        } else {
                          if (param1 != ((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            break L3;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > 1) {
                      if (-1 == ((rl) this).field_i) {
                        L5: {
                          if (((rl) this).field_e) {
                            break L5;
                          } else {
                            if (ek.field_P) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        if (-1 > param1) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param1 != ((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((rl) this).field_d = 76;
                      if (-1 == ((rl) this).field_i) {
                        L6: {
                          if (((rl) this).field_e) {
                            break L6;
                          } else {
                            if (ek.field_P) {
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                        if (-1 < (param1 ^ -1)) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param1 != ((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 > 1) {
                    if (-1 == ((rl) this).field_i) {
                      L7: {
                        if (((rl) this).field_e) {
                          break L7;
                        } else {
                          if (ek.field_P) {
                            break L7;
                          } else {
                            return;
                          }
                        }
                      }
                      if (-1 > param1) {
                        if (!((rl) this).field_e) {
                          return;
                        } else {
                          ((rl) this).field_j = -1;
                          return;
                        }
                      } else {
                        if (param1 != ((rl) this).field_j) {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          return;
                        } else {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((rl) this).field_d = 76;
                    if (-1 == ((rl) this).field_i) {
                      L8: {
                        if (((rl) this).field_e) {
                          break L8;
                        } else {
                          if (ek.field_P) {
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                      if (-1 > param1) {
                        if (!((rl) this).field_e) {
                          return;
                        } else {
                          ((rl) this).field_j = -1;
                          return;
                        }
                      } else {
                        if (param1 != ((rl) this).field_j) {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          return;
                        } else {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L9: {
                  if (0 != vb.field_n) {
                    break L9;
                  } else {
                    if (-1 != wh.field_e) {
                      break L9;
                    } else {
                      L10: {
                        ((rl) this).field_i = 0;
                        if (param0 > 1) {
                          break L10;
                        } else {
                          ((rl) this).field_d = 76;
                          break L10;
                        }
                      }
                      L11: {
                        if (-1 != ((rl) this).field_i) {
                          break L11;
                        } else {
                          L12: {
                            if (((rl) this).field_e) {
                              break L12;
                            } else {
                              if (ek.field_P) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (-1 < (param1 ^ -1)) {
                            if (((rl) this).field_e) {
                              ((rl) this).field_j = -1;
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            if (param1 != ((rl) this).field_j) {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              break L11;
                            } else {
                              ((rl) this).field_e = true;
                              ((rl) this).field_j = param1;
                              break L11;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 > 1) {
                  if (-1 == ((rl) this).field_i) {
                    L13: {
                      if (((rl) this).field_e) {
                        break L13;
                      } else {
                        if (ek.field_P) {
                          break L13;
                        } else {
                          return;
                        }
                      }
                    }
                    if (-1 > param1) {
                      if (!((rl) this).field_e) {
                        return;
                      } else {
                        ((rl) this).field_j = -1;
                        return;
                      }
                    } else {
                      if (param1 != ((rl) this).field_j) {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        return;
                      } else {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L14: {
                    ((rl) this).field_d = 76;
                    if (-1 != ((rl) this).field_i) {
                      break L14;
                    } else {
                      L15: {
                        if (((rl) this).field_e) {
                          break L15;
                        } else {
                          if (ek.field_P) {
                            break L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (-1 > param1) {
                        if (((rl) this).field_e) {
                          ((rl) this).field_j = -1;
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        if (param1 != ((rl) this).field_j) {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          break L14;
                        } else {
                          ((rl) this).field_e = true;
                          ((rl) this).field_j = param1;
                          break L14;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L16: {
                if (((rl) this).field_i == 0) {
                  break L16;
                } else {
                  if (0 != wh.field_e) {
                    L17: {
                      if (0 >= ((rl) this).field_g) {
                        ((rl) this).field_g = v.field_W;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    ((rl) this).field_g = ((rl) this).field_g - 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L18: {
                if (0 != vb.field_n) {
                  break L18;
                } else {
                  if (-1 != wh.field_e) {
                    break L18;
                  } else {
                    L19: {
                      ((rl) this).field_i = 0;
                      if (param0 > 1) {
                        break L19;
                      } else {
                        ((rl) this).field_d = 76;
                        break L19;
                      }
                    }
                    L20: {
                      if (-1 != ((rl) this).field_i) {
                        break L20;
                      } else {
                        L21: {
                          if (((rl) this).field_e) {
                            break L21;
                          } else {
                            if (ek.field_P) {
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (-1 < (param1 ^ -1)) {
                          if (((rl) this).field_e) {
                            ((rl) this).field_j = -1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (param1 != ((rl) this).field_j) {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            break L20;
                          } else {
                            ((rl) this).field_e = true;
                            ((rl) this).field_j = param1;
                            break L20;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (param0 > 1) {
                if (-1 == ((rl) this).field_i) {
                  L22: {
                    if (((rl) this).field_e) {
                      break L22;
                    } else {
                      if (ek.field_P) {
                        break L22;
                      } else {
                        return;
                      }
                    }
                  }
                  if (-1 > param1) {
                    if (!((rl) this).field_e) {
                      return;
                    } else {
                      ((rl) this).field_j = -1;
                      return;
                    }
                  } else {
                    if (param1 != ((rl) this).field_j) {
                      ((rl) this).field_e = true;
                      ((rl) this).field_j = param1;
                      return;
                    } else {
                      ((rl) this).field_e = true;
                      ((rl) this).field_j = param1;
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L23: {
                  ((rl) this).field_d = 76;
                  if (-1 != ((rl) this).field_i) {
                    break L23;
                  } else {
                    L24: {
                      if (((rl) this).field_e) {
                        break L24;
                      } else {
                        if (ek.field_P) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (-1 > param1) {
                      if (((rl) this).field_e) {
                        ((rl) this).field_j = -1;
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      if (param1 != ((rl) this).field_j) {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        break L23;
                      } else {
                        ((rl) this).field_e = true;
                        ((rl) this).field_j = param1;
                        break L23;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    rl(int param0) {
        ((rl) this).field_j = 0;
        ((rl) this).field_e = false;
        ((rl) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
    }
}
