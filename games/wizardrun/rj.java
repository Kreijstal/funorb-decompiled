/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    int field_c;
    int field_g;
    private boolean field_d;
    private int field_e;
    static String[] field_f;
    private int field_b;
    private int field_a;
    private int field_h;

    final void a(int param0, int param1, boolean param2, int param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (param0 == -12785) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param2) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((rj) this).field_d = stackIn_5_1 != 0;
          ((rj) this).field_h = 0;
          if (!((rj) this).field_d) {
            ((rj) this).field_g = param3;
            return;
          } else {
            ((rj) this).field_g = param1;
            return;
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_f = null;
    }

    final static void a(String param0, String param1, boolean param2) {
        try {
            if (!(null == aa.field_lb)) {
                aa.field_lb.l(-27697);
            }
            r.field_b = new qc(param1, param0, false, true, true);
            td.field_f.c((ub) (Object) r.field_b, -111);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "rj.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 >= ((rj) this).field_c) {
          throw new IllegalArgumentException();
        } else {
          if (~((rj) this).field_c < ~param2) {
            ((rj) this).field_e = 0;
            ((rj) this).field_b = 0;
            if (w.field_c == 0) {
              L0: {
                var4 = -3 % ((-4 - param1) / 32);
                if (((rj) this).field_h == 0) {
                  break L0;
                } else {
                  if (sh.field_c == 0) {
                    break L0;
                  } else {
                    L1: {
                      if (0 >= ((rj) this).field_a) {
                        ((rj) this).field_a = vc.field_G;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((rj) this).field_a = ((rj) this).field_a - 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (w.field_c != 0) {
                  break L2;
                } else {
                  if (sh.field_c != 0) {
                    break L2;
                  } else {
                    ((rj) this).field_h = 0;
                    if (((rj) this).field_h != 0) {
                      return;
                    } else {
                      L3: {
                        if (((rj) this).field_d) {
                          break L3;
                        } else {
                          if (ih.field_a) {
                            break L3;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param0 >= 0) {
                        if (((rj) this).field_g != param0) {
                          ((rj) this).field_g = param0;
                          ((rj) this).field_d = true;
                          return;
                        } else {
                          ((rj) this).field_g = param0;
                          ((rj) this).field_d = true;
                          return;
                        }
                      } else {
                        if (((rj) this).field_d) {
                          ((rj) this).field_g = -1;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (((rj) this).field_h != 0) {
                return;
              } else {
                L4: {
                  if (((rj) this).field_d) {
                    break L4;
                  } else {
                    if (ih.field_a) {
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                if (param0 >= 0) {
                  if (((rj) this).field_g != param0) {
                    ((rj) this).field_g = param0;
                    ((rj) this).field_d = true;
                    return;
                  } else {
                    ((rj) this).field_g = param0;
                    ((rj) this).field_d = true;
                    return;
                  }
                } else {
                  if (((rj) this).field_d) {
                    ((rj) this).field_g = -1;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              ((rj) this).field_b = w.field_c;
              ((rj) this).field_a = hb.field_m;
              ((rj) this).field_d = true;
              ((rj) this).field_h = w.field_c;
              ((rj) this).field_g = param2;
              var4 = -3 % ((-4 - param1) / 32);
              if (((rj) this).field_h != 0) {
                if (sh.field_c != 0) {
                  L5: {
                    if (0 >= ((rj) this).field_a) {
                      ((rj) this).field_a = vc.field_G;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    ((rj) this).field_a = ((rj) this).field_a - 1;
                    if (w.field_c != 0) {
                      break L6;
                    } else {
                      if (sh.field_c != 0) {
                        break L6;
                      } else {
                        ((rj) this).field_h = 0;
                        break L6;
                      }
                    }
                  }
                  if (((rj) this).field_h != 0) {
                    return;
                  } else {
                    L7: {
                      if (((rj) this).field_d) {
                        break L7;
                      } else {
                        if (ih.field_a) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param0 >= 0) {
                      if (((rj) this).field_g != param0) {
                        ((rj) this).field_g = param0;
                        ((rj) this).field_d = true;
                        return;
                      } else {
                        ((rj) this).field_g = param0;
                        ((rj) this).field_d = true;
                        return;
                      }
                    } else {
                      if (((rj) this).field_d) {
                        ((rj) this).field_g = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L8: {
                    if (w.field_c != 0) {
                      break L8;
                    } else {
                      if (sh.field_c != 0) {
                        break L8;
                      } else {
                        ((rj) this).field_h = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (((rj) this).field_h != 0) {
                      break L9;
                    } else {
                      L10: {
                        if (((rj) this).field_d) {
                          break L10;
                        } else {
                          if (ih.field_a) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (param0 >= 0) {
                        if (((rj) this).field_g != param0) {
                          ((rj) this).field_g = param0;
                          ((rj) this).field_d = true;
                          return;
                        } else {
                          ((rj) this).field_g = param0;
                          ((rj) this).field_d = true;
                          return;
                        }
                      } else {
                        if (((rj) this).field_d) {
                          ((rj) this).field_g = -1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  if (w.field_c != 0) {
                    break L11;
                  } else {
                    if (sh.field_c != 0) {
                      break L11;
                    } else {
                      ((rj) this).field_h = 0;
                      break L11;
                    }
                  }
                }
                L12: {
                  if (((rj) this).field_h != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (((rj) this).field_d) {
                        break L13;
                      } else {
                        if (ih.field_a) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (param0 >= 0) {
                      if (((rj) this).field_g != param0) {
                        ((rj) this).field_g = param0;
                        ((rj) this).field_d = true;
                        return;
                      } else {
                        ((rj) this).field_g = param0;
                        ((rj) this).field_d = true;
                        return;
                      }
                    } else {
                      if (((rj) this).field_d) {
                        ((rj) this).field_g = -1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (((rj) this).field_b == 0) {
            if (84 != ((rj) this).field_e) {
              if (((rj) this).field_e == 83) {
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
          ((rj) this).a((byte) -122, 31);
          if (((rj) this).field_b == 0) {
            if (84 == ((rj) this).field_e) {
              return true;
            } else {
              L0: {
                if (((rj) this).field_e != 83) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0) {
        Object var3 = null;
        L0: {
          ((rj) this).field_e = 0;
          ((rj) this).field_b = 0;
          if (0 == ((rj) this).field_h) {
            ((rj) this).field_e = vk.field_r;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > 12) {
          L1: {
            if (0 != ((rj) this).field_h) {
              break L1;
            } else {
              if (vk.field_r != 98) {
                break L1;
              } else {
                if (((rj) this).field_g > 0) {
                  L2: {
                    ((rj) this).field_d = false;
                    ((rj) this).field_g = ((rj) this).field_g - 1;
                    if (((rj) this).field_h != 0) {
                      break L2;
                    } else {
                      if (vk.field_r == 99) {
                        ((rj) this).field_g = ((rj) this).field_g + 1;
                        ((rj) this).field_d = false;
                        if (((rj) this).field_c > ((rj) this).field_g) {
                          break L2;
                        } else {
                          ((rj) this).field_g = 0;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  ((rj) this).field_g = ((rj) this).field_c;
                  L3: {
                    ((rj) this).field_d = false;
                    ((rj) this).field_g = ((rj) this).field_g - 1;
                    if (((rj) this).field_h != 0) {
                      break L3;
                    } else {
                      if (vk.field_r == 99) {
                        ((rj) this).field_g = ((rj) this).field_g + 1;
                        ((rj) this).field_d = false;
                        if (((rj) this).field_c > ((rj) this).field_g) {
                          break L3;
                        } else {
                          ((rj) this).field_g = 0;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L4: {
            if (((rj) this).field_h != 0) {
              break L4;
            } else {
              if (vk.field_r == 99) {
                ((rj) this).field_g = ((rj) this).field_g + 1;
                ((rj) this).field_d = false;
                if (((rj) this).field_c > ((rj) this).field_g) {
                  break L4;
                } else {
                  ((rj) this).field_g = 0;
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          var3 = null;
          rj.a((String) null, (String) null, true);
          if (0 == ((rj) this).field_h) {
            if (vk.field_r == 98) {
              L5: {
                if (((rj) this).field_g > 0) {
                  ((rj) this).field_d = false;
                  ((rj) this).field_g = ((rj) this).field_g - 1;
                  break L5;
                } else {
                  ((rj) this).field_g = ((rj) this).field_c;
                  ((rj) this).field_d = false;
                  ((rj) this).field_g = ((rj) this).field_g - 1;
                  break L5;
                }
              }
              if (((rj) this).field_h == 0) {
                if (vk.field_r == 99) {
                  ((rj) this).field_g = ((rj) this).field_g + 1;
                  ((rj) this).field_d = false;
                  if (((rj) this).field_c > ((rj) this).field_g) {
                    return;
                  } else {
                    ((rj) this).field_g = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L6: {
                if (((rj) this).field_h != 0) {
                  break L6;
                } else {
                  if (vk.field_r == 99) {
                    ((rj) this).field_g = ((rj) this).field_g + 1;
                    ((rj) this).field_d = false;
                    if (((rj) this).field_c > ((rj) this).field_g) {
                      break L6;
                    } else {
                      ((rj) this).field_g = 0;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              return;
            }
          } else {
            L7: {
              if (((rj) this).field_h != 0) {
                break L7;
              } else {
                if (vk.field_r == 99) {
                  ((rj) this).field_g = ((rj) this).field_g + 1;
                  ((rj) this).field_d = false;
                  if (((rj) this).field_c > ((rj) this).field_g) {
                    break L7;
                  } else {
                    ((rj) this).field_g = 0;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            return;
          }
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        ((rj) this).field_e = 0;
        ((rj) this).field_b = 0;
        if (0 == ((rj) this).field_h) {
          if (vk.field_r == 96) {
            if (((rj) this).field_g > 0) {
              L0: {
                ((rj) this).field_d = false;
                ((rj) this).field_g = ((rj) this).field_g - 1;
                if (((rj) this).field_h == 0) {
                  ((rj) this).field_e = vk.field_r;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                var3 = -13 % ((param0 - 62) / 33);
                if (((rj) this).field_h != 0) {
                  break L1;
                } else {
                  if (vk.field_r != 97) {
                    break L1;
                  } else {
                    ((rj) this).field_g = ((rj) this).field_g + 1;
                    ((rj) this).field_d = false;
                    if (((rj) this).field_c > ((rj) this).field_g) {
                      break L1;
                    } else {
                      L2: {
                        ((rj) this).field_g = 0;
                        if (((rj) this).field_h != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (vk.field_r == 98) {
                              break L3;
                            } else {
                              if (vk.field_r != 99) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          if (((rj) this).field_g >= 0) {
                            ((rj) this).field_d = false;
                            return;
                          } else {
                            ((rj) this).field_g = param1;
                            ((rj) this).field_d = false;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L4: {
                if (((rj) this).field_h != 0) {
                  break L4;
                } else {
                  if (vk.field_r == 98) {
                    if (((rj) this).field_g >= 0) {
                      ((rj) this).field_d = false;
                      return;
                    } else {
                      ((rj) this).field_g = param1;
                      ((rj) this).field_d = false;
                      return;
                    }
                  } else {
                    if (vk.field_r != 99) {
                      break L4;
                    } else {
                      if (((rj) this).field_g >= 0) {
                        ((rj) this).field_d = false;
                        return;
                      } else {
                        ((rj) this).field_g = param1;
                        ((rj) this).field_d = false;
                        return;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              ((rj) this).field_g = ((rj) this).field_c;
              L5: {
                ((rj) this).field_d = false;
                ((rj) this).field_g = ((rj) this).field_g - 1;
                if (((rj) this).field_h == 0) {
                  ((rj) this).field_e = vk.field_r;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3 = -13 % ((param0 - 62) / 33);
              if (((rj) this).field_h == 0) {
                if (vk.field_r == 97) {
                  ((rj) this).field_g = ((rj) this).field_g + 1;
                  ((rj) this).field_d = false;
                  if (((rj) this).field_c > ((rj) this).field_g) {
                    L6: {
                      if (((rj) this).field_h != 0) {
                        break L6;
                      } else {
                        if (vk.field_r == 98) {
                          if (((rj) this).field_g >= 0) {
                            ((rj) this).field_d = false;
                            return;
                          } else {
                            ((rj) this).field_g = param1;
                            ((rj) this).field_d = false;
                            return;
                          }
                        } else {
                          if (vk.field_r != 99) {
                            break L6;
                          } else {
                            if (((rj) this).field_g >= 0) {
                              ((rj) this).field_d = false;
                              return;
                            } else {
                              ((rj) this).field_g = param1;
                              ((rj) this).field_d = false;
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ((rj) this).field_g = 0;
                    if (((rj) this).field_h == 0) {
                      if (vk.field_r == 98) {
                        if (((rj) this).field_g >= 0) {
                          ((rj) this).field_d = false;
                          return;
                        } else {
                          ((rj) this).field_g = param1;
                          ((rj) this).field_d = false;
                          return;
                        }
                      } else {
                        if (vk.field_r == 99) {
                          if (((rj) this).field_g >= 0) {
                            ((rj) this).field_d = false;
                            return;
                          } else {
                            ((rj) this).field_g = param1;
                            ((rj) this).field_d = false;
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
                } else {
                  L7: {
                    if (((rj) this).field_h != 0) {
                      break L7;
                    } else {
                      if (vk.field_r == 98) {
                        if (((rj) this).field_g >= 0) {
                          ((rj) this).field_d = false;
                          return;
                        } else {
                          ((rj) this).field_g = param1;
                          ((rj) this).field_d = false;
                          return;
                        }
                      } else {
                        if (vk.field_r != 99) {
                          break L7;
                        } else {
                          if (((rj) this).field_g >= 0) {
                            ((rj) this).field_d = false;
                            return;
                          } else {
                            ((rj) this).field_g = param1;
                            ((rj) this).field_d = false;
                            return;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  if (((rj) this).field_h != 0) {
                    break L8;
                  } else {
                    if (vk.field_r == 98) {
                      if (((rj) this).field_g >= 0) {
                        ((rj) this).field_d = false;
                        return;
                      } else {
                        ((rj) this).field_g = param1;
                        ((rj) this).field_d = false;
                        return;
                      }
                    } else {
                      if (vk.field_r != 99) {
                        break L8;
                      } else {
                        if (((rj) this).field_g >= 0) {
                          ((rj) this).field_d = false;
                          return;
                        } else {
                          ((rj) this).field_g = param1;
                          ((rj) this).field_d = false;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L9: {
              if (((rj) this).field_h == 0) {
                ((rj) this).field_e = vk.field_r;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var3 = -13 % ((param0 - 62) / 33);
              if (((rj) this).field_h != 0) {
                break L10;
              } else {
                if (vk.field_r != 97) {
                  break L10;
                } else {
                  ((rj) this).field_g = ((rj) this).field_g + 1;
                  ((rj) this).field_d = false;
                  if (((rj) this).field_c > ((rj) this).field_g) {
                    break L10;
                  } else {
                    L11: {
                      ((rj) this).field_g = 0;
                      if (((rj) this).field_h != 0) {
                        break L11;
                      } else {
                        if (vk.field_r == 98) {
                          if (((rj) this).field_g >= 0) {
                            ((rj) this).field_d = false;
                            return;
                          } else {
                            ((rj) this).field_g = param1;
                            ((rj) this).field_d = false;
                            return;
                          }
                        } else {
                          if (vk.field_r != 99) {
                            break L11;
                          } else {
                            if (((rj) this).field_g >= 0) {
                              ((rj) this).field_d = false;
                              return;
                            } else {
                              ((rj) this).field_g = param1;
                              ((rj) this).field_d = false;
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L12: {
              if (((rj) this).field_h != 0) {
                break L12;
              } else {
                if (vk.field_r == 98) {
                  if (((rj) this).field_g >= 0) {
                    ((rj) this).field_d = false;
                    return;
                  } else {
                    ((rj) this).field_g = param1;
                    ((rj) this).field_d = false;
                    return;
                  }
                } else {
                  if (vk.field_r != 99) {
                    break L12;
                  } else {
                    if (((rj) this).field_g >= 0) {
                      ((rj) this).field_d = false;
                      return;
                    } else {
                      ((rj) this).field_g = param1;
                      ((rj) this).field_d = false;
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          L13: {
            if (((rj) this).field_h == 0) {
              ((rj) this).field_e = vk.field_r;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            var3 = -13 % ((param0 - 62) / 33);
            if (((rj) this).field_h != 0) {
              break L14;
            } else {
              if (vk.field_r != 97) {
                break L14;
              } else {
                ((rj) this).field_g = ((rj) this).field_g + 1;
                ((rj) this).field_d = false;
                if (((rj) this).field_c > ((rj) this).field_g) {
                  break L14;
                } else {
                  L15: {
                    ((rj) this).field_g = 0;
                    if (((rj) this).field_h != 0) {
                      break L15;
                    } else {
                      L16: {
                        if (vk.field_r == 98) {
                          break L16;
                        } else {
                          if (vk.field_r != 99) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (((rj) this).field_g >= 0) {
                        ((rj) this).field_d = false;
                        return;
                      } else {
                        ((rj) this).field_g = param1;
                        ((rj) this).field_d = false;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L17: {
            if (((rj) this).field_h != 0) {
              break L17;
            } else {
              if (vk.field_r == 98) {
                if (((rj) this).field_g >= 0) {
                  ((rj) this).field_d = false;
                  return;
                } else {
                  ((rj) this).field_g = param1;
                  ((rj) this).field_d = false;
                  return;
                }
              } else {
                if (vk.field_r != 99) {
                  break L17;
                } else {
                  if (((rj) this).field_g >= 0) {
                    ((rj) this).field_d = false;
                    return;
                  } else {
                    ((rj) this).field_g = param1;
                    ((rj) this).field_d = false;
                    return;
                  }
                }
              }
            }
          }
          return;
        }
    }

    rj(int param0) {
        ((rj) this).field_g = 0;
        ((rj) this).field_d = false;
        ((rj) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
