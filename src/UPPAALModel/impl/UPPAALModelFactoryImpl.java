/**
 */
package UPPAALModel.impl;

import UPPAALModel.Declaration;
import UPPAALModel.Init;
import UPPAALModel.Label;
import UPPAALModel.Location;
import UPPAALModel.Name;
import UPPAALModel.Parameter;
import UPPAALModel.Source;
import UPPAALModel.Target;
import UPPAALModel.Template;
import UPPAALModel.Transition;
import UPPAALModel.UPPAALModelFactory;
import UPPAALModel.UPPAALModelPackage;
import UPPAALModel.nta;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UPPAALModelFactoryImpl extends EFactoryImpl implements UPPAALModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UPPAALModelFactory init() {
		try {
			UPPAALModelFactory theUPPAALModelFactory = (UPPAALModelFactory)EPackage.Registry.INSTANCE.getEFactory(UPPAALModelPackage.eNS_URI);
			if (theUPPAALModelFactory != null) {
				return theUPPAALModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UPPAALModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPPAALModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UPPAALModelPackage.NTA: return createnta();
			case UPPAALModelPackage.TEMPLATE: return createTemplate();
			case UPPAALModelPackage.NAME: return createName();
			case UPPAALModelPackage.PARAMETER: return createParameter();
			case UPPAALModelPackage.INIT: return createInit();
			case UPPAALModelPackage.DECLARATION: return createDeclaration();
			case UPPAALModelPackage.LOCATION: return createLocation();
			case UPPAALModelPackage.TRANSITION: return createTransition();
			case UPPAALModelPackage.SOURCE: return createSource();
			case UPPAALModelPackage.TARGET: return createTarget();
			case UPPAALModelPackage.LABEL: return createLabel();
			case UPPAALModelPackage.SYSTEM: return createSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nta createnta() {
		ntaImpl nta = new ntaImpl();
		return nta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init createInit() {
		InitImpl init = new InitImpl();
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPPAALModel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPPAALModelPackage getUPPAALModelPackage() {
		return (UPPAALModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UPPAALModelPackage getPackage() {
		return UPPAALModelPackage.eINSTANCE;
	}

} //UPPAALModelFactoryImpl
