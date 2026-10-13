/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    private EditableTextWidget emailInput;
    private EditableTextWidget accountNameInput;
    static int field_j;

    final String describeText(byte obfuscationGuard, String text) {
        RuntimeException failure = null;
        String lowerPassword = null;
        String passwordAlias = null;
        String lowerName = null;
        Object emptyDiagnostic = null;
        String lengthDiagnostic = null;
        String characterDiagnostic = null;
        String repeatedCharacterDiagnostic = null;
        String emailDiagnostic = null;
        String validNoNameDiagnostic = null;
        String nameContainedDiagnostic = null;
        String passwordContainedDiagnostic = null;
        String compactNameDiagnostic = null;
        String validDiagnostic = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 89) {
            PasswordValidator.a(false, -126, -33, 30, 79, -34, 49, -91, -77);
          }
          lowerName = this.accountNameInput.text.toLowerCase();
          lowerPassword = text.toLowerCase();
          if (0 == lowerPassword.length()) {
            emptyDiagnostic = null;
            return (String) (emptyDiagnostic);
          }
          passwordAlias = lowerPassword;
          if (pd.hasInvalidPasswordLength(passwordAlias, 0)) {
            lengthDiagnostic = SocialListPanel.field_Pb;
            return lengthDiagnostic;
          }
          if (ab.containsNonAlphanumeric(passwordAlias, 0)) {
            characterDiagnostic = CommunityTabGroup.field_c;
            return characterDiagnostic;
          }
          if (ph.isAllSameCharacter(passwordAlias, (byte) 113)) {
            repeatedCharacterDiagnostic = CampaignMenu.field_v;
            return repeatedCharacterDiagnostic;
          }
          if (this.containsEmailComponent(text, 127)) {
            emailDiagnostic = SoundCache.field_d;
            return emailDiagnostic;
          }
          if (lowerName.length() <= 0) {
            validNoNameDiagnostic = ChannelGainProfile.field_b;
            return validNoNameDiagnostic;
          }
          if (DebouncedValidator.passwordContainsNameVariant(lowerName, passwordAlias, -76)) {
            nameContainedDiagnostic = de.field_c;
            return nameContainedDiagnostic;
          }
          if (e.nameContainsPasswordVariant(-110, lowerName, passwordAlias)) {
            passwordContainedDiagnostic = er.field_b;
            return passwordContainedDiagnostic;
          }
          if (!Battlefield.passwordContainsCompactNameVariant(passwordAlias, (byte) -26, lowerName)) {
            validDiagnostic = SocialListPanel.field_Pb;
            return validDiagnostic;
          }
          compactNameDiagnostic = de.field_c;
          return compactNameDiagnostic;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_37_0 = failure;
          stackIn_37_1 = new StringBuilder().append("ib.O(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final ValidationState validateText(int obfuscationGuard, String text) {
        String lowerName = null;
        RuntimeException failure = null;
        String lowerPassword = null;
        ValidationState emptyInvalidState = null;
        ValidationState nameInvalidState = null;
        ValidationState emailInvalidState = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lowerName = this.accountNameInput.text.toLowerCase();
          lowerPassword = text.toLowerCase();
          if (lowerPassword.length() == 0) {
            emptyInvalidState = rn.validationInvalid;
            return emptyInvalidState;
          }
          if (obfuscationGuard != -3137) {
            field_j = 109;
          }
          if (!RegistrationAgreementPane.isPasswordAllowedForName(lowerPassword, lowerName, false)) {
            nameInvalidState = rn.validationInvalid;
            return nameInvalidState;
          }
          if (!this.containsEmailComponent(text, 127)) {
            return oo.validationValid;
          }
          emailInvalidState = rn.validationInvalid;
          return emailInvalidState;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_15_0 = failure;
          stackIn_15_1 = new StringBuilder().append("ib.R(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        boolean stackIn_35_2 = false;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3 = 0;
        IndexedSprite stackIn_62_0;
        int stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_63_4;
        IndexedSprite stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_69_3;
        IndexedSprite stackIn_72_0 = null;
        int stackIn_73_1 = 0;
        IndexedSprite stackIn_76_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        boolean stackIn_88_2 = false;
        int stackIn_115_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime1Lifetime1;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9_int = fs.a(param3, 24340, param2, param8, param4, param5, param1);
          fe.a(param2, param8, param5, param1, EffectPresentation.field_j, AgeValidator.field_k, 0, 128, false);
          fe.a(param2 + 4, param8 + 4, param5 - 8, 40, EffectPresentation.field_j, AgeValidator.field_k, 0, 128, false);
          fe.a(param2 + 4, -40 + (param1 + param8 - 4), -8 + param5, 40, EffectPresentation.field_j, AgeValidator.field_k, 0, 128, false);
          if (var9_int == -3 &&
            param3 - param8 < 40 &&
            0 < dd.field_e) {
            if (!param0) {
              fe.a(8 + param2, param8 + 8, param5 - 16, 32, DisplacedUnitMarker.field_s, TutorialController.field_e, 0, 128, true);
            } else {
              fe.a(param2 + 8, param8 + 8, param5 - 16, 32, DisplacedUnitMarker.field_s, ConsoleValue.field_b, 0, 128, true);
            }
          } else {
            fe.a(8 + param2, 8 + param8, -16 + param5, 32, DisplacedUnitMarker.field_s, AgeValidator.field_k, 0, 128, true);
          }
          if (var9_int == -3 &&
            -param8 + param3 + 40 > param1 &&
            uk.field_q > dd.field_e) {
            if (param0) {
              fe.a(param2 + 8, param8 + (param1 - 40), -16 + param5, 32, DisplacedUnitMarker.field_s, ConsoleValue.field_b, 0, 128, true);
            } else {
              fe.a(8 + param2, -40 + param1 + param8, -16 + param5, 32, DisplacedUnitMarker.field_s, TutorialController.field_e, 0, 128, true);
            }
          } else {
            fe.a(8 + param2, -40 + param1 + param8, param5 - 16, 32, DisplacedUnitMarker.field_s, AgeValidator.field_k, 0, 128, true);
          }
          ClientConnectionState.field_a.e(param2 + ((param5 >> 1) - 29), param8 + 14, 128);
          ClientConnectionState.field_a.e(11 + ((param5 >> 1) + param2), 14 + param8, 128);
          ClientConnectionState.field_a.c();
          ClientConnectionState.field_a.e(-29 + param2 + (param5 >> 1), param7 + (param1 + param8 + 9), 128);
          ClientConnectionState.field_a.e(11 + ((param5 >> 1) + param2), 9 + param1 + (param8 - 40), 128);
          ClientConnectionState.field_a.c();
          if (AccountRegistrationForm.field_X < 0) {
            stackIn_18_0 = var9_int;
            return stackIn_18_0;
          }
          var10 = param8 - (dd.field_e - 44);
          var11 = 0;
          if (od.field_c[AccountRegistrationForm.field_X]) {
            var11 = -1;
          }
          var12_int = 0;
          scanLoop1: while (true) {
            stackIn_25_0 = (!od.field_c[AccountRegistrationForm.field_X]) ? 0 : 1;
            if (stackIn_25_0 + SectorCacheStore.field_j[AccountRegistrationForm.field_X].length > var12_int) {
              SoftwareRaster.setClip(8 + param2, 44 + param8, param2 + param5 - 8, param1 + (param8 - 40 - 4));
              if (var12_int % 2 != 1) {
                stackIn_29_0 = 0;
              } else {
                stackIn_29_0 = param5 / 2 - 7;
              }
              var13 = stackIn_29_0 + (param2 + 8);
              var14 = 1 + var10;
              if (var11 != param6) {
                if (var9_int == var11) {
                  stackIn_40_0 = AccountRegistrationForm.field_X;
                  stackIn_40_1 = pg.playerProfile.getUnlockLevel(param7 ^ -40);
                  stackIn_41_2 = !(2 > BufferedSocket.field_j);
                  if (!BufferedFile.a(stackIn_40_0, stackIn_40_1, stackIn_41_2, var11, -1208926000, BoundedFile.field_e[0])) {
                    fe.a(var13, var14, (param5 >> 1) - 9, 78, MusicPatch.field_m, MoveAttackAction.field_x, 0, 128, false);
                  } else {
                    fe.a(var13, var14, -9 + (param5 >> 1), 78, MusicPatch.field_m, TutorialController.field_e, 0, 128, false);
                  }
                } else {
                  stackIn_34_0 = AccountRegistrationForm.field_X;
                  stackIn_34_1 = pg.playerProfile.getUnlockLevel(0);
                  stackIn_35_2 = !(BufferedSocket.field_j < 2);
                  if (!BufferedFile.a(stackIn_34_0, stackIn_34_1, stackIn_35_2, var11, -1208926000, BoundedFile.field_e[0])) {
                    fe.a(var13, var14, (param5 >> 1) - 9, 78, MusicPatch.field_m, dh.field_l, 0, 128, false);
                  } else {
                    fe.a(var13, var14, -9 + (param5 >> 1), 78, MusicPatch.field_m, AgeValidator.field_k, 0, 128, false);
                  }
                }
              } else {
                fe.a(var13, var14, (param5 >> 1) - 9, 78, MusicPatch.field_m, ConsoleValue.field_b, 0, 128, false);
              }
              if (var12_int % 2 != 1) {
                stackIn_47_0 = 0;
              } else {
                stackIn_47_0 = param5 / 2 - 7;
              }
              var15 = stackIn_47_0 + (11 + param2);
              if (44 + param8 >= var14) {
                stackIn_50_0 = param8 + 40 + 4;
              } else {
                stackIn_50_0 = var14;
              }
              var16 = stackIn_50_0;
              stackIn_52_0 = var15;
              stackIn_52_1 = var16;
              stackIn_52_2 = -15 + ((param5 >> 1) + var15);
              if (78 + var16 < param8 + param1 - 40 - 4) {
                stackIn_53_3 = var16 + 78;
              } else {
                stackIn_53_3 = -44 + (param8 + param1);
              }
              SoftwareRaster.setClip(stackIn_52_0, stackIn_52_1, stackIn_52_2, stackIn_53_3);
              if ((uh.field_e[AccountRegistrationForm.field_X][1] >> 1) + var10 >= 0) {
                if (var11 > -1) {
                  if (AccountRegistrationForm.field_X != 1) {
                    if (AccountRegistrationForm.field_X == 2) {
                      stackIn_76_0 = SectorCacheStore.field_j[2][var11];
                      if (var12_int % 2 == 0) {
                        stackIn_77_1 = 0;
                      } else {
                        stackIn_77_1 = param5 / 2;
                      }
                      ((IndexedSprite) (Object) stackIn_76_0).c(stackIn_77_1 + (param5 / 4 + param2) - (uh.field_e[2][0] >> 3), 40 + (var10 - (uh.field_e[2][1] >> 3)));
                    } else {
                      if (AccountRegistrationForm.field_X == 3) {
                        stackIn_72_0 = SectorCacheStore.field_j[3][var11];
                        if (var12_int % 2 != 0) {
                          stackIn_73_1 = param5 / 2;
                        } else {
                          stackIn_73_1 = 0;
                        }
                        ((IndexedSprite) (Object) stackIn_72_0).draw(stackIn_73_1 - (uh.field_e[3][0] >> 3) + param2 + param5 / 4, -(uh.field_e[3][1] >> 1) + (40 + var10));
                      } else {
                        stackIn_68_0 = SectorCacheStore.field_j[AccountRegistrationForm.field_X][var11];
                        stackIn_68_1 = param5 / 4 + param2;
                        stackIn_68_2 = uh.field_e[AccountRegistrationForm.field_X][0] / 4;
                        if (var12_int % 2 != 0) {
                          stackIn_69_3 = param5 / 2;
                        } else {
                          stackIn_69_3 = 0;
                        }
                        ((IndexedSprite) (Object) stackIn_68_0).d(stackIn_68_1 - (stackIn_68_2 - stackIn_69_3), var10 + 40 - (uh.field_e[AccountRegistrationForm.field_X][1] >> 2));
                      }
                    }
                  } else {
                    stackIn_62_0 = SectorCacheStore.field_j[1][var11];
                    stackIn_62_1 = param2;
                    stackIn_62_2 = param5 / 4;
                    stackIn_62_3 = uh.field_e[1][0] >> 3;
                    if (0 != var12_int % 2) {
                      stackIn_63_4 = param5 / 2;
                    } else {
                      stackIn_63_4 = 0;
                    }
                    ((IndexedSprite) (Object) stackIn_62_0).c(stackIn_62_1 + (stackIn_62_2 - (stackIn_62_3 - stackIn_63_4)), 40 + (var10 - (uh.field_e[1][1] >> 3)));
                  }
                }
                if (MatchConditionEntry.a(80 + param1, (byte) 94) < var10) {
                  break scanLoop1;
                }
                if (1 == var12_int % 2) {
                  var10 += 80;
                }
                SoftwareRaster.setClip(param2 + 8, 40 + param8 + 4, param2 + param5 - 8, -4 + param8 - (-param1 + 40));
                var11++;
              } else {
                var11++;
                if (var12_int % 2 == 1) {
                  var10 += 80;
                }
              }
              var12_int++;
              continue;
            }
            break;
          }
          SoftwareRaster.a();
          if (AccountRegistrationForm.field_X > -1) {
            stackIn_87_0 = AccountRegistrationForm.field_X;
            stackIn_87_1 = pg.playerProfile.getUnlockLevel(0);
            stackIn_88_2 = !(BufferedSocket.field_j < 2);
            if (!BufferedFile.a(stackIn_87_0, stackIn_87_1, stackIn_88_2, var9_int, -1208926000, BoundedFile.field_e[0])) {
              param4 += 10;
              param3 += 30;
              var12 = null;
              if (el.field_f[AccountRegistrationForm.field_X][var9_int] <= pg.playerProfile.getUnlockLevel(param7 ^ -40)) {
                if (ve.field_a[AccountRegistrationForm.field_X][var9_int] < 0) {
                  var12 = "Unavailable to lowly players";
                } else {
                  if ((ve.field_a[AccountRegistrationForm.field_X][var9_int] & 504) != 504) {
                    var13Lifetime1 = 0;
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (16 > var18) {
                      if (0 != (1 << var18 & ve.field_a[AccountRegistrationForm.field_X][var9_int])) {
                        if (var13Lifetime1 != 0 &&
                          var12 != null) {
                          var12 = EmailCheckResult.a(param7 + 4840, ModalDialogHost.field_L, new String[]{(String) (var12), so.field_a[var18]});
                        } else {
                          var12 = so.field_a[var18];
                        }
                        var13Lifetime1 = 1;
                      }
                      var18++;
                    }
                  } else {
                    var12 = vs.field_i;
                  }
                }
              } else {
                var12 = EmailCheckResult.a(4800, VerticalScrollbar.field_Jb, new String[]{Integer.toString(el.field_f[AccountRegistrationForm.field_X][var9_int])});
              }
              if (var12 != null) {
                var19 = EmailCheckResult.a(4800, BattlefieldTheme.field_s, new String[]{(String) (var12)});
                var12 = var19;
                var13Lifetime1Lifetime1 = DateInputWidget.field_E.textWidth(var19);
                if (var13Lifetime1Lifetime1 + param4 > db.a(true, 620)) {
                  param4 = db.a(true, 620) - var13Lifetime1Lifetime1;
                }
                if (10 + param3 > MatchConditionEntry.a(480, (byte) 94)) {
                  param3 -= 30;
                }
                SoftwareRaster.a(-6 + param4, param3 - 11, var13Lifetime1Lifetime1 + 12, 15, 5, 0, 128);
                DateInputWidget.field_E.drawText((String) (var12), param4, param3, 16777215, -1);
              }
            }
          }
          stackIn_115_0 = var9_int;
          return stackIn_115_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var9), "ib.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final boolean containsEmailComponent(String password, int obfuscationGuard) {
        String lowerEmail = null;
        RuntimeException failure = null;
        String lowerPassword = null;
        int guardQuotient = 0;
        int atIndex = 0;
        String localPart = null;
        String domain = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lowerEmail = this.emailInput.text.toLowerCase();
          lowerPassword = password.toLowerCase();
          guardQuotient = 53 / ((82 - obfuscationGuard) / 44);
          if (lowerEmail.length() > 0) {
            if (lowerPassword.length() <= 0) {
              return false;
            }
            atIndex = lowerEmail.lastIndexOf("@");
            if (atIndex >= 0 &&
              atIndex < lowerEmail.length() - 1) {
              localPart = lowerEmail.substring(0, atIndex);
              domain = lowerEmail.substring(atIndex + 1);
              if (0 <= lowerPassword.indexOf(localPart)) {
                return true;
              }
              if (lowerPassword.indexOf(domain) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_16_0 = failure;
          stackIn_16_1 = new StringBuilder().append("ib.N(");
          if (password == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    PasswordValidator(EditableTextWidget input, EditableTextWidget accountNameInput, EditableTextWidget emailInput) {
        super(input);
        try {
          this.emailInput = emailInput;
          this.accountNameInput = accountNameInput;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ib.<init>(" + (input != null ? "{...}" : "null") + ',' + (accountNameInput != null ? "{...}" : "null") + ',' + (emailInput != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 40) {
          PasswordValidator.a(127, true, 27, -95);
        }
        if (!BattleTutorial.quickChatMenuVisible) {
          return;
        }
        OwnerChangeEvent.quickChatMenuHost.updateInput(true, param1);
        int var4 = RegistrationAgreementPane.activeQuickChatMenu.hasPressedItem((byte) 91) ? 1 : 0;
        if (DeployEvent.pointerPressButton != 0 &&
          var4 == 0) {
          param1 = false;
          DelayedPacket.e(-3);
        }
        if (param1) {
          RegistrationAgreementPane.activeQuickChatMenu.advanceMenu(param3, (byte) -42, param2);
        }
        if (var4 != 0) {
          OwnerChangeEvent.quickChatMenuHost.updateInput(true, param1);
        }
        int var5 = RegistrationAgreementPane.activeQuickChatMenu.getOpenMenuWidth((byte) -123) + RegistrationAgreementPane.activeQuickChatMenu.screenX;
        if (var5 > 640) {
          TelefragEvent.field_z = TelefragEvent.field_z + 5;
        } else {
          if (635 > var5 &&
            !(0 >= TelefragEvent.field_z)) {
            TelefragEvent.field_z = TelefragEvent.field_z - 5;
          }
        }
    }

    static {
    }
}
