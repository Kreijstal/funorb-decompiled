/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private mg[] field_d;
    private boolean field_c;
    static e field_a;
    private int field_b;
    private String field_f;
    private boolean field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 80 % ((param0 - 73) / 32);
    }

    final static int a(byte param0, vk param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = HoldTheLine.field_D;
        if (param1.field_r) {
          return 0;
        } else {
          if (param1.field_j == null) {
            return 0;
          } else {
            if (param0 < 6) {
              var6 = null;
              int discarded$1 = kg.a((byte) 14, (vk) null);
              var2 = 0;
              if (0 != param1.field_o) {
                L0: {
                  L1: {
                    if (param1.field_o == 1) {
                      if (!a.field_F.b((byte) 10)) {
                        if (hf.field_h.b((byte) 10)) {
                          break L1;
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L2: while (true) {
                            if (param1.field_j.length <= var4) {
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              if (param1.field_j[var4].field_c) {
                                var3++;
                                var4++;
                                continue L2;
                              } else {
                                var4++;
                                continue L2;
                              }
                            }
                          }
                        }
                      } else {
                        L3: {
                          var2 += 16;
                          if (hf.field_h.b((byte) 10)) {
                            var2 += 16;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var3 = 0;
                        var4 = 0;
                        L4: while (true) {
                          if (param1.field_j.length <= var4) {
                            var2 = var2 + var3 * 224 / param1.field_j.length;
                            return var2;
                          } else {
                            if (param1.field_j[var4].field_c) {
                              var3++;
                              var4++;
                              continue L4;
                            } else {
                              var4++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      if (2 != param1.field_o) {
                        if (-4 == (param1.field_o ^ -1)) {
                          if (!kc.field_b.b((byte) 10)) {
                            if (!ug.field_b.b((byte) 10)) {
                              break L0;
                            } else {
                              var2 += 16;
                              var3 = 0;
                              var4 = 0;
                              L5: while (true) {
                                if (param1.field_j.length <= var4) {
                                  var2 = var2 + var3 * 224 / param1.field_j.length;
                                  return var2;
                                } else {
                                  if (param1.field_j[var4].field_c) {
                                    var3++;
                                    var4++;
                                    continue L5;
                                  } else {
                                    var4++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          } else {
                            var2 += 16;
                            if (!ug.field_b.b((byte) 10)) {
                              var3 = 0;
                              var4 = 0;
                              L6: while (true) {
                                if (param1.field_j.length <= var4) {
                                  var2 = var2 + var3 * 224 / param1.field_j.length;
                                  return var2;
                                } else {
                                  if (param1.field_j[var4].field_c) {
                                    var3++;
                                    var4++;
                                    continue L6;
                                  } else {
                                    var4++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var2 += 16;
                              var3 = 0;
                              var4 = 0;
                              L7: while (true) {
                                if (param1.field_j.length <= var4) {
                                  var2 = var2 + var3 * 224 / param1.field_j.length;
                                  return var2;
                                } else {
                                  if (param1.field_j[var4].field_c) {
                                    var3++;
                                    var4++;
                                    continue L7;
                                  } else {
                                    var4++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (4 != param1.field_o) {
                            if (5 != param1.field_o) {
                              if (param1.field_o == 6) {
                                L8: {
                                  if (hg.field_Q.b((byte) 10)) {
                                    var2 += 16;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                if (fd.field_e.b((byte) 10)) {
                                  var2 += 16;
                                  var3 = 0;
                                  var4 = 0;
                                  L9: while (true) {
                                    if (param1.field_j.length <= var4) {
                                      var2 = var2 + var3 * 224 / param1.field_j.length;
                                      return var2;
                                    } else {
                                      if (param1.field_j[var4].field_c) {
                                        var3++;
                                        var4++;
                                        continue L9;
                                      } else {
                                        var4++;
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  var3 = 0;
                                  var4 = 0;
                                  L10: while (true) {
                                    if (param1.field_j.length <= var4) {
                                      var2 = var2 + var3 * 224 / param1.field_j.length;
                                      return var2;
                                    } else {
                                      if (param1.field_j[var4].field_c) {
                                        var3++;
                                        var4++;
                                        continue L10;
                                      } else {
                                        var4++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3 = 0;
                                var4 = 0;
                                L11: while (true) {
                                  if (param1.field_j.length <= var4) {
                                    var2 = var2 + var3 * 224 / param1.field_j.length;
                                    return var2;
                                  } else {
                                    if (param1.field_j[var4].field_c) {
                                      var3++;
                                      var4++;
                                      continue L11;
                                    } else {
                                      var4++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!ha.field_i.b((byte) 10)) {
                                if (!kc.field_b.b((byte) 10)) {
                                  var3 = 0;
                                  var4 = 0;
                                  L12: while (true) {
                                    if (param1.field_j.length <= var4) {
                                      var2 = var2 + var3 * 224 / param1.field_j.length;
                                      return var2;
                                    } else {
                                      if (param1.field_j[var4].field_c) {
                                        var3++;
                                        var4++;
                                        continue L12;
                                      } else {
                                        var4++;
                                        continue L12;
                                      }
                                    }
                                  }
                                } else {
                                  var2 += 16;
                                  var3 = 0;
                                  var4 = 0;
                                  L13: while (true) {
                                    if (param1.field_j.length <= var4) {
                                      var2 = var2 + var3 * 224 / param1.field_j.length;
                                      return var2;
                                    } else {
                                      if (param1.field_j[var4].field_c) {
                                        var3++;
                                        var4++;
                                        continue L13;
                                      } else {
                                        var4++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var2 += 16;
                                if (kc.field_b.b((byte) 10)) {
                                  var2 += 16;
                                  var3 = 0;
                                  var4 = 0;
                                  L14: while (true) {
                                    if (param1.field_j.length <= var4) {
                                      var2 = var2 + var3 * 224 / param1.field_j.length;
                                      return var2;
                                    } else {
                                      if (param1.field_j[var4].field_c) {
                                        var3++;
                                        var4++;
                                        continue L14;
                                      } else {
                                        var4++;
                                        continue L14;
                                      }
                                    }
                                  }
                                } else {
                                  var3 = 0;
                                  var4 = 0;
                                  L15: while (true) {
                                    if (param1.field_j.length <= var4) {
                                      var2 = var2 + var3 * 224 / param1.field_j.length;
                                      return var2;
                                    } else {
                                      if (param1.field_j[var4].field_c) {
                                        var3++;
                                        var4++;
                                        continue L15;
                                      } else {
                                        var4++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L16: {
                              if (ug.field_b.b((byte) 10)) {
                                var2 += 16;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (ha.field_i.b((byte) 10)) {
                              var2 += 16;
                              var3 = 0;
                              var4 = 0;
                              L17: while (true) {
                                if (param1.field_j.length <= var4) {
                                  var2 = var2 + var3 * 224 / param1.field_j.length;
                                  return var2;
                                } else {
                                  if (param1.field_j[var4].field_c) {
                                    var3++;
                                    var4++;
                                    continue L17;
                                  } else {
                                    var4++;
                                    continue L17;
                                  }
                                }
                              }
                            } else {
                              break L0;
                            }
                          }
                        }
                      } else {
                        L18: {
                          if (a.field_F.b((byte) 10)) {
                            var2 += 16;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        if (lk.field_a.b((byte) 10)) {
                          break L1;
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L19: while (true) {
                            if (param1.field_j.length <= var4) {
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              if (param1.field_j[var4].field_c) {
                                var3++;
                                var4++;
                                continue L19;
                              } else {
                                var4++;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var2 += 16;
                  break L0;
                }
                var3 = 0;
                var4 = 0;
                L20: while (true) {
                  if (param1.field_j.length <= var4) {
                    var2 = var2 + var3 * 224 / param1.field_j.length;
                    return var2;
                  } else {
                    if (param1.field_j[var4].field_c) {
                      var3++;
                      var4++;
                      continue L20;
                    } else {
                      var4++;
                      continue L20;
                    }
                  }
                }
              } else {
                L21: {
                  if (ol.field_h.b((byte) 10)) {
                    var2 += 16;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                if (fd.field_e.b((byte) 10)) {
                  var2 += 16;
                  var3 = 0;
                  var4 = 0;
                  L22: while (true) {
                    if (param1.field_j.length <= var4) {
                      var2 = var2 + var3 * 224 / param1.field_j.length;
                      return var2;
                    } else {
                      if (param1.field_j[var4].field_c) {
                        var3++;
                        var4++;
                        continue L22;
                      } else {
                        var4++;
                        continue L22;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L23: while (true) {
                    if (param1.field_j.length <= var4) {
                      var2 = var2 + var3 * 224 / param1.field_j.length;
                      return var2;
                    } else {
                      if (param1.field_j[var4].field_c) {
                        var3++;
                        var4++;
                        continue L23;
                      } else {
                        var4++;
                        continue L23;
                      }
                    }
                  }
                }
              }
            } else {
              var2 = 0;
              if (0 != param1.field_o) {
                if (param1.field_o == 1) {
                  if (!a.field_F.b((byte) 10)) {
                    if (!hf.field_h.b((byte) 10)) {
                      var3 = 0;
                      var4 = 0;
                      L24: while (true) {
                        if (param1.field_j.length <= var4) {
                          var2 = var2 + var3 * 224 / param1.field_j.length;
                          return var2;
                        } else {
                          if (param1.field_j[var4].field_c) {
                            var3++;
                            var4++;
                            continue L24;
                          } else {
                            var4++;
                            continue L24;
                          }
                        }
                      }
                    } else {
                      var2 += 16;
                      var3 = 0;
                      var4 = 0;
                      L25: while (true) {
                        if (param1.field_j.length <= var4) {
                          var2 = var2 + var3 * 224 / param1.field_j.length;
                          return var2;
                        } else {
                          if (param1.field_j[var4].field_c) {
                            var3++;
                            var4++;
                            continue L25;
                          } else {
                            var4++;
                            continue L25;
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      var2 += 16;
                      if (hf.field_h.b((byte) 10)) {
                        var2 += 16;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    var3 = 0;
                    var4 = 0;
                    L27: while (true) {
                      if (param1.field_j.length <= var4) {
                        var2 = var2 + var3 * 224 / param1.field_j.length;
                        return var2;
                      } else {
                        if (param1.field_j[var4].field_c) {
                          var3++;
                          var4++;
                          continue L27;
                        } else {
                          var4++;
                          continue L27;
                        }
                      }
                    }
                  }
                } else {
                  if (2 != param1.field_o) {
                    if (-4 == (param1.field_o ^ -1)) {
                      if (!kc.field_b.b((byte) 10)) {
                        if (ug.field_b.b((byte) 10)) {
                          var2 += 16;
                          var3 = 0;
                          var4 = 0;
                          L28: while (true) {
                            if (param1.field_j.length <= var4) {
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              if (param1.field_j[var4].field_c) {
                                var3++;
                                var4++;
                                continue L28;
                              } else {
                                var4++;
                                continue L28;
                              }
                            }
                          }
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L29: while (true) {
                            if (param1.field_j.length <= var4) {
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              if (param1.field_j[var4].field_c) {
                                var3++;
                                var4++;
                                continue L29;
                              } else {
                                var4++;
                                continue L29;
                              }
                            }
                          }
                        }
                      } else {
                        L30: {
                          var2 += 16;
                          if (!ug.field_b.b((byte) 10)) {
                            break L30;
                          } else {
                            var2 += 16;
                            break L30;
                          }
                        }
                        var3 = 0;
                        var4 = 0;
                        L31: while (true) {
                          if (param1.field_j.length <= var4) {
                            var2 = var2 + var3 * 224 / param1.field_j.length;
                            return var2;
                          } else {
                            if (param1.field_j[var4].field_c) {
                              var3++;
                              var4++;
                              continue L31;
                            } else {
                              var4++;
                              continue L31;
                            }
                          }
                        }
                      }
                    } else {
                      if (4 != param1.field_o) {
                        if (5 != param1.field_o) {
                          if (param1.field_o == 6) {
                            L32: {
                              if (hg.field_Q.b((byte) 10)) {
                                var2 += 16;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            if (!fd.field_e.b((byte) 10)) {
                              L33: {
                                var3 = 0;
                                var4 = 0;
                                if (param1.field_j.length <= var4) {
                                  break L33;
                                } else {
                                  L34: {
                                    if (param1.field_j[var4].field_c) {
                                      var3++;
                                      break L34;
                                    } else {
                                      var4++;
                                      break L34;
                                    }
                                  }
                                  var4++;
                                  var4++;
                                  var4++;
                                  break L33;
                                }
                              }
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              L35: {
                                var2 += 16;
                                var3 = 0;
                                var4 = 0;
                                if (param1.field_j.length <= var4) {
                                  break L35;
                                } else {
                                  L36: {
                                    if (param1.field_j[var4].field_c) {
                                      var3++;
                                      break L36;
                                    } else {
                                      var4++;
                                      break L36;
                                    }
                                  }
                                  var4++;
                                  var4++;
                                  var4++;
                                  break L35;
                                }
                              }
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            }
                          } else {
                            var3 = 0;
                            var4 = 0;
                            L37: while (true) {
                              if (param1.field_j.length <= var4) {
                                var2 = var2 + var3 * 224 / param1.field_j.length;
                                return var2;
                              } else {
                                if (param1.field_j[var4].field_c) {
                                  var3++;
                                  var4++;
                                  continue L37;
                                } else {
                                  var4++;
                                  continue L37;
                                }
                              }
                            }
                          }
                        } else {
                          L38: {
                            if (!ha.field_i.b((byte) 10)) {
                              break L38;
                            } else {
                              var2 += 16;
                              break L38;
                            }
                          }
                          if (kc.field_b.b((byte) 10)) {
                            var2 += 16;
                            var3 = 0;
                            var4 = 0;
                            L39: while (true) {
                              if (param1.field_j.length <= var4) {
                                var2 = var2 + var3 * 224 / param1.field_j.length;
                                return var2;
                              } else {
                                if (param1.field_j[var4].field_c) {
                                  var3++;
                                  var4++;
                                  continue L39;
                                } else {
                                  var4++;
                                  continue L39;
                                }
                              }
                            }
                          } else {
                            var3 = 0;
                            var4 = 0;
                            L40: while (true) {
                              if (param1.field_j.length <= var4) {
                                var2 = var2 + var3 * 224 / param1.field_j.length;
                                return var2;
                              } else {
                                if (param1.field_j[var4].field_c) {
                                  var3++;
                                  var4++;
                                  continue L40;
                                } else {
                                  var4++;
                                  continue L40;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L41: {
                          if (ug.field_b.b((byte) 10)) {
                            var2 += 16;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        if (ha.field_i.b((byte) 10)) {
                          var2 += 16;
                          var3 = 0;
                          var4 = 0;
                          L42: while (true) {
                            if (param1.field_j.length <= var4) {
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              if (param1.field_j[var4].field_c) {
                                var3++;
                                var4++;
                                continue L42;
                              } else {
                                var4++;
                                continue L42;
                              }
                            }
                          }
                        } else {
                          var3 = 0;
                          var4 = 0;
                          L43: while (true) {
                            if (param1.field_j.length <= var4) {
                              var2 = var2 + var3 * 224 / param1.field_j.length;
                              return var2;
                            } else {
                              if (param1.field_j[var4].field_c) {
                                var3++;
                                var4++;
                                continue L43;
                              } else {
                                var4++;
                                continue L43;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L44: {
                      if (a.field_F.b((byte) 10)) {
                        var2 += 16;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    if (lk.field_a.b((byte) 10)) {
                      var2 += 16;
                      var3 = 0;
                      var4 = 0;
                      L45: while (true) {
                        if (param1.field_j.length <= var4) {
                          var2 = var2 + var3 * 224 / param1.field_j.length;
                          return var2;
                        } else {
                          if (param1.field_j[var4].field_c) {
                            var3++;
                            var4++;
                            continue L45;
                          } else {
                            var4++;
                            continue L45;
                          }
                        }
                      }
                    } else {
                      var3 = 0;
                      var4 = 0;
                      L46: while (true) {
                        if (param1.field_j.length <= var4) {
                          var2 = var2 + var3 * 224 / param1.field_j.length;
                          return var2;
                        } else {
                          if (param1.field_j[var4].field_c) {
                            var3++;
                            var4++;
                            continue L46;
                          } else {
                            var4++;
                            continue L46;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L47: {
                  if (ol.field_h.b((byte) 10)) {
                    var2 += 16;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                if (fd.field_e.b((byte) 10)) {
                  var2 += 16;
                  var3 = 0;
                  var4 = 0;
                  L48: while (true) {
                    if (param1.field_j.length <= var4) {
                      var2 = var2 + var3 * 224 / param1.field_j.length;
                      return var2;
                    } else {
                      if (param1.field_j[var4].field_c) {
                        var3++;
                        var4++;
                        continue L48;
                      } else {
                        var4++;
                        continue L48;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L49: while (true) {
                    if (param1.field_j.length <= var4) {
                      var2 = var2 + var3 * 224 / param1.field_j.length;
                      return var2;
                    } else {
                      if (param1.field_j[var4].field_c) {
                        var3++;
                        var4++;
                        continue L49;
                      } else {
                        var4++;
                        continue L49;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final mg[] a(int param0) {
        hj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        hj[] var5 = null;
        hj[] var6 = null;
        hj[] var7 = null;
        var4 = HoldTheLine.field_D;
        if (param0 == 16) {
          if (((kg) this).field_d == null) {
            var7 = le.a(((kg) this).field_f, -120);
            var5 = var7;
            var2 = var5;
            if (var2 == null) {
              return ((kg) this).field_d;
            } else {
              ((kg) this).field_d = new mg[var7.length];
              var3 = 0;
              L0: while (true) {
                if (var7.length <= var3) {
                  return ((kg) this).field_d;
                } else {
                  ((kg) this).field_d[var3] = new mg(var7[var3], ((kg) this).field_b, ((kg) this).field_c, ((kg) this).field_e);
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return ((kg) this).field_d;
          }
        } else {
          ((kg) this).field_d = null;
          if (((kg) this).field_d == null) {
            var6 = le.a(((kg) this).field_f, -120);
            var5 = var6;
            var2 = var5;
            if (var2 != null) {
              ((kg) this).field_d = new mg[var6.length];
              var3 = 0;
              L1: while (true) {
                if (var6.length > var3) {
                  ((kg) this).field_d[var3] = new mg(var6[var3], ((kg) this).field_b, ((kg) this).field_c, ((kg) this).field_e);
                  var3++;
                  continue L1;
                } else {
                  return ((kg) this).field_d;
                }
              }
            } else {
              return ((kg) this).field_d;
            }
          } else {
            return ((kg) this).field_d;
          }
        }
    }

    kg(String param0) {
        ((kg) this).field_d = null;
        ((kg) this).field_b = 4096;
        ((kg) this).field_c = false;
        ((kg) this).field_f = param0;
        ((kg) this).field_e = false;
    }

    kg(String param0, boolean param1, boolean param2) {
        ((kg) this).field_f = param0;
        ((kg) this).field_d = null;
        ((kg) this).field_b = 4096;
        ((kg) this).field_e = param2 ? true : false;
        ((kg) this).field_c = param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new e(9, 0, 4, 1);
    }
}
